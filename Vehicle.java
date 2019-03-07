package eloyGit;

public class Vehicle {

    private int velocitatLimit;
    private int velocitatActual = 0;
    private boolean engegat = false;
    private String matriculaCotxe;

    public Vehicle (int velocitatLimit, String matriculaCotxe){
        this.velocitatLimit = velocitatLimit;
        this.matriculaCotxe = matriculaCotxe;
    }

    public void engegar (){
       this.engegat = true;
       System.out.println(this.estatActual());
    }

    public void aturar (){
        this.engegat = false;
        System.out.println(this.estatActual());
    }

    public void accelerar (){
        if (this.engegat && ((this.velocitatActual + 10) < this.velocitatLimit)){
            this.velocitatActual += 10;
        }
        System.out.println(this.estatActual());
    }

    public void decelerar (){
        if (this.engegat && (this.velocitatActual > 0)){
            this.velocitatActual -= 10;
        }
        System.out.println(this.estatActual());
    }

    public void repararVehicle (){
        System.out.println("El cotxe amb matrícula " + matriculaCotxe + " està en reparació.");
    }

	public String estatActual() {
		
		if (this.engegat) {
			return "Estic engegat."
					+ "\nVelocitat actual = " + this.velocitatActual
					+ "\nLímit de velocitat = " + this.velocitatLimit
					+ "\nMatrícula = " + this.matriculaCotxe;
		}
		else {
			return "M'he aturat";
		}
	}

}
