import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class array {
        public static void main(String[] args) {
            LinkedList <Integer> ta = new LinkedList<>();
            LinkedList <Integer> ta1 = new LinkedList<>( );
            ta1.add(5);
            ta1.add(67);
            ta1.add(78);
            ta.add(6);
            ta.add(7);
            ta.add(8);
            ta.add(4);
            ta.add(9);  
            ta.add(0,12);
            ta.add(0,23);
            ta.addFirst(23);
            ta.addAll(ta1);
            // ta.clear();
            System.out.println(ta.contains(5));
            System.out.println(ta.indexOf(6));
            System.out.println(ta.lastIndexOf(7));
            ta.addLast(768);
            ta.set(1,566);
            for (int i = 0; i < ta.size(); i++) {
                System.out.print(ta.get(i));
                System.out.print(", ");
            }
            // for (Integer integer : ta) {
            //     System.out.println(ta.get(integer));
            // }
        }
}
