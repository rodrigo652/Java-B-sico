package exerciciosAlgoritmo3;

public enum Cabelo {
	LOIRO("l"),
	CASTANHO("C"),
	PRETO("P");
	
	final String codigo;
	
	Cabelo(String codigo){
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public static Cabelo valueOfCodigo(String codigo) {
		for (Cabelo cabelo : values()) {
			if (cabelo.codigo.equalsIgnoreCase(codigo)) {
				return cabelo;
			}
		}
		throw new IllegalArgumentException("Código de cor do cabelo inválido: " + codigo);
	}
}
