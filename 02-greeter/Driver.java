<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

	/*
	  declares a local variable g to be of type Greeter
	*/
	Greeter g;

	/*
	  new does the following
	  1. Allocates enough memory to store a Greeter
	  2. Do whatever's needed to setup / initialize
	     the memory to be a Greeter.
	  3. return the address of the memory that was
	     allocated.

	  The assignment statement stores the address
	  in g 
	*/
	
	g = new Greeter();

	// This prints out the memory location of Greeter g
	// System.out.println(g);
	g.greet();
	g.greet();
	// g.ungreet(); can't do this since ungreet is private
    }
=======
//import java.io.*;
//import java.util.*;

public class Driver {

    public static void main(String[] args){
	/*
	  we are declaring g to be a local
	  variable of type Greeter (which is the
	  class we defined). In java
	  we jave to say what type of stuff variables
	  hold 
	*/
	Greeter g;
	/*New does the following
	   1. allocate the memory for a new Greeter instance
	   2. Do whatever's needed to setup/ initialize the 
	      memory to be a greeter
	   3. Return the memory address (location) for it
	   4. Store that address in g

	   g now stores a reference to the greeter
	   that is, the address of the greeter.
	   The greater isn't actually stuffed into g.
	*/
	g = new Greeter();
	//this prints out the memory location of Greeter g
	//System.out.println(g);

	g.greet();
	g.ungreet();
    }

>>>>>>> ec878f9130e69b480820b3c79149b4a9e5321062
}
