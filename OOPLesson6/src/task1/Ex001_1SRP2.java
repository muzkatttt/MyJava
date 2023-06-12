package task1;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

class Planner {

    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }

    public void saveAllText(String path) {
        /// ошибки связанные с...
    }
    
    public void loadFromFile(String path) {
        /// ошибки связанные с...
    }

    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
    }
}