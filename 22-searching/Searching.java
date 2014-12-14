import java.util.Arrays;
import java.lang.Integer;

public class Searching{
    private Comparable[] a;

    /*-------------------- Constructors n' Stuff ---------------------*/
    
    public Searching(int n){
	a = new Comparable[n];
    }
    
    public Searching(){
	this(10);
    }

    public boolean addItem(Comparable c, int index){
	a[index] = c;
	return true;
    }

    /*----------------------- Sorting Methods ------------------------*/

    public void sort(){
	Arrays.sort(a);
    }
    
    public Comparable lsearch(Comparable item){
	for(int i = 0 ; i < a.length ; i++){
	    if(a[i].equals(item)){
		return a[i];
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	int mid = (a.length - 1) / 2;
	
	while(){
	    /*
	      What condition do you give the while loop?
	      When a[mid] is close to the search item but the item isn't actually 
	      in the loop, mid will just bounce up and down continuously.
	      How do you break the loop? I don't know.
	    */
	    int comp = a[mid].compareTo(item);
	    if(comp > 0){
		mid = mid / 2;
	    }
	    if(comp < 0){
		mid = mid + mid / 2;
	    }
	    else{
		return a[mid];
	    }
	}
	
	return null;
    }

    public Comparable rbsearch(Comparable item){
	boolean firstRun = true;
	static int low;
	static int high;
	/*
	  How can you make it so the recursive search doesn't initialize
	  low and high as 0 and a.length - 1 each time?
	  Something like static would be ideal for that, but trying to 
	  use static doesn't seem to work here.
	  
	  And if I do the firstRun thing below, it tells me that low and high
	  may not have been initialized. 
	  How to do
	*/
	if(firstRun){
	    low = 0;
	    high = a.length - 1;
	    firstRun = false;
	}
	    
	int mid = (low + high) / 2;
	int comp = a[mid].compareTo(item);
	
	if(comp > 0){
	    high = mid - 1;
	    rbsearch(item);
	}
	if(comp < 0){
	    low = mid + 1;
	    rbsearch(item);
	}
	else{
	    return a[mid];
	}
	
	return null;
    }

    /*--------------------------- Main ----------------------------*/

    public static void main(String[] args){
	int len = 10;
	if(args.length != 0){
	    len = Integer.parseInt(args[0]);
	}
	
	Searching s = new Searching(len);
	for(int i = 0 ; i < 10 ; i++){
	    s.addItem("Hello"+i , i);
	}
        s.sort();

	System.out.println("Trying to find Hello1" + "\n" + s.rbsearch("Hello1")+"\n");
	//System.out.println("Trying to find  " + "\n" + s. search(" ")+"\n");
     }

}
