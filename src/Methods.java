import java.util.List;

public class Methods {
//    Exercise 1:
//    Define a function that receive a string as argument
//    and prints it backwards. For example, the string "Automation"
//    gets printed as : "noitamotuA"
    public void backwardsString(String word){
        char[] basicWord = word.toCharArray();
        for (int i=basicWord.length-1; i>=0; i--){
            System.out.print(basicWord[i]);
        }
    }

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
    }







}
