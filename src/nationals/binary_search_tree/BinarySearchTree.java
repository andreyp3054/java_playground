package nationals.binary_search_tree;

public class BinarySearchTree {
    Node root;
    int leftSum;

    void insert(int data) {
        root = insertRecursion(root, data);
    }

    public Node insertRecursion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (root.data > data) {
            root.left = insertRecursion(root.left, data);
        } else if (root.data < data) {
            root.right = insertRecursion(root.right, data);
        }
        return root;
    }

    void printInOrder() {
        inOrderRecursion(root);
        System.out.println();
        preOrderRecursion(root);
        System.out.println();
        postOrderRecursion(root);
    }

    void inOrderRecursion(Node root) {           //OUTPUT : 2 5 7 8 12 15
        if (root != null) {
            inOrderRecursion(root.left);
            System.out.print(root.data + " ");
            inOrderRecursion(root.right);
        }
    }

    void preOrderRecursion(Node root) {           //OUTPUT : 2 5 7 8 12 15
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRecursion(root.left);
            preOrderRecursion(root.right);
        }
    }

    void postOrderRecursion(Node root) {           //OUTPUT : 2 5 7 8 12 15
        if (root != null) {
            postOrderRecursion(root.left);
            postOrderRecursion(root.right);
            System.out.print(root.data + " ");
        }
    }

    void calculateTotal(){
        System.out.println();
        System.out.println(calculateSubTree(root));
    }

    int calculateSubTree(Node root){
        if(root != null){
            leftSum = root.data;
            calculateSubTree(root.left);
            calculateSubTree(root.right);
            leftSum += root.data;
        }
        return leftSum;
    }
}
