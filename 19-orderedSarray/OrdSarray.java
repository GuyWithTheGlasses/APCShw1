public class OrdSarray extends Sarray{
    
    public boolean add(String s){
	int count = data.length - 1;
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

    private void order(){
	

    public String set(int index, String s){
	super.set(index,s);
	
	
