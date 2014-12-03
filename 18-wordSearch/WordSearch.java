import java.util.*;

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
	   
	   ***This should no longer ever be an issue, as we now generate the
	   direction int using a Random.
	*/
	try{
	    if(direction < 0 || direction > 7){
		throw new IllegalArgumentException();
	    }
	} catch (IllegalArgumentException e){
	    System.out.println("Direction must be an int between 0 and 7, inclusive.");
	    System.exit(0);
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

	//Checks to see if word overlaps at any point
	boolean overlap = false;
	int r = row;
	int c = col;
	for(int i = 0 ; i < word.length() ; i++){
	    if( 
	       (board[r][c] == '.') ||
	       (board[r][c] == word.charAt(i)) 
		){
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
		overlap = true;
		break;
	    }
	}       

	try{	    	   
	    //Error check to see if word extends out of board.
	    if(lencheck < 0 || hgtcheck < 0 || 
	       lencheck > board[row].length || hgtcheck > board.length){
		throw new IndexOutOfBoundsException();
	    }
	    //Error check to see if word causes conflict with overlap.
	    if(overlap){
		throw new IndexOutOfBoundsException();
	    }    	    
	} catch (IndexOutOfBoundsException e){} 
	
    }	    

    public void addWordAllD(String word, int row, int col, int direction){
	/* 
	   Direction starts from 0 and rotates by 45 degrees 
	   counterclockwise for each increase of 1. For example, 2 is the 
	   upward direction, 5 is down and to the left, etc.
	*/
	check(word, row, col, direction);
	int r = row;
	int c = col;
	String w = word.toUpperCase();
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

    public boolean addWord(String w){

	Random rnd = new Random();
	int c = rnd.nextInt(board.length);
	int r = rnd.nextInt(board[0].length);
	int d = rnd.nextInt(8);
	try{
	    addWordAllD(w, r, c, d);
	}catch (IndexOutOfBoundsException e){
	    System.out.println("Failed to add word "+w.toUpperCase());
	    return false;
	}catch (IllegalArgumentException e){
	    return false;
	}
	System.out.println("Added word successfully.");
	return true;  

    }
    
}
