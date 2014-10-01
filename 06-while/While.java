public class While {

    //Took around 15 min (still getting used to syntax, made a lot of errors)
    public String frontTimes(String str, int n) {
	String front = "";
	String org = "";
	if (str.length() < 3) {
	    front = str;
	}
	else {
	    front = str.substring(0,3);
	}
	while (n > 0) {
	    org = org + front;
	    n = n - 1;
	}
	return org;   
    }

    //Took 15 min, approached it the wrong way at first
    public String stringBits(String str) {
	int i = 0;
	String org = "";
	while (i < str.length()) {
	    org = org + str.substring(i,i + 1);
	    i = i + 2;
	}
	return org;
    }

    //25 min, was confused on this one for a while (get it)
    public String stringYak(String str) {
	int i = 0;
	String org = "";
	while (i < str.length()) {
	    if (i+2 < str.length()
		&& str.charAt(i) == 'y' 
		&& str.charAt(i + 2) == 'k'
		) 
		{
		    i = i + 3;
		}
	    else {
		org = org + str.charAt(i);
		i = i + 1;
	    }
	}
	return org;
    }
   
    /*5 min, I think I've gotten used to this now. Never done while loops before, 
      so you know. But I'm good now.*/
    public int stringMatch(String a, String b) {
	int n = 0;
	int i = 0;
	while (i < a.length() - 1 && i < b.length() - 1) {
	    if (a.substring(i,i+2).equals(b.substring (i,i+2)) ) {
		n = n + 1;
	    }
	    i = i + 1;
	}
	return n;
    }

}
