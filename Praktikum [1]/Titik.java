/**
 * File      	  : Titik.java		21/02/24
 * Nama penulis   : Sajid Nouval
 * NIM            : 24060122140110
 * Deskripsi 	  : Kelas yang berisi main dari Titik
 * 
 */

class Titik {
	//Atribut
	double absis, ordinat;
	static double counterTitik;

	//Constructor
	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double a, double b) {
		absis = a;
		ordinat = b;
		counterTitik++;
	}
		
	//Absis
	void setAbsis(double a) {
		absis = a;
	}	
	
	double getAbsis() {
		return absis;
	}

	//Ordinat
	void setOrdinat(double b) {
		ordinat = b;
	}

	double getOrdinat() {
		return ordinat;
	}

	//CounterTitik
	static double getcounterTitik() {
		return counterTitik;
	}
	
}
