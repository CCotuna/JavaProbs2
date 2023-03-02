// Exercitiul 1
public class ConstrPriv {
		private String nume;
		private int mere;
// afiseaza eroare 	
		private ConstrPriv(String nume, int mere) {
//		public ConstrPriv(String nume, int mere) {
			this.nume = nume;
			this.mere = mere;
		}
		
		public void afisareInformatii() {
			System.out.println("Afiseaza "+nume+ " si am "+mere+" mere.");
		}
}
