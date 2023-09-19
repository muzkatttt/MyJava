package sem4;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    enum Color {red, black}

    Node root;
    private int size;

    public boolean add(T value) {
        if (root == null) {
            root = new Node(value);
            root.color = Color.black;
            size++;
            return true;
        }
        return addNode(root, value) != null;
    }

    private Node addNode(Node node, T value) {
        if (node.value.compareTo(value) == 0)
            return null;
        if (node.value.compareTo(value) > 0) { // Left
            if (node.left == null) {
                node.left = new Node(value);
                size++;
                return node.left;
            }
            Node added = addNode(node.left, value);
            node.left = rebalance(node.left);
            return added;
        }
        if (node.right == null) {
            node.right = new Node(value);
            size++;
            return node.right;
        }
        Node added = addNode(node.right, value);
        node.right = rebalance(node.right);
        return added;
    }

    private Node rebalance(Node node) {
        boolean needRebalance = true;
        Node result = node;
        while (needRebalance) {
            needRebalance = false;
            //LeftSwap
            if (result.left != null && result.left.left != null &&
                    result.left.isRed() && result.left.left.isRed()) {
                result = leftSwap(result);
                needRebalance = true;
            }
            //RightSwap
            if (result.right != null && result.right.isRed() &&
                    (result.left == null || result.left.isBlack())) {
                result = rightSwap(result);
                needRebalance = true;
            }
            //ColorSwap
            if (result.left != null && result.right != null &&
                    result.left.isRed() && result.right.isRed()) {
                colorSwap(result);
                needRebalance = true;
            }
        }
        return result;
    }

    private Node leftSwap(Node node) {
        Node left = node.left;
        Node between = node.left.right;
        left.right = node;
        node.left = between;
        left.color = node.color;
        node.color = Color.red;
        return left;
    }

    private Node rightSwap(Node node) {
        Node right = node.right;
        Node between = node.right.left;
        right.left = node;
        node.right = between;
        right.color = node.color;
        node.color = Color.red;
        return right;
    }

    private void colorSwap(Node node) {
        node.left.color = Color.black;
        node.right.color = Color.black;
        node.color = Color.red;
    }

    private class Node {
        T value;
        Node left;
        Node right;
        Color color;

        Node() {
            color = Color.red;
        }

        Node(T value) {
            color = Color.red;
            this.value = value;
        }

        public boolean isRed() {
            return color == Color.red;
        }

        public boolean isBlack() {
            return color == Color.black;
        }
    }


    private class PrintNode {
        Node node;
        String str;
        int depth;

        public PrintNode() {
            node = null;
            str = " ";
            depth = 0;
        }

        public PrintNode(Node node) {
            depth = 0;
            this.node = node;
            this.str = node.value.toString();
        }
    }

    public void print() {

        int maxDepth = maxDepth() + 3;
        int nodeCount = nodeCount(root, 0);
        int width = 50;//maxDepth * 4 + 2;
        int height = nodeCount * 5;
        List<List<PrintNode>> list = new ArrayList<List<PrintNode>>();
        //Создание ячеек массива
        for (int i = 0; i < height; i++)  {
            ArrayList<PrintNode> row = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                row.add(new PrintNode());
            }
            list.add(row);
        }

        list.get(height / 2).set(0, new PrintNode(root));
        list.get(height / 2).get(0).depth = 0;

        for (int j = 0; j < width; j++)  /*Принцип заполнения*/ {
            for (int i = 0; i < height; i++) {
                PrintNode currentNode = list.get(i).get(j);
                if (currentNode.node != null) {
                    currentNode.str = currentNode.node.value.toString();
                    if (currentNode.node.left != null) {
                        int in = i + (maxDepth / (int) Math.pow(2, currentNode.depth));
                        int jn = j + 3;
                        printLines(list, i, j, in, jn);
                        list.get(in).get(jn).node = currentNode.node.left;
                        list.get(in).get(jn).depth = list.get(i).get(j).depth + 1;

                    }
                    if (currentNode.node.right != null) {
                        int in = i - (maxDepth / (int) Math.pow(2, currentNode.depth));
                        int jn = j + 3;
                        printLines(list, i, j, in, jn);
                        list.get(in).get(jn).node = currentNode.node.right;
                        list.get(in).get(jn).depth = list.get(i).get(j).depth + 1;
                    }

                }
            }
        }
        for (int i = 0; i < height; i++) /*Чистка пустых строк*/ {
            boolean flag = true;
            for (int j = 0; j < width; j++) {
                if (list.get(i).get(j).str != " ") {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.remove(i);
                i--;
                height--;
            }
        }

        for (var row : list) {
            for (var item : row) {
                if (item.node != null && item.node.color == Color.red)
                    System.out.print("\u001B[31m" + item.str + " " + "\u001B[0m");
                else
                    System.out.print(item.str + " ");
            }
            System.out.println();
        }
    }

    private void printLines(List<List<PrintNode>> list, int i, int j, int i2, int j2) {
        if (i2 > i) // Идём вниз
        {
            while (i < i2) {
                i++;
                list.get(i).get(j).str = "|";
            }
            list.get(i).get(j).str = "\\";
            while (j < j2) {
                j++;
                list.get(i).get(j).str = "-";
            }
        } else {
            while (i > i2) {
                i--;
                list.get(i).get(j).str = "|";
            }
            list.get(i).get(j).str = "/";
            while (j < j2) {
                j++;
                list.get(i).get(j).str = "-";
            }
        }
    }

    public int maxDepth() {
        return maxDepth2(0, root);
    }

    private int maxDepth2(int depth, Node node) {
        depth++;
        int left = depth;
        int right = depth;
        if (node.left != null)
            left = maxDepth2(depth, node.left);
        if (node.right != null)
            right = maxDepth2(depth, node.right);
        return left > right ? left : right;
    }

    private int nodeCount(Node node, int count) {
        if (node != null) {
            count++;
            return count + nodeCount(node.left, 0) + nodeCount(node.right, 0);
        }
        return count;
    }
}
