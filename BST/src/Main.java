public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree();
        tree.Insert(7);
        tree.Insert(6);
        tree.Insert(8);
        tree.Insert(10);
        tree.Insert(25);
        tree.Insert(21);
        tree.Insert(30);
        tree.Insert(13);
        tree.Insert(4);
        tree.Insert(2);

        System.out.println(tree.Search(10));
        System.out.println(tree.Search(13));
        System.out.println(tree.Search(22222));

        System.out.println("===== min =======");
        System.out.println(tree.getMin());

        System.out.println("===== max =======");
        System.out.println(tree.getMax());

    }
}
