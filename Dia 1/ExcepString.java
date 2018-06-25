public class ExcepString{
	public class NoEnteros extends Exception{
		public NoEnteros(){
			System.out.println("NO quiero enteros");
		}
	}
	public class NoDoubles extends Exception{
		public NoDoubles(){
			System.out.println("NO quiero doubles");
		}
	}
	public boolean Ingresa(String stringing) throws NoEnteros, NoDoubles{
		if(stringing.parseDouble()){
			if(stringing.paseInt()){
				throw new NoEnteros();
			}else{
				throw new NoDoubles();
			}
		}else{
				return true;
		}
	}
	public static void main(String[] args) {
		ExcepString letra = new ExcepString();
		System.out.println("Las letras insertadas son: "+letra.Ingresa());
	}
}