public class Driver{
    public static void main(String[] args){
	WordSearch ws = new WordSearch();

	//All commented out lines were for testing purposes
	//ws.addWordAllD("hello", 15, 20, 0);
	//ws.addWordAllD("look", 15, 18, 0); //overlap shouldn't be allowed
	//ws.addWordAllD("look", 15, 23, 0); //legal overlap
	//ws.addWordAllD("coffee", -3, 25, 4); //out of bounds
	//ws.addWordAllD("tea", 15, 20, 8); //direction is not a valid int

	System.out.println(ws.addWord("Water"));
	System.out.println(ws.addWord("Soda"));
	System.out.println(ws.addWord("Cider"));
	System.out.println(ws.addWord("Juice"));
	System.out.println(ws.toString());
    }
}
