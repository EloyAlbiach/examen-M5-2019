public class Vehicle {

    private int vLimit;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matricula;

    public Vehicle (int velocitatLimit, String matriculaCotxe){
        vLimit = velocitatLimit;
        matricula = matriculaCotxe;
    }

    public void estatVehicle(String accio){
    	if(accio == "engegat"){System.out.println("Estic engegat.");engegat = true;}
    	if(accio == "atura"){System.out.println("M'he aturat");engegat = false;}
    	if (engegat && ((velocitatActual + 10) < vLimit) && (accio == "acc")){
            velocitatActual += 10;
        }
    	if (engegat && (velocitatActual > 0) && (accio == "dec")){
            velocitatActual -= 10;
        }
    	if (accio == "repararVehicle"){System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");}

    	if (accio!="repararVehicle" || engegat == true) {
            System.out.println("Velocitat actual = " + velocitatActual);
            System.out.println("Límit de velocitat = " + vLimit);
            System.out.println("Matrícula = " + matricula);
		}

    }

    public static void main (String [ ] args) {

    Vehicle v1 = new Vehicle(300, "miquelmartinleiva");

    v1.estatVehicle("engegat");
    v1.estatVehicle("atura");
    v1.estatVehicle("acc");
    v1.estatVehicle("dec");
    v1.estatVehicle("repararVehicle");

    }

}
