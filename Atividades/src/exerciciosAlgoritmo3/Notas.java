package exerciciosAlgoritmo3;

public enum Notas {
	
	OTIMO('a'),
	BOM('b'),
	REGULAR('c'),
	RUIM('d'),
	PESSIMO('e');
	
	private final Character codigo; 

	Notas(Character codigo) {
        this.codigo = codigo;
    }

    public Character getCodigo() {
        return codigo;
    }
    
	public static Notas valueOfCodigo(Character codigo) {
		for (Notas nota : Notas.values()) {
			if (nota.codigo.equals(codigo)) {
				return nota;
			}
		}
		throw new IllegalArgumentException("Código de notas inválido: " + codigo);
	}

}
