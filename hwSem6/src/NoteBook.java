import java.util.List;

public class NoteBook {

    private String brand;
    private String model;
    private Integer ram;
    private Integer hardDiskDrive;
    private String operatingSystem;
    private String color;

    public NoteBook(String brand, String model, int ram, int hardDiskDrive, String operatingSystem, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.hardDiskDrive = hardDiskDrive;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

//    @Override
//    public String toString() {
//        return "brand: " + brand + ", model: " + model + ", ram: " + ram + ", hardDiskDrive: " + hardDiskDrive +
//                ", operatingSystem: " + operatingSystem + ", color: " + color;
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
