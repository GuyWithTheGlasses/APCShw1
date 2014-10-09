public class Driver {
    public static void main(String[] args){
	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2;

	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage("Gandolf",420000);

	m2 = m1;
	//m2 = b1;
	//m2 = w1;

	b1 = m1;
	b1 = m2;
	b2 = new Warrior();

	System.out.println(b2.getHealth());
	System.out.println(m2.getManna());
	//System.out.println(b1.getManna());

	w1.attack(m1);
	m1.attack(w1);

    }
}
/* 
Looks like a variable of a superclass can be assigned to an instance of its 
subclass, but a variable of a subclass can't point to an instance of the
superclass.
You can't directly call the methods in the subclass from the basechar. 
You gotta do something like this, called casting:
((Mage)c2).getManna();
Tells Java to treat a variable of one type as another type. 

Basechar c;
(Mage)c means "treat c as a mage for this line"

However, the dot takes precedence over the casting operator, so we need extra
parentheses to make this code work. 
*/

