package entities.enums;

public class Conversor {

    public static final double IOF = 0.06;

    public static double currencyConverter(double dollar, double quantity) {

        return (dollar * quantity) + ((dollar * quantity) * IOF);
    }


}
