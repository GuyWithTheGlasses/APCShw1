public class Shapes {

    public String box(int r, int c) {
	String s = "";

	while (r > 0){
	    int cc = 0;
	    while (cc < c){
		s = s + "*";
		cc = cc + 1;
	    }
	    s = s + "\n";
	    r = r - 1;
	}

	return s;
    }

    public String tri1(int h){
	String s = "";
	int x = 0;
	
	while(x < h){
	    int c = 0;
	    while (c <= x){
		s = s + "*";
		c = c + 1;
	    }
	    x = x + 1;
	    s = s + "\n";
	}

	return s;
    }

    public String tri2(int h){
	String org = "";
	int rowstar = 0;

	while(rowstar < h){
	    int space = 0;
	    int count = 0;
	    while(space < h - rowstar){
		org = org + " ";
		space = space + 1;
	    }
	    while(count <= rowstar){
		org = org + "*";
		count = count + 1;
	    }
	    rowstar = rowstar + 1;
	    org = org + "\n";
	}

	return org;
    }

    public String tri3(int h){
	String org = "";
	int current = 0;
	//current = 1 + current*2
	while(current < h){
	    int space;
	    for(space=0;space<h-current;space++){
		org = org + " ";
	    }
	    for( ;space<h+current;space++){
		org = org + "*";
	    }
	    current = current + 1;
	    org = org + "\n";
	}
    }
	
}

/* tri1 with a for loop
public string tri1(int h){
    int i = 0;
    for (i=0,

tri2 with a for loop
public string tri2(int height){
    int h;
    String s = "";
    for(h=1;h<=height;h++){
    int i = 0;
         for(i=0;i<height-h;i++){
	      s = s + " ";
	      }
	 for(h=0;i<h;i++){
	 s = s + "*";
	 }
	 s = s + "\n";
	 }
}
*/
