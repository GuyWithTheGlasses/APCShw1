public class Driver {
    
    public static void main(String[] args){
      
	String s = "kevin yan";
	System.out.println("space is at: "+ s.indexOf(' ') );

	String s1 = s.substring(0 , s.indexOf(' '));
	/*Not sure if this notation is what we're looking for, but it was the 
	  easiest way that I found.*/
	System.out.println("first name: "+ s1);

	String s2 = s.substring(s.indexOf(' ') + 1);
	System.out.println("last name: "+ s2);
	/* This should print out the location of the space and the person's 
	   first and last name.*/
   
    }
}
