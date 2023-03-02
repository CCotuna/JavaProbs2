// Exercitiul 3
public class Motor {
	private int capacitate; //atribut nestatic privat
	
	public Motor(int c) {
		capacitate = c;
	}
	public void setCapacitate(int c) {
		capacitate = c;
	}
	public void tipareste() {
		System.out.println("Motor de capacitate " + capacitate);
	}
}
