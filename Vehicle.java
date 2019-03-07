
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
       mensaje();
    }

    public void atura (){
        engegat = false;
        System.out.println("M'he aturat");
    }

    public void acelerar (){
        if (engegat && ((velocitatActual + 10) < vLimit)){
            velocitatActual += 10;
        }
        mensaje();
    }

	private void mensaje() {
		System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
	}

    public void frenar (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= 10;
        }
        mensaje();
    }



    public void repararVehicle (){
        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    }

}
