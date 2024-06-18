package exerciciosAlgoritmo;

public enum Mes {
    JANEIRO(1),
    FEVEREIRO(2),
    MARÇO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);
	
	private final int numero;
	
    Mes(int numero) {
        this.numero = numero;
    }
    
    public String getNome() {
        return switch (this) {
            case JANEIRO -> "Janeiro";
            case FEVEREIRO -> "Fevereiro";
            case MARÇO -> "Março";
            case ABRIL -> "Abril";
            case MAIO -> "Maio";
            case JUNHO -> "Junho";
            case JULHO -> "Julho";
            case AGOSTO -> "Agosto";
            case SETEMBRO -> "Setembro";
            case OUTUBRO -> "Outubro";
            case NOVEMBRO -> "Novembro";
            case DEZEMBRO -> "Dezembro";
        };
    }
    
    public static Mes fromNumero(int numero) {
        for (Mes mes : Mes.values()) {
            if (mes.numero == numero) {
                return mes;
            }
        }
        return null;
    }
}