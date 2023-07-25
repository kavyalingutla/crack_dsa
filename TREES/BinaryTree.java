package TREES;
import java.util.*;

public class BinaryTree {

    class binarytree{

    }

    class Node{
        int value;
        Node right;
        Node left;

        public Node(int value) {
            this.value = value;
        }
    }
        static Node root;

    

    public void insert(Scanner scanner){
        System.out.println("enter the root node");
        int value = scanner.nextInt();
         root = new Node(value);
         insert(scanner, root); 


    }
    private void insert(Scanner scanner , Node node){
        System.out.println("do u want to enter the left value " + node.value);
        Boolean left =scanner.nextBoolean();
        if(left){
            System.out.println( " enter the left node value of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner, node.left);

        }
        System.out.println("do you want to enter the right node "+ node.value);
        Boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the value of nxt node " + node .value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner, node.right);
        }

       
    }
    public void display(){
        display(root, 0);
    }

       public void display(Node node, int level){
        if(node == null){
            return;
        }
        display(node.right, level+1);
        if(level !=0){
            for (int index = 0; index < level-1; index++) {
                System.out.println("|\t\t\t");
                
            }
            System.out.println("|------>" + node.value);
        }else{
            System.out.println(node.value);
        }
        display(node.left, level+1);
        
       }
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree trees = new BinaryTree();
        trees.insert(scanner);
        trees.display();

        
    }
    
}