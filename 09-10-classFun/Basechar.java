/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health=20;
    public String name;

    /*public Basechar(String s){
	setName(s);
    }
    public Basechar(){
	setName("Default");
    }
    */

    public String toString(){
	return getName();
    }

    public void setName(String name){
	this.name = name;
    }
    //this.something refers to the instance variables/methods of a class

    public String getName(){
	return name;
    }

    public void attack(Basechar other){
	/*here we should attack a basechar, because if we are only able to
	attack mages that's kind of bad.*/
	System.out.println(this.getName()+" is attacking "+other.getName());
    }

    public int getHealth(){
	return health;
    }

    
}

/*
When we create a constructor in Basechar, it doesn't seem to work for Warrior.
So we have to make the constructor in Warrior for it to work?

Superclass                      Subclass                     Result
1-param                         Default                      Doesn't work
Default                         1-param                      Works
1-param                         1-param                      Doesn't work???

Default                         0-param                      Works
0-param                         Defualt                      Works
0-param                         0-param                      Works

Default                   0-param and 1-param                Works
0-param and 1-param             Default                      Doesn't work???
0-param and 1-param       0-param and 1-param                Works

When Java works with constructors + subclasses:
When we make a Warrior, it is still a Basechar, so it must set it up as a 
Basechar first. So it will call the constructor in the superclass first.
Then it calls the constructor in that subclass.

Solve this by putting a 0-param constructor in the superclass, so that it has a 
default to go to that will always work.

Java will always call the superconstructor except when you do this.
super();
as the first line of the subclass' constructor, will call the 
superconstructor automatically. 
super(n); for the 1-param constructor in the superclass.
All you have to do is specify like this. 

*/
