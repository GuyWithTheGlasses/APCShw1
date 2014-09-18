public class DriverDoNow {
    public static void main(String[] args){
	GreeterDoNow g1 = new GreeterDoNow();
	GreeterDoNow g2 = new GreeterDoNow();
	g1.greet();
	g2.greet();
	g1.greeting = new String("Ni hao!");
	//In Java, we almost never make instance variables public so you can't do the following:
	//g1.greeting = new String("Ni hao!")
	//Instead we write public "accessor methods" --> get and set
        g1.greet();
	g2.greet();
	/* This outputs Hello World for the 1st 2nd and 4th, but Ni hao for the 3rd. This mean that we can change the instance variable for each g1, g2 INDEPENDENTLY. So each instance of the class has its own copy of the instance variable.
This means that g1.greeting = Ni Hao but g2.greeting = Hello world
Just like turtle variables such as color, each instance can have its own value for the same variable. */
    }
}
