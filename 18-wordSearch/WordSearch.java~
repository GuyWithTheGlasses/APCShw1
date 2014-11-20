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

    public void boundCheck(int row, int col){

	try{

	    if(row < 0 || row > board.length){
		throw new IndexOutOfBoundsException();
	    }
	    if(col < 0 || col > board[row].length){
		throw new IndexOutOfBoundsException();
	    }

	} catch (IndexOutOfBoundsException e){}
	
    }
    

    public void addWordH(String w, int row, int col){

	boundCheck(row, col);
	int c = col;
	for(int i = 0 ; i < w.length() ; i++){
	    board[row][c] = w.charAt(i);
	    c++;
	}
	
    }
    
    public void addWordV(String w, int row, int col){
	
	boundCheck(row, col);
	int r = row;
	for(int i = 0 ; i < w.length() ; i++){
	    board[r][col] = w.charAt(i);
	    r++;
	}
	
    }

    public void addWordDownRight(String w, int row, int col){
	int r = row;
	int c= col;
	for(int i = 0 ; i < w.length() ; i++){
	    board[r][c] = w.charAt(i);
	    r++;
	    c++;
	}
    }
    public void addWordUpRight(String w, int row, int col){
	int r = row;
	int c= col;
	for(int i = 0 ; i < w.length() ; i++){
	    board[r][c] = w.charAt(i);
	    r--;
	    c++;
	}
    }
    public void addWordUpLeft(String w, int row, int col){
	int r = row;
	int c= col;
	for(int i = 0 ; i < w.length() ; i++){
	    board[r][c] = w.charAt(i);
	    r++;
	    c--;
	}
    }
    public void addWordDownLeft(String w, int row, int col){
	int r = row;
	int c= col;
	for(int i = 0 ; i < w.length() ; i++){
	    board[r][c] = w.charAt(i);
	    r--;
	    c--;
	}
    }
 
    
    public static void main(String[] args){
	WordSearch w = new WordSearch();

	w.addWordH("hello", 15, 20);
	//w.addWordH("look", 15, 18); //overlap shouldn't be allowed
	w.addWordH("look", 15, 23); //legal overlap
	//w.addWordH("coffee", -3, 25); //out of bounds
	//w.addWordH("tea", 15, 500); //out of bounds
	w.addWordV("cola", 4, 20);
	w.addWordDownRight("water", 2, 2);

	System.out.println(w.toString());
	
    }
    
}
