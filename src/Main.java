import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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




    }
}
