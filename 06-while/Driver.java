public class Driver {
    public static void main(String[] args) {
	While test = new While();

	System.out.println(test.frontTimes("WELCOME",5));
	//should be "WELWELWELWELWEL"
	System.out.println(test.stringBits("p1o2t3a4t5o6"));
	//should be "potato"
	System.out.println(test.stringYak("I love yaks")); 
	//should be "I love s"
	System.out.println(test.stringMatch("A dog!","A donut!")); 
	//should be 3
    }
}
