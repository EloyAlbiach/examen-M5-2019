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
        System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
    }

    public void atura (){
        engegat = false;
        System.out.println("M'he aturat");
    }

    public void acc (){
        if (engegat && ((velocitatActual + 10) < vLimit)){
            velocitatActual += 10;
        }
        System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
    }

    public void dec (){
        if (engegat && (velocitatActual > 0)){
            velocitatActual -= 10;
        }

    }

    public void repararVehicle (){
        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
    }
    
    public void mensaje() {
        System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + velocitatActual);
        System.out.println("Límit de velocitat = " + vLimit);
        System.out.println("Matrícula = " + matricula);
    }

}
