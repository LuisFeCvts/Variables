import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		int edad = 18;
	int faltante;
		System.out.println("Dame tu edad");
		Scanner user_input = new Scanner (System.in);

edad = user_input.nextInt();
		
		System.out.println(edad);
		System.out.println(edad/2 + 7);
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			faltante= 18-edad;
			System.out.println("Numero de años que te faltan "+ faltante);
	    }
	}

}
