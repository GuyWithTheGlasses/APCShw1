public class stringStuff {

    public String nonStart(String a, String b) {
	String asub = a.substring(1);
	String bsub = b.substring(1);
	return asub + bsub;
    }

    /*-----------------------------------------------------------------*/

    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    /*-----------------------------------------------------------------*/

    public int diff21(int n) {
	if (n <= 21) {
	    return 21 - n;
	}
  
	else {
	    return (n - 21) * 2;
	}
    }

}
