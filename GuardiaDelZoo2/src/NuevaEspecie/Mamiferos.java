package NuevaEspecie;

public class Mamiferos {

	private int energiaTotal;
	
	public Mamiferos(int i){
		this.energiaTotal = 300;
		}

	//metodo
		
		public int displayEnergia() {
			System.out.println(energiaTotal);
			return energiaTotal;
		}

	   public int getEnergiaTotal() {
		return energiaTotal;
		   
	   }
	public void setEnergiaTotal(int energiaTotal) {
		this.energiaTotal = energiaTotal;
	}


}
