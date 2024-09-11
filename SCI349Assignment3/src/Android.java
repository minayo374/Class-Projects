
public class Android {
	private static int tag = 1;
    private String name;

    public Android() {
        name = "Bob" + tag;
        changetag();
    }
    public String getName() {
        return name;
    }
    static public boolean isPrime(int n) {
        if(n==2) {return true;}
        int num = n / 2;
        for (int i = 2; i <= num; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static private void changetag() {
        tag++;
        while(!isPrime(tag)) {tag++;}
    }
	static public void main(String[] arc) {
		Android a = new Android();
		Android a2 = new Android();
		Android a3 = new Android();
		
		System.out.println(a.getName());
		System.out.println(a2.getName());
		System.out.println(a3.getName());

	}
}
