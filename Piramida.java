
public class Piramida {
	private int rand;
	
	public Piramida(int rand) {
		this.rand = rand;
	}

	public void afiseaza() {
		for(int i = 0; i <= rand; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= rand-i-1; k++) {
				System.out.print(i+1);
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
}