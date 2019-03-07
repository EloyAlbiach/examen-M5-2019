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
			printSpecs();
		} else {
			System.out.println("M'he aturat");
		}
	}

	private void printSpecs() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + vLimit);
		System.out.println("Matrícula = " + matricula);
	}

	public void acc() {
		if (engegat && ((velocitatActual + 10) < vLimit)) {
			velocitatActual += 10;
		}
		printSpecs();
	}

	public void dec() {
		if (engegat && (velocitatActual > 0)) {
			velocitatActual -= 10;
		}
		printSpecs();
	}

	public void repararVehicle() {
		System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
	}

}
