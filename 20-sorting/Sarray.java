import java.util.*;
import java.io.*;

public class Sarray {
    String[] data;
    int last;

    public Sarray(int size){
	//set up initial instance variables

	data = new String[size];
	last = 0;
    }

    public Sarray() {
	// set up the initial instance variables

	this(20);
    }

    private void indextest(int i){
	try{
	    if(i > data.length - 1){
		throw new ArrayIndexOutOfBoundsException();
	    }
	}catch (IndexOutOfBoundsException e) {
	    System.out.println("Index is greater than Sarray length, try a smaller number.");
	}
    }

    public String[] getdata(){
	return data;
    }

    public int getlast(){
	return last;
    }

    public String toString(){
	String printout = "";
	for(int i = 0 ; i < data.length ; i++){
	    printout = printout + data[i] + ", ";
	}
	return printout;
    }
    
    public boolean add(String s){
	// adds an item to the end of the list, grow if needed
	// returns true
	
	if(last < data.length){
	    data[last] = s;
	}
	else{
	    String[] newdata = new String[data.length + 10];
	    for(int j = 0 ; j < data.length ; j++){
		newdata[j] = data[j];
	    }
	    newdata[last] = s;
	    data = newdata;
	}
	last++;
	return true;
    }

    public void add(String s, int index){
	// adds item s  at index, shifting everything down as needed.
	// also grows as needed

	indextest(index);
	
	if(last < data.length){
	    for(int j = (data.length-1) ; j > index ; j--){
		data[j] = data[j-1];
	    }
	    data[index] = s;
	}
	
	else{
	    String[] newdata = new String[data.length + 10];
	    for(int k = 0 ; k < index ; k++){
		newdata[k] = data[k];
	    }
	    newdata[index] = s;	
	    data = newdata;
	}
    }

    public int size() {
	// returns the number of items in the list (not the array size)

	int numelements = last + 1;
	return numelements;
    }

    public String get(int index) {
	// returns the item at location index of the list

	indextest(index);
	
	String location = data[index];
	return location;
    }

    public String set(int index, String s){
	// sets the item at location index to value i
	// returns the old value

	indextest(index);
	
	String oldval = data[index];
	data[index] = s;
	return oldval;
    }

    public String remove(int index){
	// removes the item at index 
	// returns the old value

	indextest(index);
	
	String removedval = data[index];
	data[index] = null;
	return removedval;
    }



    /*----------------------- Insertion Sort -------------------------*/
    
    /*
      I used all the same variables that were posted on the HW page.
      
      Isort requires 2 loops - one to keep moving the "divider" between
      our "sorted" and "unsorted" portions of the array, and another to
      execute the "shift until it fits" routine.
      
      This repeats the "shift until it fits" process for larger and
      larger portions of the array until we encompass the whole array.
    */

    /*
      Time for isort of 100000 = 42 s
      Time for isort of 200000 = 1 m 30 s
      Time for isort of 400000 = 8 m 24 s
    */
    
    public void isort(){
	int divider = 0;
	while(divider < last){
	    
	    int i;
	    String newvalue = data[divider];
	    for(i = divider; i > 0 && (newvalue.compareTo(data[i-1]) < 0) ; i--){
		data[i] = data[i-1];    
	    }
	    data[i] = newvalue;
	    
	    divider++;
	}
    }

    /*------------------------ Selection Sort -------------------------*/

    /*
      Time for ssort of 100000 = 51 s
      Time for ssort of 200000 = 3 m 49 s
      Time for ssort of 400000 = 19 m 16 s
    */

    public void ssort(){
	//This loop checks our progress as we move the smallest 
	//elements to the front of the sarray 1 by 1.
	for(int i = 0 ; i < last ; i++){
	    String oldval = data[i];
	    int indexOfSmallestSoFar = i;
	    
	    //This one finds the smallest element in the rest of  
	    //the sarray and swap it with the first one.
	    for(int j = i ; j < last ; j++){
		if(data[indexOfSmallestSoFar].compareTo(data[j]) > 0){
		    indexOfSmallestSoFar = j;
		}
	    }
	    data[i] = data[indexOfSmallestSoFar];
	    data[indexOfSmallestSoFar] = oldval;
	}
    }

    /*-------------------------- Bubble Sort ---------------------------*/

    /*
      Time for bsort of 100000 = 2 m 36 s
      Time for bsort of 200000 = 10 m 20 s
      Time for bsort of 400000 = 38 m 43 s
    */
    
    public void bsort(){
	boolean inOrder = false;
	
	//While the sarray is still out of order, we must iterate again.
	while(! inOrder){
	    
	    //This is here to check if the sarray is in order yet.
	    //If a swap is made, it becomes nonzero.
	    int numOfSwaps = 0;
	    
	    //This loop iterates through the enitre array and
	    //performs all necessary swaps.
	    for(int i = 0 ; i < last - 1 ; i++){
		String first = data[i];
		String second = data[i+1];
		int comparison = first.compareTo(second);
		if(comparison > 0){
		    data[i] = second;
		    data[i+1] = first;
		    numOfSwaps++;
		}
	    }
	    
	    //And if the number of swaps remains 0, then we are
	    //done sorting, and the loop exits.
	    if(numOfSwaps == 0){
		inOrder = true;
	    }
	}		
    }
    
    /*------------------------ Main ----------------------------*/

    public static void main(String[] args){
	int len = 400000;

	/* Windows doesn't accept the parameter in Power Shell when 
	   you try to time it :(
	   
	   try{    
	   if(args[0] != null){
	   len = Integer.parseInt(args[0]);
	   }
	   }catch (IndexOutOfBoundsException e){
	   System.out.println("Please enter the length of the sarray you wish to create and sort.");
	   System.exit(0);
	   }
	
	*/

	//Initialize it with length = 1, then while loop fills it to length len
	Sarray sry = new Sarray(1);
	
	while(len > 0){
	    //Creates strings with different values using minimal code :D
	    sry.add("Hello"+len);
	    len--;
	}
	//System.out.println(sry.toString());

	//sry.isort();
	
	//And this does, in fact, order the strings properly.
	//Not sure why the last string, "Hello10", gets cut off.
	

	//sry.ssort();
	
	//Once again, orders the strings properly.
	//Both of these order them in a pecuilar way, however, at 
	//least by "normal" standards. Apparently, 1<10<11<12<2<20<3<7.

	sry.bsort();
	
	//This works properly, again. 
	//With Java's quirky ordering, of course.

	//System.out.println(sry.toString());


	
    }

}
