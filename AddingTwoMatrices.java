public class AddingTwoMatrices{
   public static void main(String args[]){
      int a[][]={{1,2,3},{4,5,6},{7,8,9}};
      int b[][]={{1,1,1},{1,1,1},{1,1,1}};
      int c[][]=new int[3][3];

      for(int i = 0;i<3;i++){
         for(int j = 0;j<3;j++){
            c[i][j] = a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
         }
         System.out.println();
      }
   }
}

// output:-

// AddingTwoMatrices 
// 2 3 4 
// 5 6 7 
// 8 9 10 




class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        // Printing the tree structure
        printTree(root);
    }

    public static void printTree(Node node) {
        if (node == null) {
            return;
        }

        // Print the data of the current node
        System.out.print(node.data + " ");

        // Recursive call for left and right subtrees
        printTree(node.left);
        printTree(node.right);
    }
}
