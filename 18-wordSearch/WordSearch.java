public class WordSearch{
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for(int i = 0 ; i < board.length ; i++){
	    for(int j = 0 ; j < board[i].length ; j++){
		board[i][j] = '.';
	    }
	}
    }

    public WordSearch(){
	this(20,40);
    }

    public String toString(){
	String s = "";
	for(int i = 0 ; i < board.length ; i++){
	    for(int j = 0 ; j < board[i].length ; j++){
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void check(String word, int row, int col, int direction){
	
	/* 
	   Direction starts from 0 and rotates by 45 degrees 
	   counterclockwise for each increase of 1. For example, 2 is the 
	   upward direction, 5 is down and to the left, etc.
	*/
	try{
	    if(direction < 0 || direction > 7){
		throw new IllegalArgumentException();
	    }
	} catch (IllegalArgumentException e){
	    System.out.println("Direction must be an int between 0 and 7, inclusive.");
	}
	
	/*
	  Here we find the "total" length of the word; that is,
	  the farthest the word extends in its specified direction.
	  If that extends out of the board, then it's invalid.
	*/
	int lencheck = word.length();
	int hgtcheck = word.length();
	//Direction checker, will use this a lot in different places
	if(direction == 0 || direction == 7 || direction == 1){
	    lencheck = col + lencheck;
	}
	if(direction == 2 || direction == 1 || direction == 3){
	    hgtcheck = row - hgtcheck;
	}
	if(direction == 4 || direction == 3 || direction == 5){
	    lencheck = col - lencheck;
	}
	if(direction == 6 || direction == 5 || direction == 7){
	    hgtcheck = row + hgtcheck;
	}

	String msg = "";
	try{
	    	    
	    //Checks to see if the word is too long.
	    if(lencheck < 0 || hgtcheck < 0 || 
	       lencheck > board.length || hgtcheck > board[row].length){
		
		msg = "word being too long.";
		throw new IndexOutOfBoundsException();
	    } 
	    
	    //Checks to see if the word cannot overlap at some location.
	    int r = row;
	    int c = col;
	    for(int i = 0 ; i < word.length() ; i++){
		if(board[r][c] == word.charAt(i) ||
		   board[r][c] == '\0'){
		    if(direction == 0 || direction == 7 || direction == 1){
			c++;
		    }
		    if(direction == 2 || direction == 1 || direction == 3){
		        r--;
		    }
		    if(direction == 4 || direction == 3 || direction == 5){
		        c--;
		    }
		    if(direction == 6 || direction == 5 || direction == 7){
		        r++;
		    }
		}
		else{
		    msg = "word causing improper overlap.";
		    throw new IndexOutOfBoundsException();		    
		}
	    }
	    
	} catch (IndexOutOfBoundsException e){
	    System.out.println("Word placement is invalid due to "+msg);
	} 
	
    }	    

    public void addWord(String word, int row, int col, int direction){
	/* 
	   Direction starts from 0 and rotates by 45 degrees 
	   counterclockwise for each increase of 1. For example, 2 is the 
	   upward direction, 5 is down and to the left, etc.
	*/
	check(word, row, col, direction);
	int r = row;
	int c = col;
	for(int i = 0 ; i < word.length() ; i++){
	    board[r][c] = word.charAt(i);
	    if(direction == 0 || direction == 7 || direction == 1){
		c++;
	    }
	    if(direction == 2 || direction == 1 || direction == 3){
		r--;
	    }
	    if(direction == 4 || direction == 3 || direction == 5){
		c--;
	    }
	    if(direction == 6 || direction == 5 || direction == 7){
		r++;
	    }
	}
    }
    
    public static void main(String[] args){
	WordSearch w = new WordSearch();

	//w.addWord("hello", 15, 20, 0);
	//w.addWord("look", 15, 18, 0); //overlap shouldn't be allowed
	//w.addWord("look", 15, 23, 0); //legal overlap
	//w.addWord("coffee", -3, 25, 4); //out of bounds
	w.addWord("tea", 15, 20, 8); //direction is not a valid int

	System.out.println(w.toString());
	
    }
    
}
