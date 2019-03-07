public class Vehicle {

	private int velocitatLimit;
	private int velocitatActual = 0;
	private boolean engegat = false;
	private String matricula;

	public Vehicle(int velocitatLimit, String matriculaCotxe) {
		this.velocitatLimit = velocitatLimit;
		this.matricula = matriculaCotxe;
	}

	public void engega() {
		engegat = true;
		caracteristicasCotxe();
	}

	public void caracteristicasCotxe() {
		System.out.println("Estic engegat.");
		System.out.println("Velocitat actual = " + velocitatActual);
		System.out.println("Límit de velocitat = " + velocitatLimit);
		System.out.println("Matrícula = " + matricula);
	}

	public void atura() {
		engegat = false;
		System.out.println("M'he aturat");
	}

	public void acelerar() {
		añadirVelocidad();
		caracteristicasCotxe();
	}

	public void añadirVelocidad() {
		if (engegat && ((velocitatActual + 10) < velocitatLimit)) {
			velocitatActual += 10;
		}
	}

	public void frenar() {
		quitarVelocidad();
		caracteristicasCotxe();
	}

	public void quitarVelocidad() {
		if (engegat && (velocitatActual > 0)) {
			velocitatActual -= 10;
		}
	}

	public void repararVehicle() {
		System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
	}

}
