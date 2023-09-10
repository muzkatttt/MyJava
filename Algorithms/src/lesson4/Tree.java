package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root; // от root дерево начинает свой отсчет

    // разобьем поиск на две функции - поиск ноды и ее отображение, если она найдена
    /*
    private Node find(Node node, int value) {
        // функция find для поиска в глубину дерева
        if (node.value == value) {
            return node;
        } else {
            for(Node child : node.children) {
                Node result = find(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
    public boolean exist(int value) {
        // функция exist возвращает элемент в структуре либо выдает false, если его нет
        if (root != null) {
            Node node = find(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }
    */

    // функция find2 для поиска ноды в ширину

    private Node find2(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }
    public class Node {
        int value;

        List<Node> children;

    }
}
