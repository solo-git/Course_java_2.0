package present;

public class Biscuit extends Sweets {
    public String view; // вид печенья

    public Biscuit(String name, int weight, double price, int quantity, String view) {
        super(name, weight, price, quantity);
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return super.toString() + " уп. Вид печенья: " + view;
    }
}
