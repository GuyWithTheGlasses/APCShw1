// mixstart

public boolean mixStart(String str) {
 
    if (str.length() < 3) {
	return false;
    }

    String s = str.substring(1,3);

    if (s.equals("ix")) {
	return true;
    }
    else {
	return false;
    }

}

/*-------------------------------------------------------------------------*/
// makeOutWord

public String makeOutWord(String out, String word) {
  String s1 = out.substring(0,2);
  String s2 = out.substring(2,4);
  String s3 = s1 + word + s2;
  return s3;
}

/*-------------------------------------------------------------------------*/
//firstHalf

public String firstHalf(String str) {
  String s = str.substring(0 , (str.length() / 2) );
  return s;
}
