import java.util.*;

public class Notebook {

    private String brand;
    private String model;
    private String ram;
    private String hardDiskDrive;
    private String operatingSystem;
    private String color;


    public Notebook(String brand, String model, String ram, String hardDiskDrive, String operatingSystem, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hardDiskDrive = hardDiskDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDiskDrive() {
        return hardDiskDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String result = String.format("Brand: %s; Model: %s; RAM: %s; HDD: %s; OS: %s; " +
                "Color: %s.", brand, model, ram, hardDiskDrive, operatingSystem, color);
        return result;
    }

    public boolean equalsBrand(String brand) {
        return this.brand.equals(brand);
    }

    public boolean equalsModel(String model) {
        return this.model.equals(model);
    }

    public boolean equalsRam(String ram) {
        return this.ram.equals(ram);
    }

    public boolean equalsHardDiskDrive(String hardDiskDrive) {
        return this.hardDiskDrive.equals(hardDiskDrive);
    }

    public boolean equalsOperatingSystem(String operatingSystem) {
        return this.operatingSystem.equals(operatingSystem);
    }

    public boolean equalsColor(String color) {
        return this.color.equals(color);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Notebook that)) return false;
        return this.equalsBrand(that.getBrand())
                && this.equalsModel(that.getModel())
                && this.equalsRam(that.getRam())
                && this.equalsHardDiskDrive(that.getHardDiskDrive())
                && this.equalsOperatingSystem(that.getOperatingSystem())
                && this.equalsColor(that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram, hardDiskDrive, operatingSystem, color);
    }

    //    public String getFilterMap() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Map.Entry entry : allNotebooks.entrySet()) {
//            stringBuilder.append(entry.getKey());
//            stringBuilder.append(": ");
//            stringBuilder.append(entry.getValue());
//            stringBuilder.append("\n");
//        }
//        return stringBuilder.toString();
//    }
}




