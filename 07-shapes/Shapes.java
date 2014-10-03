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

	while(current <= h){
	    int space;
	    for(space=0 ; space< h-current ; space++){
		org = org + " ";
	    }
	    for( ; space < h+current-1 ; space++){
		org = org + "*";
	    }
	    current = current + 1;
	    org = org + "\n";
	}

	return org;
    }
	
    public String diamond(int h){
	String org = "";
	int currow = 0;
	int refrow = 0;
	while(refrow < h){
	    int space;
	    for(space=0;space < h-currow-1;space++){
		org = org + " ";
	    }
	    for( ;space <= h+currow-1 ; space++){
		org = org + "*";
	    }
	    if(refrow < h/2){
		currow = currow + 1;
	    }
	    else{
		currow = currow - 1;
	    }
	    org = org + "\n";
	    refrow = refrow + 1;
	}
	return org;

    }

    public String tri4(int h){
	String org = "";
	int row = 0;
	int star = h;
	
	while(row < h){
	    int space;
	    for(space=0;space<h-star;space++){
		org = org + " ";
	    }
	    for( ;space<h;space++){
		org = org + "*";
	    }
	    row = row + 1;
	    star = star - 1;
	    org = org + "\n";
	}

	return org;
    }

}

