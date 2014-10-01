public class Driver {
    public static void main(String[] args){
	stringStuff a = new stringStuff();

	System.out.println(a.nonStart("ahello","zworld"));
	//should be "helloworld"
	System.out.println(a.makeAbba("ok,","yeah,"));
	//should be "ok,yeah,yeah,ok,"
	System.out.println(a.diff21(-11));
	//should be 32
	System.out.println(a.nearHundred(110));
	//should be true
	System.out.println(a.mixStart("Help Pix!"));
	//should be false
	System.out.println(a.teaParty(42,83));
	//should be 1
	System.out.println(a.lastDigit(42,1093,7777772));
	//should be true
    }
}

