package ru.sem5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TreeV3 {

// печать дерева файлов и папок через StringBuilder
public static void main(String[] args) {
    System.out.println("Print tree");
}
    /*
public static String renderDirectoryTree(TreeNode<FileInformation> tree) {
    List<StringBuilder> lines = renderDirectoryTreeLines(tree);
    String newline = System.getProperty("line.separator");
    StringBuilder sb = new StringBuilder(lines.size() * 20);
    for (StringBuilder line : lines) {
        sb.append(line);
        sb.append(newline);
    }
    return sb.toString();
}

public static List<StringBuilder> renderDirectoryTreeLines(TreeNode<FileInformation> tree) {
    List<StringBuilder> result = new LinkedList<>();
    result.add(new StringBuilder().append(tree.getData().getPath().getFileName()));
    Iterator<TreeNode<FileInformation>> iterator = tree.getChildren().iterator();
    while (iterator.hasNext()) {
        List<StringBuilder> subtree = renderDirectoryTreeLines(iterator.next());
        if (iterator.hasNext()) {
            addSubtree(result, subtree);
        } else {
            addLastSubtree(result, subtree);
        }
    }
    return result;
}

private static void addSubtree(List<StringBuilder> result, List<StringBuilder> subtree) {
    Iterator<StringBuilder> iterator = subtree.iterator();
    //subtree generated by renderDirectoryTreeLines has at least one line which is tree.getData()
    result.add(iterator.next().insert(0, "├── "));
    while (iterator.hasNext()) {
        result.add(iterator.next().insert(0, "│   "));
    }
}

private static void addLastSubtree(List<StringBuilder> result, List<StringBuilder> subtree) {
    Iterator<StringBuilder> iterator = subtree.iterator();
    //subtree generated by renderDirectoryTreeLines has at least one line which is tree.getData()
    result.add(iterator.next().insert(0, "└── "));
    while (iterator.hasNext()) {
        result.add(iterator.next().insert(0, "    "));
    }
     */
}