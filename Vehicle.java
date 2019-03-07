public class Vehicle {

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
        infoEngegat();
    }

	private void infoEngegat() {
		System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
	}

    public void atura (){
        engegat = false;
        System.out.println("M'he aturat");
    }

    public void accelerar (){
        if (menorVelLimit()){
            velocitatActual += 10;
        }
        infoEngegat();
    }

	private boolean menorVelLimit() {
		return engegat && ((velocitatActual + 10) < vLimit);
	}

    public void decelerar (){
        if (estaEngegat()){
            velocitatActual -= 10;
        }
        infoEngegat();
    }

	private boolean estaEngegat() {
		return engegat && (velocitatActual > 0);
	}

    public void repararVehicle (){
        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    }

}
