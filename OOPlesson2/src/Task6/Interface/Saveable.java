package Task6.Interface;

import Task6.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
