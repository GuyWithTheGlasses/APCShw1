import java.io.*;
import java.util.*;


public class Driver{

    public static ArrayList removeconsec(ArrayList x){
	for(int j = 1 ; j < x.size() ; j++){
	    if(x.get(j) == x.get(j-1)){
		x.remove(j);
	    }
	}
	return x;
    }

    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random rng = new Random();
	for(int i = 0 ; i < 20 ; i++){
	    al.add(rng.nextInt(5));
	}

      	System.out.println(al);
	System.out.println(removeconsec(al));
	
    }
}
