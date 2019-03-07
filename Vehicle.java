public class Vehicle {

	  private static final int CAMBI_VELOCITAT = 10;
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
	        esticEngegat();
	    }

	    public void atura (){
	        engegat = false;
	        System.out.println("M'he aturat");
	    }

	    public void acelera (){
	        if (engegat && ((velocitatActual + CAMBI_VELOCITAT) < vLimit)){
	            velocitatActual += CAMBI_VELOCITAT;
	        }
	        esticEngegat();
	    }

		private void esticEngegat() {
			System.out.println("Estic engegat.");
	        System.out.println("Velocitat actual = " + velocitatActual);
	        System.out.println("Límit de velocitat = " + vLimit);
	        System.out.println("Matrícula = " + matricula);
		}

	    public void decelera (){
	        if (engegat && (velocitatActual > 0)){
	            velocitatActual -= CAMBI_VELOCITAT;
	        }
	        esticEngegat();
	    }

	    public void repararVehicle (){
	        System.out.println("El cotxe amb matrícula " + matricula + " està en reparació.");
	    }

}
