public class Mage extends Basechar{
    private int manna =12345;

    public Mage(String s){
	setName(s);
    }
    public Mage(){
	setName("Mage");
    }
    public Mage(String s, int m){
	setName(s);
	setManna(m);
    }
    
    public void setManna(int x){
	manna = x;
    }

    public int getManna(){
	return manna;
    }
    
}
