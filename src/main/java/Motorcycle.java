public class Motorcycle {

    private String model,power;
    private int price;

    public Motorcycle(String model, String power, int price) {
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public Motorcycle() {};

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPowerm() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MOTORCYCLE: \n" +
                "model: " + this.model + ", " +
                "power: " + this.power  + ", " +
                "price: " + this.price +"$";
    }
}
