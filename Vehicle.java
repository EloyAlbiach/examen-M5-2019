public class Vehicle {

    private int vLimit;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matricula;

    public Vehicle (int velocitatLimit, String matriculaCotxe){
        vLimit = velocitatLimit;
        matricula = matriculaCotxe;
    }
    
    public void mensajes(int select) {
    	if (select==0) System.out.println("M'he aturat");
    	if (select==1) System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    	if (select==2) estado();
    }
    
    public void estado() {
    	System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
    }

    public void engega (){
       engegat = true;
       mensajes(2);
    }

    public void atura (){
        engegat = false;
        mensajes(0);
    }

    public void acc (){
        if (engegat && ((velocitatActual + 10) < vLimit)){
            velocitatActual += 10;
        }
        mensajes(2);
    }

    public void dec (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= 10;
        }
        mensajes(2);
    }

    public void repararVehicle (){
    	mensajes(1);
    }

}
