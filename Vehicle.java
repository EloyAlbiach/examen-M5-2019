public class Vehicle {

	private static final int DIFERENCIA_VELOCITAT = 10;

	private int vLimit;
	private int velocitatActual = 0;
	private boolean engegat = false;
	private String matricula;

	public Vehicle (int velocitatLimit, String matriculaCotxe){
		vLimit = velocitatLimit;
		matricula = matriculaCotxe;
	}

	public void engega (){
		engegat = true;
		imprimirDades();
	}

	public void atura (){
		engegat = false;
		System.out.println("M'he aturat");
	}

	public void acceleracio (){
		if (engegat && ((velocitatActual + DIFERENCIA_VELOCITAT) < vLimit)) velocitatActual += 10;
		imprimirDades();
	}

	public void desacceleracio (){
		if (engegat && (velocitatActual > 0)) velocitatActual -= DIFERENCIA_VELOCITAT;
		imprimirDades();
	}

	public void repararVehicle (){
		System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
	}

	private void imprimirDades() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + vLimit);
		System.out.println("Matrícula = " + matricula);
	}

}