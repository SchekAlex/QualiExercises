import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Methods method = new Methods();
        String randomWord = "Automation";
        method.backwardsString(randomWord);

        List<String> list =new ArrayList<>();
        String element1 = "Hello";
        String element2 = "Qualitest";
        String element3 = "in";
        String element4 = "a";
        String element5 = "list";

        list.add(element1);
        list.add(element2);
        list.add(element3);
        list.add(element4);
        list.add(element5);

        method.printList(list);

        List<Object> list1 = new ArrayList<>();

        int elem1 = 1;
        int elem2 = 3;
        int elem3 = 67;
        String elem4 = "1";
        String elem5 = "62";
        String elem6 = "Foo";
        String elem7 = "3";
        int elem8 = 5;
        int elem9 = 1;
        int elem10 = 3;
        boolean elem11 = false;
        double elem12 = 1.3;

        list1.add(elem1);
        list1.add(elem2);
        list1.add(elem3);
        list1.add(elem4);
        list1.add(elem5);
        list1.add(elem6);
        list1.add(elem7);
        list1.add(elem8);
        list1.add(elem9);
        list1.add(elem10);
        list1.add(elem11);
        list1.add(elem12);

        System.out.println(method.removeDuplicatesAndStrings(list1));



    }
}
