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
    	mensajeEstadoVehiculo();
    }

    public void atura (){
        engegat = false;
        System.out.println("M'he aturat");
    }

    public void acceleracio (){
    	velocitatActual += 10;
    	
        if (engegat && (velocitatActual < vLimit)){
            velocitatActual += 10;
        }
        mensajeEstadoVehiculo();
    }

    public void deceleracio (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= 10;
        }
        mensajeEstadoVehiculo();
    }

    public void VehicleEnReparacio (){
        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    }
    
    public void mensajeEstadoVehiculo() {
        System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
    }

}
