import java.util.Scanner;

public class Viaje {

	Persona persona = new Persona();
	private String destino;
	private int distancia;

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public void viajar() {
		Scanner tc = new Scanner(System.in);

		System.out.println("Ingrese su nombre");
		persona.setNombre(tc.next());

		System.out.println("Ingrese su destino");
		setDestino(tc.next());

		System.out.println("Ingrese la distancia en kilómetros");
		setDistancia(pedirNumero());

		System.out.println("Ingrese vehículo [1] Bicicleta, [2] Motocicleta, [3] Auto");
		elegirVehiculo(pedirNumero());
	}
	public static int pedirNumero() {
		Scanner tc = new Scanner(System.in);
		try {
			return tc.nextInt();
		}catch (Exception e) {
			System.out.println("Ingrese un número válido");
			return pedirNumero();
		}
	}
	public void elegirVehiculo(int ans){
		switch (ans){
			case 1:
				Bicicleta bicicleta = new Bicicleta();
				System.out.println("Hola "+ persona.getNombre()+"!, el tiempo de viaje aproximado para llegar a "+this.destino+" en Bicicleta es de: "+bicicleta.viajarBici(this.distancia)+" horas");
				break;
			case 2:
				Motocicleta motocicleta = new Motocicleta();
				System.out.println("Hola "+ persona.getNombre()+"!, el tiempo de viaje aproximado para llegar a "+this.destino+" en Motocicleta es de: "+motocicleta.viajarMoto(this.distancia)+" horas");
				break;
			case 3:
				Auto auto = new Auto();
				System.out.println("Hola "+ persona.getNombre()+"!, el tiempo de viaje aproximado para llegar a "+this.destino+" en Auto es de: "+auto.viajarAuto(this.distancia)+" horas");
				break;
			default:
				System.out.println("Opción no válida");
		}
	}

}