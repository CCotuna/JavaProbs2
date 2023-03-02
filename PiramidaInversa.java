
public class PiramidaInversa {
		private int n=1,m=5,rand;
		
		public PiramidaInversa(int rand) {
			this.rand = rand;
		}
		
		public void afiseaza() {
			for(int i = 0; i<rand; i++) {
				for(int j=rand-1; j>i ; j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=n;k++)
				{
					System.out.print(m);
					System.out.print(m);
				}
				n++; m--;
				System.out.println();
			}
			
	}
}

 