import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListNotebooks {
    private List<Notebook> notebookList;
    private List<Notebook> temp;


    public ListNotebooks() {
        this.temp = new ArrayList<>(); // храню все мои ноутбуки
        FillList();
        this.notebookList = List.copyOf(this.temp);
    }

    private void FillList() {
        Notebook notebook0 = new Notebook("Lenovo", "N34", "8", "256",
                "Linux", "Black");
        Notebook notebook1 = new Notebook("Lenovo", "M32", "8", "256",
                "Windows", "Grey");
        Notebook notebook2 = new Notebook("Lenovo", "P98", "16", "512",
                "Linux", "Black");
        Notebook notebook3 = new Notebook("HP", "TR8234", "16", "512",
                "Windows", "Black");
        Notebook notebook4 = new Notebook("Apple", "MacBook Air", "8", "256",
                "MacOs", "Grey");
        Notebook notebook5 = new Notebook("Apple", "MacBook Pro", "16", "512",
                "MacOs", "Grey");
        Notebook notebook6 = new Notebook("Apple", "MacBook pro", "16", "1024",
                "MacOs", "Black");

        temp.add(notebook0);
        temp.add(notebook1);
        temp.add(notebook2);
        temp.add(notebook3);
        temp.add(notebook4);
        temp.add(notebook5);
        temp.add(notebook6);
    }

    public List<Notebook> getNotebookList() {
        return notebookList;
    }

    public List<Notebook> getFilteredList(Map<String, String> filters) {
        this.notebookList = new ArrayList<>();
        for (Notebook notebook : this.temp) {
            boolean flag = true;
            if (filters.containsKey("brand") && !notebook.equalsBrand(filters.get("brand"))) {
                flag = false;
            }
            if (filters.containsKey("model") && !notebook.equalsModel(filters.get("model"))) {
                flag = false;
            }
            if (filters.containsKey("ram") && !notebook.equalsRam(filters.get("ram"))) {
                flag = false;
            }
            if (filters.containsKey("hardDiskDrive") && !notebook.equalsHardDiskDrive(filters.get("hardDiskDrive"))) {
                flag = false;
            }
            if (filters.containsKey("operatingSystem") && !notebook.equalsOperatingSystem(filters.get("operatingSystem"))) {
                flag = false;
            }
            if (filters.containsKey("color") && !notebook.equalsColor(filters.get("color"))) {
                flag = false;
            }
            if(flag){
                notebookList.add(notebook);
            }
        }
        return getNotebookList();
    }
}
