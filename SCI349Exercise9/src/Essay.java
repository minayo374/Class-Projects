
public class Essay extends GradeActivity{
	private int grammer;
	private int spell;
	private int length;
	private int content;
	private int total;
	Essay(){}
	public int getGrammer() {
		return grammer;
	}
	public void setGrammer(int grammer) {
		this.grammer = grammer;
	}
	public int getSpell() {
		return spell;
	}
	public void setSpell(int spell) {
		this.spell = spell;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	public int getTotal() {
		
		return total = grammer + spell + length + content;
	}
}
