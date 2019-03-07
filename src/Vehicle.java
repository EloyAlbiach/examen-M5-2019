package Examen_Ex4;

public class Vehicle {

    private static final int VELOCITAT_10 = 10;
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
        imprimirDatos();
    }

	private void imprimirDatos() {
		System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
	}

    public void atura (){
        engegat = false;
        System.out.println("M'he aturat");
    }

    public void acelerar (){
        if (engegat && ((velocitatActual + VELOCITAT_10) < vLimit)){
            velocitatActual += VELOCITAT_10;
        }
        imprimirDatos();
    }

    public void frenar (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= VELOCITAT_10;
        }
        imprimirDatos();
    }

    public void repararVehicle (){
        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    }

}
