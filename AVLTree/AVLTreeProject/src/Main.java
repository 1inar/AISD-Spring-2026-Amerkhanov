class Main {
public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Inorder:");
        tree.inorder();

        System.out.println("Level order:");
        tree.levelOrder();

        System.out.println("Height: " + tree.getHeight());
        System.out.println("Balanced: " + tree.isBalanced());

        System.out.println("\nTree:");
        tree.printTree();

        System.out.println("\nSearch 30: " + tree.search(30));
        System.out.println("Search 100: " + tree.search(100));

        System.out.println("\nDelete 30");
        tree.delete(30);

        System.out.println("Inorder:");
        tree.inorder();

        System.out.println("Tree:");
        tree.printTree();

        System.out.println("Height: " + tree.getHeight());
        System.out.println("Balanced: " + tree.isBalanced());

        tree.clear();
        System.out.println("\nCleared. Height: " + tree.getHeight());
    }
}