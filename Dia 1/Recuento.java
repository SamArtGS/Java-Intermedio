import java.util.Scanner;
public class Recuento{
	public static void main(String[] args) throws Exception{
		String comida;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Escribe el nombre de alguna comida, presiona < S > para salir. ");
			comida=entrada.nextLine();
			if(comida.equals("s")){
				break;
			}else{
				try{
					revisaComida(comida);
				}catch(BuenaComidaException error){
					System.out.println(error.getMessage());
				}
			}
		}while (!comida.equals("s"));
	}
	public static void revisaComida(String comida) throws Exception{
		if(comida.equalsIgnoreCase("brocoli")||comida.equalsIgnoreCase("espinacas")){
			throw new BuenaComidaException();
		}else{
		System.out.println("Yumi Yumi \n");
	}
}
public static class BuenaComidaException extends Exception{
		@Override
		public String getMessage(){
			return "Muy nutritivo";
		}
	}
}