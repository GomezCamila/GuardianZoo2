package NuevaEspecie;




@SuppressWarnings("unused")
public class MurciBat extends Mamiferos {
	
	
	
	private int Flay =-50;
	private int eatHumans= 25;
	private int attackTown= -100;
	
	
	
	
	public MurciBat(int i, int flay, int eatHumans, int attackTown) {
	super(i);
	}
	
//Metodos
	
	public void Flay() {
		System.out.println("+Sonido de Despegue+");
		this.getEnergiaTotal();
		this.setEnergiaTotal(this.getEnergiaTotal()-50);
	}
	
	
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		this.getEnergiaTotal();
		this.setEnergiaTotal(this.getEnergiaTotal()+25);
	}
	
	public void attackTown() {
		System.out.println("+Sonido de ciudad en llamas+");
		this.getEnergiaTotal();
		this.setEnergiaTotal(this.getEnergiaTotal()-100);
	}
	
	//Getter y Setters
	
		public int getFlay() {
		return Flay;
	}




	public void setFlay(int flay) {
		Flay = flay;
	}




	public int getEatHumans() {
		return eatHumans;
	}




	public void setEatHumans(int eatHumans) {
		this.eatHumans = eatHumans;
	}




	public int getAttackTown() {
		return attackTown;
	}




	public void setAttackTown(int attackTown) {
		this.attackTown = attackTown;
	}




	

	
}
