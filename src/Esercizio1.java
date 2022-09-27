
public class Esercizio1 {

	public static void main(String[] args) {
		Rettangolo rett1 = new Rettangolo(10, 29);
//		rett1.stampaRettangolo();
		Rettangolo rett2 = new Rettangolo(24, 45);
		
		stampaDueRettangoli(rett1, rett2);
		
		

	}
	
	static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		int sommaArea = r1.area + r2.area;
		int sommaPerimetro = r1.perimetro + r2.perimetro;
		
		System.out.println("L'area del primo rettangolo è di " + r1.area + ", del secondo " + r2.area);
		System.out.println("Il perimetro del primo rettangolo è di " + r1.perimetro + ", del secondo " + r2.perimetro);
		System.out.println("La somma delle aree è di " + sommaArea);
		System.out.println("La somma dei perimetri è di " + sommaPerimetro);
	};

}

class Rettangolo {
	int altezza;
	int larghezza;
	int perimetro;
	int area;
	
	Rettangolo(int _altezza, int _larghezza) {
		this.altezza = _altezza;
		this.larghezza = _larghezza;
		this.perimetro = this.perimetro();
		this.area = this.area();
		
	};
	
	 int perimetro() {
		return this.altezza + this.larghezza * 2;
		
		
	};
	int area() {
		return this.altezza * this.larghezza;
		
	};
	
	void stampaRettangolo() {
		System.out.println("L'area del rettangolo è di " + this.area + ", mentre il perimetro è di " + this.perimetro());
	};
};