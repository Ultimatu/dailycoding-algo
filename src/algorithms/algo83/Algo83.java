package algorithms.algo83;

public class Algo83 {
    

    private Node root;

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public void invert() {
        invert(root);
    }

    private void invert(Node node) {
        if (node == null) {
            return;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        invert(node.left);
        invert(node.right);
    }
}
