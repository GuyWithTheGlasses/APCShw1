public class Driver{
    public static void main(String[] args) {
	ArrayHW a = new ArrayHW();
	int[] intArray = new int[5];
	intArray[0] = 42;
	intArray[1] = 37;
	intArray[2] = 17;
	intArray[3] = 53;
	//any faster way of doing this?
	
	System.out.println(a.frontPiece(intArray));
	//not really sure how to show that this works
	
	System.out.println(a.sum13(intArray));
    }
}
