package lesson2;

public class Car {
    public String name;
    public String price;
    public String engType;
    public String engPower;
    public int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String name) {
        this.name = name;
        this.price = "1000";
        this.engType = "V8";
        this.engPower = "123";
        this.maxSpeed = 100;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append(", engType='").append(engType).append('\'');
        sb.append(", engPower='").append(engPower).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append('}');
        return sb.toString();
    }
}
