package lab15;

import lab15.BrylaSztywna;

public class ProgramTestowy {

	public static void main(String[] args) {
		//tworzenie obiektu klasy bryla sztywna
		BrylaSztywna bryla = new BrylaSztywna(3);
		
		//wysiwetlenie momentow bezwladnosci wzgledem osi x,y oraz z
		System.out.println("Momenty bezwladnosci bryly wzgledem osi x,y oraz z:");
		System.out.printf("Ix = %.2f\nIy = %.2f\nIz = %.2f"  , bryla.Ix(), bryla.Iy(), bryla.Iz());
	}
}

