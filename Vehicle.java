package ExamenP2;
public class Vehicle {

	private static int VLIMIT = 260;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matricula;

    public Vehicle (int velocitatLimit, String matriculaCotxe){
        VLIMIT = velocitatLimit;
        matricula = matriculaCotxe;
    }
    
    private void mensajes(int select) {
    	if (select==0) System.out.println("M'he aturat");
    	if (select==1) System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    	if (select==2) System.out.println("Estic engegat.");
    	if (select==3) {
    		System.out.println("Velocitat actual = " + velocitatActual);
            System.out.println("Límit de velocitat = " + VLIMIT);
    	}
    }
    
    public int velocidadActual() {
    	return velocitatActual;
    }
    
    private void estado() {
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + VLIMIT);
        System.out.println("Matrícula = " + matricula);
    }

    public void engega (){
       engegat = true;
       mensajes(2);
       estado();
    }

    public void atura (){
        engegat = false;
        mensajes(0);
    }

    public void acc (){
        if (engegat && ((velocitatActual + 10) < VLIMIT)){
            velocitatActual += 10;
        }
        mensajes(3);
    }

    public void dec (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= 10;
        }
        mensajes(3);
    }

    public void repararVehicle (){
    	mensajes(1);
    }

}
