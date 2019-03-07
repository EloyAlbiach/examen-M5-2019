public class Vehicle {

    private int vLimit;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matricula;

    public Vehicle(int velocitatLimit, String matriculaCotxe) {
        vLimit = velocitatLimit;
        matricula = matriculaCotxe;
    }

    public void engegaAtura() {
        if (!this.engegat) {
            this.engegat = true;
            this.toPrint();
        } else {
            this.engegat = false;
            System.out.println("M'he aturat");
        }


    }

    public void decAcc() {
        if (engegat && (velocitatActual > 0)) {
            velocitatActual -= 10;
        } else if (engegat && ((velocitatActual + 10) < vLimit)) {
            velocitatActual += 10;
        }
        this.toPrint();
    }

    public void repararVehicle() {
        System.out.println("El cotxe amb matrícula " + this.matricula + " està en reparació.");
    }

    public void toPrint() {
        System.out.println("Estic engegat.");
        System.out.println("Velocitat actual = " + this.velocitatActual);
        System.out.println("Límit de velocitat = " + this.vLimit);
        System.out.println("Matrícula = " + this.matricula);
    }

}
