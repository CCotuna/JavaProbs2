//exercitiul 4
public class MainSertarBirou {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(10,11,12);
		Sertar s2 = new Sertar(13,14,15);
		Birou b = new Birou(s1,s2,40, 40, 40);
		b.tipareste();
	}

}
