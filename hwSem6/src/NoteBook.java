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
    NoteBook n0 = new NoteBook();
    n0.brand = "Lenovo";

    @Override
    public String toString() {
        String result = String.format("brand: %s \n model: %s ram: %d \n hardDiskDrive: %d \n operatingSystem: %s \n color: %s",
                brand, model, ram, hardDiskDrive, operatingSystem, color);
        return result;
    }

}
