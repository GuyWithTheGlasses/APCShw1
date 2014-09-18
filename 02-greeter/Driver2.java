<<<<<<< HEAD


public class Driver2 {

    public static void main(String[] args) {

	Greeter g1 = new Greeter();
	// the above line is the same as
	// Greeter g1;
	// g1 = new Greeter();

	Greeter g2,g3;
	g2 = new Greeter();
	
	g3 = g1;

	System.out.println("BEFORE");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);
	

	// make a new greeter and set g1 to refer to it
	// NOTE: this does not re-assign g3.
	g1 = new Greeter();
	System.out.println("AFTER");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g2 = new Greeter();
	System.out.println("REALLY AFTER");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g1.greet();
    }

=======
//import java.io.*;    because this causes errors at home
//import java.util.*;

public class Driver2 {

    public static void main(String[] args){
	Greeter g1;
	Greeter g2,g3; // You can assign two variables at a time like this
	g2 = new Greeter ();
	g3=g2; // assigns g3 the value and location of g2
	
	g1 = new Greeter();
	System.out.println("Before");
	System.out.println("g1 is at" + g1);
	System.out.println("g2 is at" + g2);
	System.out.println("g3 is at" + g3);

	g2 = new Greeter();
	System.out.println("After");
	System.out.println("g1 is at" + g1);
	System.out.println("g2 is at" + g2);
	System.out.println("g3 is at" + g3);

	/*Garabage collection clears up memory we're not using it anymore
	  but causes slowdown */
    }
>>>>>>> ec878f9130e69b480820b3c79149b4a9e5321062
}
