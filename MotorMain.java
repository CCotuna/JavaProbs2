// Exercitiul 3
public class MotorMain {

	public static void main(String[] args) {
		Motor m1 = new Motor(5);
		Motor m2;
		m2 = m1;
		m2.tipareste();
		m2.setCapacitate(10);
		m1.tipareste();

	}

}

//Rezultat : 'Motor de capacitate 10''