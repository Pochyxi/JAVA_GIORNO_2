
public class Esercizio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s1 = new Sim("3390990498");
		Sim s2 = new Sim("3290980288");
		Sim s3 = new Sim("3220980222");
		s1.datiSim();
		s1.ricaricaSim(15);
		s1.visualizzaChiamate();
		s1.chiamata(s2);
		s1.chiamata(s2);
		s2.chiamata(s3);
		s2.chiamata(s1);
//		s1.visualizzaChiamate();
		s2.visualizzaChiamate();
	}
}
