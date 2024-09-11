
public class UseBook {
	public static void main(String[] arg) {
		Fiction fic = new Fiction("Minayo is a cat");
		NonFiction nonF = new NonFiction("Minayo is a human");
		
		System.out.println(fic.getTitle() + ": " + fic.getPrice());
		System.out.println(nonF.getTitle() + ": " + nonF.getPrice());
	}
}
