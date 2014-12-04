import java.io.*;
import java.util.*;

public class OrdSarray extends Sarray{

    public OrdSarray(int size){
	super(size);
    }

    public OrdSarray(){
	super();
    }

    private int findIndex(String s){
	int properIndex = getdata().length;
	
	for(int i = 0 ; i < getdata().length ; i++){
	    if(getdata()[i] == null ||
	       (s.compareTo(getdata()[i]) <= 0) 
	       ){ 
		properIndex = i;
		break;
	    }
	}
	
	return properIndex;
    }
		

    public boolean add(String s){
	int i = findIndex(s);
	super.add(s,i);
	return true;
    }
    
    public String set(int index, String s){
	String oldval = getdata()[index];
	super.remove(index);
	this.add(s);
	return oldval;
    }































    /*   
	 public boolean add(String s){
	 if(data[last] == null){
	 super.add(s);
	 return true;
	 }
	
	 for(int i = last ; i > 0 ; i--){
	 int test = s.compareTo(data[i]);
	 if(test < 0){
	 data[i] = data[i-1];
	 }
	 if(test >= 0){
	 super.add(s,i);
	 break;
	 }
	 }
	 return true;
	 }
	 /*
	 int count = last - 1;
	 while(count >= 0){
	 int test = s.compareTo(data[count]);
	 if(test > 0){
	 data[count] = data[count - 1];
	 count--;
	 }
	 if(test <= 0){
	 data[count] = s;
	 break;
	 }
	 }
	 return true;
	 }
   	    
	 public String set(int index, String s){
	 String oldval = remove(index);
	 this.add(s);
	 return oldval;
	 }
    */
    public static void main(String[] args){
	OrdSarray os = new OrdSarray(5);
	os.add("4");
	System.out.println(os.toString());
	os.add("1");
	System.out.println(os.toString());
	os.add("2");
	System.out.println(os.toString());
	os.add("3");
	System.out.println(os.toString());
	os.set(0,"a");
	System.out.println(os.toString());

    }

}
    
