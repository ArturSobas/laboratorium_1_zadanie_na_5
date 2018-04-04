package lab15;

import lab15.PunktMaterialny;

public class BrylaSztywna {
	//prywatne pole liczby punktow materialnych z ktorych sklada sie dana bryla sztywna
	private int liczbaPunktow;	
	
	//tablica punktow materialnych z ktorych sklada sie dana bryla sztywna
	private PunktMaterialny[] A;
	
	//prywatne pole masy bryly
	private double masaBryly;
	
	//prywatne pole zawierajace wspolrzedne srodka ciezkosci danej bryly sztywnej
	private double[] XYZC = new double[3];
	
	//konstruktor 
	BrylaSztywna(int liczbaPunktow){
		this.liczbaPunktow = liczbaPunktow;
		this.masaBryly = 0;
		this.A = new PunktMaterialny[liczbaPunktow];
		for(int i = 1;i <= liczbaPunktow;i++){
			A[i-1] = new PunktMaterialny(i*i,2*i,-3*i,i);
			this.masaBryly += this.A[i-1].getMasa();
		}
		double xm = 0 , ym = 0, zm = 0;
		for(int i = 0; i < liczbaPunktow;i++) {
			xm = xm + this.A[i].getPozX() * this.A[i].getMasa();
			ym = ym + this.A[i].getPozY() * this.A[i].getMasa();
			zm = zm + this.A[i].getPozZ() * this.A[i].getMasa();
		}
		XYZC[0] = xm / this.masaBryly; 
		XYZC[1] = ym / this.masaBryly;
		XYZC[2] = zm / this.masaBryly;
	}
	
	//metoda liczaca moment bezwladnosci wzgledem osi x
	public double Ix() {
		double ix = 0;
		for(int i = 0;i < liczbaPunktow;i++) {
			ix = ix + A[i].getMasa() * (Math.pow((XYZC[1] - A[i].getPozY()),2) + Math.pow((XYZC[2] - A[i].getPozZ()),2));
		}
		return ix;
	}
	
	//metoda liczaca moment bezwladnosci wzgledem osi y
	public double Iy() {
		double iy = 0;
		for(int i = 0;i < liczbaPunktow;i++) {
			iy = iy + A[i].getMasa() * (Math.pow((XYZC[0] - A[i].getPozX()),2) + Math.pow((XYZC[2] - A[i].getPozZ()),2));
		}
		return iy;
	}
	
	//metoda liczaca moment bezwladnosci wzgledem osi z
	public double Iz() {
		double iz = 0;
		for(int i = 0;i < liczbaPunktow;i++) {
			iz = iz + A[i].getMasa() * (Math.pow((XYZC[0] - A[i].getPozX()),2) + Math.pow((XYZC[1] - A[i].getPozY()),2));
		}
		return iz;
	}
}
