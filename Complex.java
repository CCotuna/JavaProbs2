// exercitiul 5
public class Complex {
	
	private static int monitorizare = 0;
	private double re, img, numarcomplex = 0;
	
	public Complex(double re, double img) {
		this.re = re;
		this.img = img;
	}
	
	public double getRe() {
		return re;
	}
	public double getImg() {
		return img;
	}

	//modul acestui numar complex - re, img
	public double calculeazaNumar() {
		numarcomplex = Math.sqrt((re*re)+(img*img));
		return numarcomplex;
	}
	
//	public Complex adunare(Complex numarcomplex2) {
//		double sumaRe = this.re+ numarcomplex2.re;
//		double sumaImg = this.img + numarcomplex2.img;
//		return new Complex(sumaRe, sumaImg);
//	}
	
	public Complex suma(Complex c) {
		Complex adunare = new Complex(this.re+c.re, this.img +c.img);
				return adunare;
	}
	public String afiseaza() {
		monitorizare++;
		return re+ "+i*" +img;
	}
	
	public static void returneaza() {
		System.out.println("s-au afisat "+monitorizare+" nr complexe");
	}
	
}
