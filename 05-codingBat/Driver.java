public class Driver {
    public static void main(String[] args){
	stringStuff a = new stringStuff();
	stringStuff b = new stringStuff();
	stringStuff c = new stringStuff();

	System.out.println(a.nonStart("ahello","zworld"));
	//should be "helloworld"
	System.out.println(b.makeAbba("ok,","yeah,"));
	//should be "ok,yeah,yeah,ok,"
	System.out.println(c.diff21(-11));
	//should be 32
    }
}

