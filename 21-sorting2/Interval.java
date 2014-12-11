import java.io.*;
import java.util.*;

public class Interval implements Comparable {
    private int low, high;
    private static Random rnd = new Random(101);
    //Because we used static, we can seed the RNG so that it prints 
    //out the "same" "random" numbers each time we run it.
    private static int numIntervals = 0;
		
    /*------------------------- Constructors ---------------------------*/

    //Necessary to avoid confusion with using "this"
    private void setup(int l, int h){
	high = h;
	low = l;
	numIntervals = numIntervals + 1;
    }

    public Interval(){
	int h = 1 + rnd.nextInt(100);
	int l = rnd.nextInt(h);
	setup(l,h);
    }

    public Interval(int l, int h){
	setup(l,h);
    }

    /*-------------------------- Methods ------------------------------*/

    public String toString(){
	String s = "["+low+","+high+"]";
	return s;
    }

    public int compareTo(Object other){
	Interval o = (Interval)other;

	if (this.low == o.low){
	    return this.high - o.high;
	} else {
	    return this.low - o.low;
	}
	//return (this.high - this.low) - (o.high - o.low);

    }
    
/*------------------------------- Main ------------------------------*/

    public static void main(String[] args) {
	Interval[] interA = new Interval[10];
	for (int i = 0; i < interA.length; i++) {
	    interA[i] = new Interval();
	}
	System.out.println(Arrays.toString(interA));
	Arrays.sort(interA);
	System.out.println(Arrays.toString(interA));
    }

}
