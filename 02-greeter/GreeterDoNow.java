public class GreeterDoNow {
    public String greeting = new String("Hello world!");

    public void setGreeting(String s){
	greeting = s;
    }

    public void greet() {
	//String greeting = new String("Sup!"); //this line gets uncommented or commented in
	/* It's not redefining greeting, it's redeclaring a value for the instance variable greeting. We're just creating a new local variable "greeting."
Local variables overshadow instance variables of the same name.*/
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println("I'm out!");
    }
}
