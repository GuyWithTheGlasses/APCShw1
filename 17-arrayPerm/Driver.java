public class Driver{
    public static void main(String[] args){
	ArrayPerm ap = new ArrayPerm();

	System.out.println("Before:\n" + ap);
	ap.randomizer();
	ap.arrayRandomizer();
	System.out.println();
	System.out.println("After:\n" + ap);
    }
}
