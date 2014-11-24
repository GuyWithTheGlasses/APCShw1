public class Driver{
    public static void main(String[] args){
	WordSearch ws = new WordSearch();

	//All commented out lines were for testing purposes
	//ws.addWordAllD("HELLO", 15, 20, 0);
	//ws.addWordAllD("LOOK", 15, 18, 0); //overlap shouldn't be allowed
	//ws.addWordAllD("LOOK", 15, 23, 0); //legal overlap
	//ws.addWordAllD("CAKE", 14, 21, 6); //illegal overlap
	//ws.addWordAllD("TEA", 15, 20, 8); //direction is not a valid int

	System.out.println(ws.addWord("WATER"));
	System.out.println(ws.addWord("SODA"));
	System.out.println(ws.addWord("CIDER"));
	System.out.println(ws.addWord("JUICE"));
	System.out.println(ws.toString());
    }
}

