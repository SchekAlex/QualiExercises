import java.sql.SQLOutput;
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
    public HashMap<String, List<String>> dictionary(List<String> list) {
        HashMap<String,List<String>> format = new HashMap<>();
        String video = "Video";
        String audio = "Audio";
        String other = "Other";
        List<String> videoList = new ArrayList<>();
        List<String> audioList = new ArrayList<>();
        List<String> otherList = new ArrayList<>();
        int length = list.size();
        for(int i = 0; i<length;i++){
            String word = list.get(i);
            if(word.contains(".mp4")){
                videoList.add(list.get(i));
            }
            if(word.contains(".wav")){
                audioList.add(list.get(i));
            }
            if(word.contains(".jpg")||word.contains(".mng")||word.contains(".png")||word.contains(".csv")){
                otherList.add(list.get(i));
            }
        }
        format.put(video,videoList);
        format.put(audio,audioList);
        format.put(other,otherList);
        return format;
    }

////Exercise5:
//// presupunem ca totii incep de la varsta 0
//// fiecare iepure va naste un iepure o data pe an
//    public int rabBits(int n_years,int number_rabbits, int rabbits_births_number){
//        int rabbitYear =0;
//        int totalRabbits = number_rabbits;
//        for(int i=1;i<=n_years;i++)
//        {
//            if(rabbitYear ==0){
//                System.out.println(number_rabbits + "iepuri s-au nascut");
//            }
//
//            if(rabbitYear ==1){
//                System.out.println("Cei " + number_rabbits + " au implinit: "+ rabbitYear + " an");
//            }
//
//            if(rabbitYear>=2&& rabbitYear<4) {
//                totalRabbits += number_rabbits / 2;
//                rabbits_births_number -= number_rabbits / 2;
//            }
//
//        }
//        return totalRabbits;
//    }











}
