public class Framework{
    public String frame(int r, int c){
	String s = "";
	int currow = 0;
	
	while(currow < r){
	    //the code for the middle rows
	    if(currow > 0 && currow < r-1){
		int count = 0;
		while(count < c){
		    if(count > 0 && count < c-1){
			s = s + " ";
		    }
		    else{
			s = s + "*";
		    }
		    count = count + 1;
		}
		s = s + "\n";
	    }
	    //the code for the top and bottom rows
	    else{
		int star = 0;
		while(star < c){
		    s = s + "*";
		    star = star + 1;
		}
		s = s + "\n";
	    }
	    currow = currow + 1;
	}
	return s;
    }

    public String stringSplosion(String str) {
	String s = "";
	int count = 0;
	while(count <= str.length()){
	    s = s + str.substring(0,count);
	    count = count + 1;
	}
	return s;
    }


    public String stringX(String str) {
	String s = "";
	if(str.length() > 0){
	    s = s + str.substring(0,1);
	}
	int count1 = 1;
	int count2 = 2;
	while(count2 < str.length()){
	    if(str.substring(count1,count2).equals("x")){
	    
	    }
	    else{
		s = s + str.substring(count1,count2);
	    }
	    count1 = count1 + 1;
	    count2 = count2 + 1;
	}
	if(str.length() > 1){
	    s = s + str.substring(str.length()-1,str.length());
        }
	return s;
    }

}
