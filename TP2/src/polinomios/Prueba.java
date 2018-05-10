package polinomios;

public class Prueba {
	
	public static void main(String[] args) {
		Polinomio poli=new Polinomio(3);
		poli.cargarPOli();
		poli.verPoli();
		System.out.println(poli.evaluarRecurB(8));
		//System.out.println(poli.potenciaParoImpar(1,10000 ));	
	}
}
