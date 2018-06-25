import java.util.Scanner;
import java.util.InputMismatchException;

public class Excepcion{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean bandera = true;

	do{
		try{
			System.out.printf("Ingresa un n%cmero entero: ",163);
			int num = sc.nextInt();
			System.out.println("Tu numero es: "+num);
			System.out.println("La division es: "+7/num);
		}catch(InputMismatchException ime){
			System.out.println("Se espera un entero");
			sc.nextLine();
		}catch(ArithmeticException ae){
			System.out.println("No se puede dividir entre 0");
			sc.nextLine();
		}finally{
			System.out.println("Siempre imprime");
		}
	}while(bandera);
}
}