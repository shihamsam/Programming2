public class Main {

    public static void mainold(String[] args) {

        String s1 = "Hello";
        String s2 = new String(s1);

        boolean val = s1 == s2;
        boolean val1 = s1.equals(s2);

        System.out.println((s1 == s2) + " " + s1.equals(s2));

//        System.out.println(val);
//        System.out.println(val1);

//        first:
//        for (int x=1;x<=3;x++){
//            System.out.println("x " + x );
//
//            for (int y = 1; y <= 3; y++) {
//                if(y==2) continue first;
//                System.out.println("y " + y);
//            }
//        }


        System.out.println("========================");

//        for (int x=1;x<=3;x++){
//            System.out.println("x " + x );
//            for (int y = 1; y <= 3; y++) {
//                if(y==2) break;
//                System.out.println("y " + y);
//            }
//        }
//        for (int x=1;x<=3;x++){
//            System.out.println("x " + x );
//            for (int y = 1; y <= 3; y++) {
//                if(y==2) break;
//                System.out.println("y " + y);
//            }
//        }
    }


    public static void main(String[] args) {
	// write your code here

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.AddToFront(5);
        sll.AddToFront(10);
        sll.AddToFront(15);

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();

        sll.AddToFront(20);

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();

        // remove items
        sll.removeFromFront();
        sll.removeFromFront();

        System.out.println("Size: " + sll.getSize());
        sll.printLinkedList();



    }
}
