public class Vehicle {

	private int vLimit;
	private int velocitatActual = 0;
	private boolean engegat = false;
	private String matricula;

	public Vehicle(int velocitatLimit, String matriculaCotxe) {
		vLimit = velocitatLimit;
		matricula = matriculaCotxe;
	}

	public void engegaOAtura() {
		if (engegat) {
			engegat = false;
			System.out.println("M'he aturat");
		} else {
			engegat = true;
			printSpecs();
		}
	}

	private void printSpecs() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + vLimit);
		System.out.println("Matrícula = " + matricula);
		System.out.println("\n");
	}

	public void accODec() {
		if (engegat && ((velocitatActual + 10) < vLimit)) {
			velocitatActual += 10;
		} else if (engegat && (velocitatActual > 0)) {
			velocitatActual -= 10;
		}

		printSpecs();

	}

	public void repararVehicle() {
		System.out.println("El cotxe amb matrícula " + matricula + " està  en reparació.\n");
	}

}
