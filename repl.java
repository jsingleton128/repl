
public class repl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			repl("hello", 3);


	}
		public static void repl(String phrase, int x) {
			if (x < 1) {
				  System.out.print("");
			} else {
				for (int i = 0; i < x; i++) {
					System.out.print(phrase);
				}
			}
			 
		}
}


