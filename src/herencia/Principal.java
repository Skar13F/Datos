package herencia;

public class Principal {
	static PNumerico bits = new PNumerico();
	static PNumerico corto = new PNumerico();
	static PNumerico entero = new PNumerico();
	static PNumerico largo = new PNumerico();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bits.setNombre("byte");
		bits.setLongitud("-128 a 127");
		bits.setDescripcion("Es el entero mas corto");
		bits.setPrimitivo("si");
		bits.setBits((byte)10);
		System.out.println(bits.getNombre()+" | "+ bits.getLongitud()+" | "+ bits.getDescripcion()+" | "+ bits.getPrimitivo());
		
		corto.setNombre("short");
		corto.setLongitud("-32768 a 32767");
		corto.setDescripcion("este es un entero corto");
		corto.setPrimitivo("si");
		corto.setCorto((short)7);
		System.out.println(corto.getNombre()+" | "+ corto.getLongitud()+" | "+ corto.getDescripcion()+" | "+ corto.getPrimitivo());
		

	}

}
