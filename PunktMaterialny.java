package lab15;

public class PunktMaterialny {
	//prywatne pole masy punktu materialnego
	private double masa;
	
	//prywatne pola wspolrzednych punktu materialnego
	private double pozX;
	private double pozY;
	private double pozZ;
	
	//konstruktor domyslny
	PunktMaterialny(){
		this.masa = 3;
		this.pozX = 3;
		this.pozY = 3;
		this.pozZ = 3;
	}
	
	//konstruktor z parametrami
	PunktMaterialny(double masa, double pozX, double pozY, double pozZ){
		this.masa = masa;	
		this.pozX = pozX;
		this.pozY = pozY;
		this.pozZ = pozZ;
	}
	
	//akcesory
	public double getMasa() {
		return masa;
	}

	public double getPozX() {
		return pozX;
	}
	
	public double getPozY() {
		return pozY;
	}
	
	public double getPozZ() {
		return pozZ;
	}
	
	//mutatory
	public void setMasa(double masa){
		this.masa = masa;
	}
	
	public void setPozX(double pozX) {
		this.pozX = pozX;
	}

	public void setPozY(double pozY) {
		this.pozY = pozY;
	}

	public void setPozZ(double pozZ) {
		this.pozZ = pozZ;
	}
}