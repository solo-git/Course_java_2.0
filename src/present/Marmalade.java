package present;

public class Marmalade extends Sweets {
    public int packaging; // количество в упаковке

    public Marmalade(String name, int weight, double price, int quantity, int packaging) {
        super(name, weight, price, quantity);
        this.packaging = packaging;
    }

    public int getPackaging() {
        return packaging;
    }

    public void setPackaging(int packaging) {
        this.packaging = packaging;
    }

    @Override
    public String toString() {
        return super.toString() + " уп. Всего в упаковках: " + quantity * packaging;
    }
}
