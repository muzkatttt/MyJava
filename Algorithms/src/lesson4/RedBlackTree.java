package lesson4;

public class RedBlackTree {
    private Node root;

    public boolean add(int value)  {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Node.Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Node.Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftchild != null) {
                    boolean result = addNode(node.leftchild, value);
                    node.leftchild = rebalance(node.leftchild);
                    return result;
                } else {
                    node.leftchild = new Node();
                    node.leftchild.color = Node.Color.RED;
                    node.leftchild.value = value;
                    return true;
                }
            } else {
                if (node.rightchild != null) {
                    boolean result = addNode(node.rightchild, value);
                    node.rightchild = rebalance(node.rightchild);
                    return result;
                } else {
                    node.rightchild = new Node();
                    node.leftchild.color = Node.Color.RED;
                    node.leftchild.value = value;
                    return true;
                }
            }
        }
        return true;
    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightchild != null && result.rightchild.color == Node.Color.RED &&
                    (result.leftchild == null || result.leftchild.color == Node.Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftchild != null && result.leftchild.color == Node.Color.RED &&
                    result.leftchild.leftchild != null && result.leftchild.leftchild.color == Node.Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftchild != null && result.leftchild.color == Node.Color.RED &&
                    result.rightchild != null && result.rightchild.color == Node.Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        }
        while (needRebalance);
        return result;
    }

    private Node rightSwap(Node node){
        Node rightChild = node.rightchild;
        Node betweenChild = rightChild.leftchild;
        rightChild.leftchild = node;
        node.rightchild = betweenChild;
        rightChild.color = node.color;
        node.color = Node.Color.RED;
        return rightChild;
    }

    private Node leftSwap(Node node){
        // при левостороннем повороте левосторонняя нода всегда красная
        Node leftChild = node.leftchild;
        Node betweenChild = leftChild.rightchild;
        leftChild.rightchild = node;
        node.leftchild = betweenChild;
        leftChild.color = node.color;
        node.color = Node.Color.RED;
        return leftChild;
    }

    private void colorSwap(Node node){
        node.rightchild.color = Node.Color.BLACK;
        node.leftchild.color = Node.Color.BLACK;
        node.color = Node.Color.RED;
    }
    private class Node{
        private int value;
        private Color color;

        private Node leftchild;
        private Node rightchild;

        public String toString(){
            return "Node{" + "value=" + value +
                    ", color=" + color + "}";
        }

        private enum Color{
            RED, BLACK
        }
    }



}
