public class Car {

    private String model;
    private int price;

    public Car() {};

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CAR: \n" +
                "model: " + this.model + ", " +
                "price: " + this.price +"$";
    }
}
