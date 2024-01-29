import java.util.Scanner;
public class BinaryTree {
    Scanner sc = new Scanner(System.in);
    
    public BinaryTree(){
        root = null;
    }
    
    public BinaryTree(int value){
        this.root = new Node(value);
    }
    
    private Node root;
    
    private static class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }

    public void construct(int value){
        this.root.value = value;
        construct(root);
    }

    public void construct(){
        if(root==null){
            System.out.println("Enter the root node");
            root = new Node(sc.nextInt());
        }
        construct(root);
    }

    public void construct(Node node){
        System.out.println("Do you want to insert the left of " + node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left of " + node.value);
            node.left = new Node(sc.nextInt());
            construct(node.left);
        }
        System.out.println("Do you want to insert the right of " + node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right of "+ node.value);
            node.right = new Node(sc.nextInt());
            construct(node.right);
        }
    }

    public void display(){
        System.out.println("The root node is "+ root.value);
        display(root);
    }

    public void display(Node node){
        if(node.left!=null){
            System.out.println("The left of " + node.value + " is " + node.left.value);
            display(node.left);
        }
        if(node.right!=null){
            System.out.println("The right of " + node.value + " is " + node.right.value);
            display(node.right);
        }
    }
}
