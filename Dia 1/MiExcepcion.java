public class MiExcepcion{
	public class DivideEntreCero extends Exception{
		public DivideEntreCero(){
			System.out.println("No puedes dividir entre cero");

		}
	}
	//Un método
	public double Dividir(double num,double den) throws DivideEntreCero{
		if(den==0){
			throw new DivideEntreCero();
		}
		return (num/den);
	}
	public static void main(String[] args) throws DivideEntreCero{
		MiExcepcion miex = new MiExcepcion();
		System.out.println("La división es: "+(double)miex.Dividir(2.0,0));
	}
}