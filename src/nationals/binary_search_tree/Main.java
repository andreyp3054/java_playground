package nationals.binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        System.out.println(tree.root.data);
        tree.insert(2);
        System.out.println(tree.root.data);
        tree.insert(5);

        tree.printInOrder();

        tree.calculateTotal();
    }
}
