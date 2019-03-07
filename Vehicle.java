public class Vehicle {

    private static final int MIN_VELOCITY = 10;
    private int vLimit;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matricula;

    public Vehicle(int velocitatLimit, String matriculaCotxe) {
        this.vLimit = velocitatLimit;
        this.matricula = matriculaCotxe;
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
        if (this.engegat && (this.velocitatActual > 0)) {
            this.velocitatActual -= MIN_VELOCITY;
        } else if (this.engegat && ((this.velocitatActual + MIN_VELOCITY) < this.vLimit)) {
            this.velocitatActual += MIN_VELOCITY;
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
