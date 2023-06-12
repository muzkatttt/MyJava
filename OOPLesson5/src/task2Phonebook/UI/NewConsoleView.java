package task2Phonebook.UI;

public class NewConsoleView extends Ex002Phonebook.UI.ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();
    }

}
