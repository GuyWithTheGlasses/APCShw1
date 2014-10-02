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
	
}
