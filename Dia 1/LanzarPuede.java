public class LanzarPuede{
	public void Prueba() throws Exception{
		ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
		int a = 101;
		int b = 10;
		if(a>100||b>100){
			System.out.println("A o B son mayores que 100");
			throw e;
		}else{
			System.out.println("Ninguno es mayor que 100, por lo tanto no se manda la excepción");
		}
	}
	public static void main(String[] args) throws Exception{
		LanzarPuede a = new LanzarPuede();
		a.Prueba();
	}
}