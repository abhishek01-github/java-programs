public class BST {
    public BST(){
        this.root = null;
    }

    public Node root;

    private static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        root = insert(root,value);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
        } else if(value<node.value){
            node.left = insert(node.left,value);
        } else {
            node.right = insert(node.right, value);
        }
        
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        for (int i : nums) {
            insert(i);
        }
    }

    public void isBalanced(){
        System.out.println();
        if(isBalanced(root)){
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }

    public boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display(){
        System.out.println("The root node is " + root.value);
        display(root);
    }

    public void display(Node node){
        if(node.left!=null){
            System.out.println("The left child of " + node.value + " is " + node.left.value);
            display(node.left);
        }
        if(node.right!=null){
            System.out.println("The right child of " + node.value + " is " + node.right.value);
            display(node.right);
        }
    }

    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}
