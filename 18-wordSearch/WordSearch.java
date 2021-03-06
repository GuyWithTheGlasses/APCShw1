import java.util.*;
import java.io.*;

public class WordSearch{
    private char[][] board;
    private char[][] key;

    private Random rnd = new Random();
    private ArrayList<String> wordlist = new ArrayList<String>();
    private ArrayList<String> words = new ArrayList<String>();

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
    
    /* Not using the database of words yet, so this is here
      to allow manual input of words. */
    
    public void makeWordList(ArrayList<String> als){
	for(int i = 0 ; i < als.size() ; i++){
	    String s = (als.get(i)).toUpperCase();
	    wordlist.add(s);
	}
    }

    /*--------------------- AddWord Methods ---------------------*/

    public boolean check(String word, int row, int col, int direction){
	/*
	  Here we find the "total" length of the word; that is,
	  the farthest the word extends in its specified direction.
	  If that extends out of the board, then it's invalid.
	*/
	//System.out.println(word+" from ("+row+","+col+") in direction "+direction);
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

	try{
	    //Error check to see if word extends out of board.
	    if(lencheck < 0 || hgtcheck < 0 || 
	       lencheck > board[row].length || hgtcheck > board.length){
		throw new IndexOutOfBoundsException();
	    }
	} catch (IndexOutOfBoundsException e) {}
	    

	//Checks to see if word overlaps at any point	    
	boolean overlap = false;
	int r = row;
	int c = col;
	for(int i = 0 ; i < word.length() ; i++){
	    if(board[r][c] == word.charAt(i) ||
	       board[r][c] == '.'){
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
		throw new IllegalArgumentException();
	    }
	}
	return true;
    }

    public void addWordAllD(String word, int row, int col, int direction){
	/* 
	   Direction starts from 0 and rotates by 45 degrees 
	   counterclockwise for each increase of 1. For example, 2 is the 
	   upward direction, 5 is down and to the left, etc.
	*/
	if(check(word,row,col,direction)){
   
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
    }

    public boolean addWord(String word){

	String w = word.toUpperCase();
	int c = rnd.nextInt(board.length);
	int r = rnd.nextInt(board[0].length);
	int d = rnd.nextInt(8);
	try{
	    addWordAllD(w, r, c, d);
	}catch (IndexOutOfBoundsException e){
	    //System.out.println("Word "+w+" goes out of bounds.");
	    return false;
	}catch (IllegalArgumentException e){
	    //System.out.println("Word "+w+" overlaps improperly.");
	    return false;
	}
	//System.out.println("Added word successfully.");
	return true;  

    }

    /*--------------------------- Macro Methods --------------------------*/

    public void makeKey(){
	key = new char[board.length][board[0].length];
	for(int i = 0 ; i < board.length ; i++){
	    for(int j = 0 ; j < board[i].length ; j++){
		key[i][j] = board[i][j];
	    }
	}
    }

    public void buildPuzzle(int numwords){ 
	int i = 0 ;
	while(i < numwords){
	    int wordIndex = rnd.nextInt(wordlist.size());
	    String word = wordlist.get(wordIndex);
	    if(addWord(word)){
		words.add(word);
		wordlist.remove(wordIndex);
		i++;
	    }
	}
	makeKey();
	
	for(int j = 0 ; j < board.length ; j++){
	    for(int k = 0 ; k < board[j].length ; k++){
		if(board[j][k] == '.'){
		    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    board[j][k] = letters.charAt(rnd.nextInt(letters.length()));
		}
	    }
	}
	
    }

    public String getWords(){
	return ""+words;
    }
     
}
