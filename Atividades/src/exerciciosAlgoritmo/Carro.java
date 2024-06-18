package exerciciosAlgoritmo;

public class Carro {

    private double capacidadeTanque;
    private double combustivelAbastecido;
    private double quilometragemPercorrida;

    public Carro(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void abastecer(double litrosAbastecidos) {
        if (litrosAbastecidos > capacidadeTanque) {
            throw new IllegalArgumentException("Quantidade de litros excede a capacidade do tanque");
        }

        this.combustivelAbastecido = litrosAbastecidos;
    }

    public void registrarQuilometragem(double quilometragemPercorrida) {
        if (quilometragemPercorrida < 0) {
            throw new IllegalArgumentException("Quilometragem não pode ser negativa");
        }

        this.quilometragemPercorrida = quilometragemPercorrida;
    }

    public double calcularConsumoMedio() {
        if (quilometragemPercorrida == 0) {
            return 0;
        }

        return quilometragemPercorrida / combustivelAbastecido;
    }

    public double calcularAutonomiaRestante() {
        if (consumoMedio() == 0) {
            return 0;
        }

        return (capacidadeTanque - combustivelAbastecido) * consumoMedio();
    }

    private double consumoMedio() {
        return calcularConsumoMedio();
    }


	public static void executarPrograma()  {
	
        	Carro carro = new Carro(55); // Capacidade do tanque em litros
    	
        	carro.abastecer(10); // Abastece com 35 litros
        	carro.registrarQuilometragem(100); // Registra 400 km rodados
	
	        System.out.printf("Consumo médio: %.2f km/l\n", carro.calcularConsumoMedio());
	        System.out.printf("Autonomia restante: %.2f km\n", carro.calcularAutonomiaRestante());
	    
	}
}