import java.util.*;

public abstract class Basechar implements Comparable{

    private int HP, PE, Atk, Def, MAtk, MDef, Stamina, Const, Lv, sight, range;
    private double accuracy;
    private double spellaccuracy;
    private String name;
   
    private Weapon wielded;
    private Weapon quivered;
    private Armor wearing;

    /*------------------------ Comparable ------------------------*/

    public int compareTo(Object other){
	Basechar bc = (Basechar)other;
	return (this.name).compareTo(bc.getName());
    }

    /*---------------------- Constructors ------------------------*/   

    public Basechar(String charName, String wieldedID, String quiveredID, String wearingID) {
	name = charName;
	HP = 15;
	PE = 15;
	Atk = 10;
	Def = 10;
	MAtk = 10;
	MDef = 10;
	Stamina = 15; // How much weight can one carry
	Const = 15; // How fast one heals oneself
	Lv = 1;
	sight = 3; // How far can one see
	range = 1; // Will later be written as a function of weapon
	accuracy = 0.6;
	wielded = new Weapon(wieldedID);
	quivered = new Weapon(quiveredID);
	wearing = new Armor(wearingID);
    }
	
    public Basechar(String charName) {
	name = charName;
	HP = 15;
	PE = 15;
	Atk = 10;
	Def = 10;
	MAtk = 10;
	MDef = 10;
	Stamina = 15; // How much weight can one carry
	Const = 15; // How fast one heals oneself
	Lv = 1;
	sight = 3; // How far can one see
	range = 1; // Will later be written as a function of weapon
	accuracy = 0.6;
	wielded = new Weapon();
	quivered = new Weapon();
	wearing = new Armor();
    }

    public Basechar() {
	name = "Kevin";
	HP = 15;
	PE = 15;
	Atk = 10;
	Def = 10;
	MAtk = 10;
	MDef = 10;
	Stamina = 15; // How much weight can one carry
	Const = 15; // How fast one heals oneself
	Lv = 1;
	sight = 3; // How far can one see
	range = 1; // Will later be written as a function of weapon
	accuracy = 0.6;
	wielded = new Weapon();
	quivered = new Weapon();
	wearing = new Armor();
    }
	
    /*----------------------- Getting Stuff ----------------------*/

    public String getName(){
	return name;
    }

    public String toString(){
	return getName();
    }
	
    public String getWielded() {
	return wielded.getID();
    }
	
    public String getQuivered() {
	return quivered.getID();
    }
	
    public String getWearing() {
	return wearing.getID();
    }

    public int getHP() {
	return HP;
    }

    public int getPE(){
	return PE;
    }

    public int getAtk(boolean yesRange){ 
	//yesRange true adds quivered attack, otherwise add weilded attack
    	if (yesRange) {
	    return Atk + quivered.getExtraAtk(); 
	    // quivered weapon adds ranged attack!!
        }
	else {
	    return Atk + wielded.getExtraAtk(); 
	    // wielded weapon adds attack!!
	}
    }       

    public int getDef(){
	return Def + wearing.getExtraDef(); // Armor adds defense!!
    }

    public int getMAtk() {
	return MAtk;
    }

    public int getMDef() {
	return MDef + wearing.getExtraMDef();
    }
	
    public int getStamina() {
	return Stamina;
    }

    public int getConst() {
	return Const;
    }

    // Added a getLv to use in MageEncounter
    public int getLv(){
	return Lv;
    }

    public int getRange(boolean yesRange){ 
	//yesRange true adds quivered attack, otherwise add wielded attack
	if (yesRange) {
	    return range + quivered.getExtraRange(); 
	    // quivered weapon adds ranged attack!!
	}
	else {
	    return Atk + wielded.getExtraRange(); 
	    // wielded weapon adds attack!!
	}
    }

    public double getAccuracy(){
	return accuracy;
    }


    /*------------------------- Setting Stuff ---------------------------*/

    public void setWielded(String ID) {
	wielded = new Weapon(ID);
    }
	
    public void setQuivered(String ID) {
	quivered = new Weapon(ID);
    }
	
    public void setWearing(String ID) {
	wearing = new Armor(ID);
    }

    public void setHP(int newHP) {
	HP = newHP;
    }

    public void setPE(int newPE) {
	PE = newPE;
    }
        
    public void setAtk(int newAtk) {
	Atk = newAtk;
    }

    public void setDef(int newDef) {
	Def = newDef;
    }

    public void setMAtk(int newMAtk) {
	MAtk = newMAtk;
    }
	 
    public void setMDef(int newMDef) {
	MDef = newMDef;
    }

    public void setStamina(int newStamina) {
	Stamina = newStamina;
    }

    public void setConst(int newConst) {
	Const = newConst;
    }

    public void setLv(int newLv) {
	Lv = newLv;
    }
	
    public int getSight() {
	return sight;
    }

    public void setSight(int newSight) {
	sight = newSight;
    }

    public void setRange(int newRange) {
	range = newRange;
    }

    public void setAccuracy(int newAccuracy) {
	accuracy = newAccuracy;
    }

    /*---------------------- Methods -------------------------*/

    public abstract void attack (Basechar other);

    public boolean toHit(double modifier) {

	Random r = new Random();

	return r.nextDouble() < (accuracy * modifier);
	
    }
	
    public void die() {
	System.out.println("GG YOU DIE!");
	System.out.println("Now let's have a moment of silence to celebrate of your death");
		
	try {
	    Thread.sleep(1000);
	} catch (Exception e) {}
		
	System.out.println("You may now speak.");
		
	String yeshno = "";

	while (!(yeshno.equals("y") ||  yeshno.equals("n"))) {
	    System.out.println("Do you want to see your stats? ");
			
	    Scanner sc = new Scanner(System.in);

	    yeshno = sc.nextLine();
	}

	if (yeshno.equals("y")) {
	    System.out.println("Name = " + name);
	    System.out.println("HP = " + HP);
	    System.out.println("Potential Energy = " + PE);
	    System.out.println("Attack = " + Atk);
	    System.out.println("Defense = " + Def);
	    System.out.println("Magic Attack = " + MAtk);
	    System.out.println("Magic Defense = " + MDef);
	    System.out.println("Stamina = " + Stamina);
	    System.out.println("Constitution = " + Const);
	    System.out.println("Level = " + Lv);
	    System.out.println("Sight = " + sight);
	    System.out.println("Range = " + range);
	}

	else {
	    System.out.println("okay see ya!");
	}
    }

    public static void main(String[] args){
	Basechar[] bca = new Basechar[10];
	for(int i = 0 ; i < bca.length ; i++){
	    bca[bca.length - i - 1] = new Akholyte("Kevin"+i);
	}
	System.out.println(Arrays.toString(bca));
	Arrays.sort(bca);
	System.out.println(Arrays.toString(bca));
    }

}
