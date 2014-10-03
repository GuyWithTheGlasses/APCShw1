public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
	System.out.println("box"+"\n"+s.box(5,4));
	System.out.println("box"+"\n"+s.box(4,5));
	System.out.println("tri1"+"\n"+s.tri1(4));
	System.out.println("tri1"+"\n"+s.tri1(5));
	System.out.println("tri2"+"\n"+s.tri2(4));
	System.out.println("tri2"+"\n"+s.tri2(5));
	System.out.println("tri3"+"\n"+s.tri3(4));
	System.out.println("tri3"+"\n"+s.tri3(5));
	System.out.println("diamond"+"\n"+s.diamond(4));
	System.out.println("diamond"+"\n"+s.diamond(5));
	System.out.println("tri4"+"\n"+s.tri4(4));
	System.out.println("tri4"+"\n"+s.tri4(5));

    }
}
