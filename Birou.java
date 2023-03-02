//exercitiul 4
public class Birou {
	private Sertar s1;
	private Sertar s2;
	private double l, L, H;
	
	
	public Birou(Sertar s1, Sertar s2, double l, double L, double H) {
		this.s1 = s1;
		this.s2 = s2;
		this.l = l;
		this.L = L;
		this.H = H;
	}
	
	public void tipareste() {
		System.out.println("Birou: " + l + "+" + L + "+" + H);
		s1.tipareste();
		s2.tipareste();
	}
}
