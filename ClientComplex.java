// exercitiul 5 
public class ClientComplex {

	public static void main(String[] args) {
		Complex.returneaza();
		
		
		Complex nr1 = new Complex(3, 4);
		Complex nr2 = new Complex(4, 3);
		System.out.println(nr1.afiseaza());
		System.out.println(nr2.afiseaza());
		System.out.println("modul: "+nr1.calculeazaNumar());
		
		Complex suma = nr1.suma(nr2);
		System.out.println("Suma dintre cele doua numere complexe este "+suma.getRe()+"+"+suma.getImg()+"i");
		System.out.println(suma.afiseaza());
		System.out.println();
		

		Complex.returneaza();
	}

}
