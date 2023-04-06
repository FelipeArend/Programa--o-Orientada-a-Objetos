package POO;

public class Operacao {
	protected int Numero1;
	protected int Numero2;
	
	public float getNumero1() {
		return Numero1;
	}
	public  void setNumero1(int numero1) {
		Numero1 = numero1;
	}
	public float getNumero2() {
		return Numero2;
	}
	public void setNumero2(int numero2) {
		Numero2 = numero2;
	}
	public float calcula(int prm1, int prm2) {
		System.out.println("Não sera possivel calcular!!!");
		return -1;
	}

}
