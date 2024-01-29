public class TreeImplementation {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree();
        // tree.construct();
        // tree.display();

        // BST tree = new BST();
        // tree.populate(new int[]{10,8,13,4,9,11,16});
        // tree.inOrder(tree.root);
        // System.out.println();
        // tree.preOrder(tree.root);
        // System.out.println();
        // tree.postOrder(tree.root);

        AVLTree tree = new AVLTree();
        for (int i = 1; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}