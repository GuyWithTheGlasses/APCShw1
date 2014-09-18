<<<<<<< HEAD

import java.io.*;
import java.util.*;
=======
//import java.io.*;           why this no workkkk
//import java.util.*;

>>>>>>> ec878f9130e69b480820b3c79149b4a9e5321062

public class Greeter {
    // We put the attributes here

    // We put the abilities here
    // In Java, these are called methods.
    // methods are functions but they belong
    // to specific classes
    
    /*
      public <- this method can be called (used) from
                outside the class

      void   <- this method doesn't return (send back)
                anything 

      greet  <- The name of the method
  
      ()     <- Parameters would go here

      { }    <- the actual method code goes here
     */
    public void greet() {
	System.out.println("Hello world!");
	
	ungreet();
    }
<<<<<<< HEAD

    private void ungreet() {
	System.out.println("I'm out.");
    }

=======
    public void ungreet() {
	System.out.println("I'm out.");
    }
>>>>>>> ec878f9130e69b480820b3c79149b4a9e5321062
}
