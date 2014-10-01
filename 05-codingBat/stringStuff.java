public class stringStuff {

    /*--------------------------WORKING-------------------------------*/

    public String nonStart(String a, String b) {
	String asub = a.substring(1);
	String bsub = b.substring(1);
	return asub + bsub;
    }

    /*-------------------------WORKING------------------------------*/

    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    /*--------------------------WORKING-------------------------------*/

    public int diff21(int n) {
	if (n <= 21) {
	    return 21 - n;
	}
  
	else {
	    return (n - 21) * 2;
	}
    }

    /*-----------------------WORKING--------------------------------*/

    public boolean nearHundred(int n) {
	if (Math.abs(100-n) <= 10) {
	    return true;
	}
	if (Math.abs(200-n) <= 10) {
	    return true;
	}
        else {
	    return false;
	}
    }

    /*-------------------------WORKING--------------------------------*/

    public boolean mixStart(String str) {
	if (str.substring(1,3) = "ix") {
	    return true;
	}
	else {
	    return false;
	}
    }

    /*-----------------------WORKING-------------------------------*/

    public int teaParty(int tea, int candy) {
	if(candy>=5 && tea>=5){
	    if(candy>=2*tea || tea>=2*candy){
		return(2);
	    }
	    else{
		return(1);
	    }
	}
	else{
	    return(0);
	}  
    }

    /*-----------------------WORKING----------------------------------*/

    public boolean lastDigit(int a, int b, int c) {
	int lasta = a%10;
	int lastb = b%10;
	int lastc = c%10;
	if (lasta==lastb || lastb==lastc || lasta==lastc) {
	    return true;
	}
	else {
	    return false;
	}
    }

    /*--------------------------------------------------------------------*/

}

