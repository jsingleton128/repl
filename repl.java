package repl;

public class repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		repl("Hello", 4);
		
	}
	
	public static String repl(String phrase, int x) {
		String blank = "";
		
		if (x < 1) {
			  return blank;
		} else {
			for (int i = 0; i < x; i++) {
				System.out.print(phrase);
			}
			return phrase;
		}
	}
}
