public class AVLTree {
    public AVLTree(){
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

    public int height() {
        return height(root);
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
            node.right = insert(node.right,value);
        }
        
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left case
                return rotateRight(node);
            } else {
                //left-right case
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
        }
        
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right-right case
                return rotateLeft(node);
            } else {
                //right-left case
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }
        }
        
        return node;
    }

    private Node rotateLeft(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return c;
    }

    private Node rotateRight(Node c){
        Node p = c.left;
        Node t = p.left;

        p.right = c;
        c.left = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;
        return p;
    }

    public void populate(int[] nums){
        for (int i : nums) {
            root = insert(root,i);
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
}
