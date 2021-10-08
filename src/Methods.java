import java.util.*;

public class Methods {
//    Exercise 1:
    public void backwardsString(String word){
        char[] basicWord = word.toCharArray();
        for (int i=basicWord.length-1; i>=0; i--){
            System.out.print(basicWord[i]);
        }
    }
//Exercise 2:
    public void printList(List<String> wordList){
        System.out.println();
        String firstWord = wordList.get(0);
        for(int i = 0; i<=firstWord.length()+2;i++){
            System.out.print("* ");

        }

        System.out.println();

        int nrOfElements = wordList.size();
        for(int i = 0; i<nrOfElements;i++){
            System.out.print("* "+" "+ wordList.get(i)+" "+ " *");
            System.out.println();
        }

        for(int i = 0; i<=firstWord.length()+2;i++){
            System.out.print("* ");

        }
        System.out.println();
    }
//Exercise3:
    public Set<Object> removeDuplicatesAndStrings(List<Object>list){
            int length = list.size();
            Set<Object> set = new HashSet();
            for(int i=0; i<length;i++){
                if(list.get(i) instanceof Number){
                    set.add(list.get(i));
                }
            }
            return set;
    }
//Exercise4:
    public void dictionary(List<String> list) {

    }
//Exercise5:











}
