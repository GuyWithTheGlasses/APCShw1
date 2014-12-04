public class Sarray {
    String[] data;
    int last;

    public Sarray(int size){
	//set up initial instance variables

	data = new String[size];
	last = 0;
    }

    public Sarray() {
	// set up the initial instance variables

	this(20);
    }

    private void indextest(int i){
	try{
	    if(i > data.length - 1){
		throw new ArrayIndexOutOfBoundsException();
	    }
	}catch (IndexOutOfBoundsException e) {
	    System.out.println("Index is greater than Sarray length, try a smaller number.");
	}
    }

    public String[] getdata(){
	return data;
    }

    public int getlast(){
	return last;
    }

    public String toString(){
	String printout = "";
	for(int i = 0 ; i < data.length ; i++){
	    printout = printout + data[i] + ", ";
	}
	return printout;
    }
    
    public boolean add(String s){
	// adds an item to the end of the list, grow if needed
	// returns true
	
	if(last < data.length){
	    data[last] = s;
	}
	else{
	    String[] newdata = new String[data.length + 1];
	    for(int j = 0 ; j < data.length ; j++){
		newdata[j] = data[j];
	    }
	    newdata[last] = s;
	    data = newdata;
	}
	last++;
	return true;
    }

    public void add(String s, int index){
	// adds item s  at index, shifting everything down as needed.
	// also grows as needed

	indextest(index);
	
	if(last < data.length){
	    for(int j = (data.length-1) ; j > index ; j--){
		data[j] = data[j-1];
	    }
	    data[index] = s;
	}
	
	else{
	    String[] newdata = new String[data.length + 1];
	    for(int k = 0 ; k < index ; k++){
		newdata[k] = data[k];
	    }
	    newdata[index] = s;	
	    data = newdata;
	}
    }

    public int size() {
	// returns the number of items in the list (not the array size)

	int numelements = last + 1;
	return numelements;
    }

    public String get(int index) {
	// returns the item at location index of the list

	indextest(index);
	
	String location = data[index];
	return location;
    }

    public String set(int index, String s){
	// sets the item at location index to value i
	// returns the old value

	indextest(index);
	
	String oldval = data[index];
	data[index] = s;
	return oldval;
    }

    public String remove(int index){
	// removes the item at index 
	// returns the old value

	indextest(index);
	
	String removedval = data[index];
	data[index] = null;
	return removedval;
    }



    /*----------------------- Isort --------------------------*/
    
    /*
      I used all the same variables that were posted on the HW page.
      
      Isort requires 2 loops - one to keep moving the "divider" between
      our "sorted" and "unsorted" portions of the array, and another to
      execute the "shift until it fits" routine.
      
      This repeats the "shift until it fits" [rocess for larger and
      larger portions of the array until we encompass the whole array.
    */
    
    public void isort(){
	int last = 0;
	while(last < data.length - 1){
	    
	    int i;
	    String newvalue = data[last+1];
	    for(i = last; i > 0 && (newvalue.compareTo(data[i-1]) < 0) ; i--){
		data[i] = data[i-1];    
	    }
	    data[i] = newvalue;
	    
	    last++;
	}
    }
    

    /*------------------------ Main ----------------------------*/

    public static void main(String[] args){
	Sarray sry = new Sarray(1);
	
	for(int i = 10 ; i > 0 ; i--){
	    //Creates strings with different values using minimal code :D
	    sry.add("Hello"+i);
	}
	System.out.println(sry.toString());
	sry.isort();
	System.out.println(sry.toString());
	//And this does, in fact, order the strings properly.
	//Not sure why the last string, "Hello10", gets cut off.
    }

}
