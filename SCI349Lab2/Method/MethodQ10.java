
public class MethodQ10 {
	public static String reverse(String str) {
		String rev = "";
		if (str.length() <= 1) {
			return str;
		}
		else {
			rev += str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
			return rev;
		}
	}
	static public void main(String[] arg) {
		System.out.println(reverse("flow"));
	}

}
