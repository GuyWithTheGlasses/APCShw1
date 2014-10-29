import java.util.*;

public class ArrayStuff{
    
    /*------------- Instance Variables --------------*/

    private int[] a;
    Random rand;

    /*--------------- Constructors ----------------*/

    public ArrayStuff(int x){
	rand = new Random();
	a = new int[x];
	
	for(int i = 0 ; i < a.length ; i++){
	    a[i] = 75 + rand.nextInt(76);
	}

    }

    public ArrayStuff(){
	this(100);
    }

    /*----------------- Methods --------------------*/

    public String toString(){
	String s = "";
	
	for(int i = 0 ; i < a.length ; i++){
	    s = s + a[i] + ", ";
	}

	return s;
    }

    public int find(int n){
	int index = -1;

	for(int i = 0 ; i < a.length ; i++){
	    if(a[i] == n){
		index = i;
		i = a.length;
	    }
	}

	return index;
    }

    public int maxVal(){
	int max = 0;

	for(int i = 0 ; i < a.length ; i++){
	    if(a[i] > max){
		max = a[i];
	    }
	}

	return max;
    }   

    public int freq(int f){
	int occurence = 0;
	int number = a[f];

	for(int i = 0 ; i < a.length ; i++){
	    if(a[i] == number){
		occurence++;
	    }
	}

	return occurence;
    }

}
	
