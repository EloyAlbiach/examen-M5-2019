public class Vehicle {

	private static final int CANVI_DE_VELOCITAT_10 = 10;
	private int vLimit;
	private int velocitatActual = 0;
	private boolean engegat = false;
	private String matricula;

	public Vehicle(int velocitatLimit, String matriculaCotxe) {
		vLimit = velocitatLimit;
		matricula = matriculaCotxe;
	}

	public void engega() {
		engegat = true;
		situacioVehicle();
	}

	public void atura() {
		engegat = false;
		System.out.println("M'he aturat");
	}

	public void acc() {
		if (engegat && ((velocitatActual + CANVI_DE_VELOCITAT_10) < vLimit)) {
			velocitatActual += CANVI_DE_VELOCITAT_10;
		}
		situacioVehicle();
	}

	public void dec() {
		if (engegat && (velocitatActual > 0)) {
			velocitatActual -= CANVI_DE_VELOCITAT_10;
		}
		situacioVehicle();
	}

	public void repararVehicle() {
		System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
	}

	private void situacioVehicle() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + vLimit);
		System.out.println("Matrícula = " + matricula);
	}

}
