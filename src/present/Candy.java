package present;

public class Candy extends Sweets {
    public String trademark; // торговая марка

    public Candy(String name, int weight, double price, int quantity, String trademark) {
        super(name, weight, price, quantity);
        this.trademark = trademark;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    @Override
    public String toString() {
        return super.toString() + " шт. Тогововой марки: " + trademark;
    }
}
