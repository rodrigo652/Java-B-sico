package entities;

import java.time.LocalDate;


public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag() {
        return getName()
                + " (used) $ "
                + getPrice()
                + " (Manufacture date:"
                + manufactureDate
                +")";
    }
}
