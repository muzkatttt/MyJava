package models;

public class Tea extends HotDrink{
    private boolean isGreen;
    private String region;


    public Tea(int temperature, int cost, int id, boolean isReadyToServe, boolean isGreen, String region) {
        super(temperature, cost, id, isReadyToServe);
        this.isGreen = isGreen;
        this.region = region;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean isReadyToServe() {
        return super.isReadyToServe();
    }

    @Override
    public void setReadyToServe(boolean readyToServe) {
        super.setReadyToServe(readyToServe);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "isGreen=" + isGreen +
                ", region='" + region + '\'' +
                ", temperature=" + temperature +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
