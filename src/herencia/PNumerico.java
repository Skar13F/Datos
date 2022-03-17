package herencia;

public class PNumerico extends Primitivos{
	private byte bits;
	private short corto;
	private int entero;
	private long largo;
	
	public PNumerico() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public byte getBits() {
		return bits;
	}

	public void setBits(byte bits) {
		this.bits = bits;
	}

	public short getCorto() {
		return corto;
	}

	public void setCorto(short corto) {
		this.corto = corto;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public long getLargo() {
		return largo;
	}

	public void setLargo(long largo) {
		this.largo = largo;
	}
	

	//PNumerico() {
		//setNombre("byte");
		//System.out.println("El nombre es: " + getNombre());
	//}

}