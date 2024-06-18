package exerciciosAlgoritmo3;

public enum Olhos {

    AZUIS("a"),
    VERDES("v"),
    CASTANHO("c");

    private final String codigo; 

    Olhos(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    
	public static Olhos valueOfCodigo(String codigo) {
		for (Olhos olho : Olhos.values()) {
			if (olho.codigo.equalsIgnoreCase(codigo)) {
				return olho;
			}
		}
		throw new IllegalArgumentException("Código de cor do olho inválido: " + codigo);
	}
}

