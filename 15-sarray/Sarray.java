public class Sarray {
    int[] data;
    int   last;

    public Sarray() {
	// set up the initial instance variables
	
        data = new int[10];
	last = 0;
    }

    private void indextest(){
	try{
	    if(index > data.length){
		throw new ArrayIndexOutOfBoundsException();
	    }
	}catch (IndexOutOfBoundsException e) {
	    System.out.println("Index is greater than Sarray length, try a smaller number.");
	}
    }
    
    public boolean add(int i){
	// adds an item to the end of the list, grow if needed
        // returns true
	
	if(last != (data.length - 1)){
	    data[last+1] = i;
	}
	else{
	    int[] newdata = new int[data.length + 10];
	    for(int j = 0 ; j < (newdata.length - 1) ; j++){
		newdata[j] = data[j];
	    }
	    newdata[last+1] = i;
	}
	data[] = newdata[];
	last++;
	return true;
    }

    public void  add(int index, int i){
	// adds item i  at index, shifting everything down as needed.
        // also grows as needed

	indextest();
	
	if(last < (data.length - 1)){
	    for(int j=(data.length-1) ; j>index ; j=j-1){
		data[j] = data[j-1];
	    }
	    data[index] = i;
	}
	
	else{
	    int[] newdata = new int[data.length + 10];
	    for(int k = 0 ; k < newdata.length ; k++){
		if(k<index){
		    newdata[k] = data[k];
		}
		if(k=index){
		    newdata[k] = i;
		}
		else{
		    newdata[k] = data[k-1];
		}
	    }
	}
	    
	data[] = newdata[];
    }

    public int size() {
	// returns the number of items in the list (not the array size)

        int numelements = last + 1;
	return numelements;
    }

    public int get(int index) {
        // returns the item at location index of the list

	indextest();
	
	int location = data[index];
	return location;
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value

	indextest();
	
        int oldval = data[index];
	data[index] = i;
	return oldval;
    }

    public int remove(int index){
        // removes the item at index 
        // returns the old value

	indextest();
	
	int removedval = data[index];
	data[index] = 0;
	return removedval;
    }
}
