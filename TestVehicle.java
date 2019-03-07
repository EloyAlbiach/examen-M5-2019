package ExamenP2;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle bmw_m4 = new Vehicle(370, "ZCV-6661");
		
		bmw_m4.engega();
		for (int i=0;i<10;i++) {
			bmw_m4.acc();
		}

		while (bmw_m4.velocidadActual() != 0) {
			bmw_m4.dec();
		}

		if (bmw_m4.velocidadActual() == 0) bmw_m4.atura();

		bmw_m4.repararVehicle();
	}
}
