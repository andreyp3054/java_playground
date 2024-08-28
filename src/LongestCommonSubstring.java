import java.util.*;
public class LongestCommonSubstring {
    public static void main(String[] args) {
        String first = "JAVAAID";
        String second = "JAVAID";
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondlist = new ArrayList<>();
        for (int i = 0; i < first.length(); i++){
            firstList.add(firstArray[i]);
        }
        for (int i = 0; i < second.length(); i++){
            secondlist.add(secondArray[i]);
        }

        int commonLetters = 0;
        if(firstList.size() < secondlist.size()){
            for(int i = 0; i < firstList.size(); i++){
                if(secondlist.contains(firstList.get(i))){
                    commonLetters++;
                }
            }
        }
        else{
            for(int i = 0; i < secondlist.size(); i++){
                if(firstList.contains(secondlist.get(i))){
                    commonLetters++;
                }
            }
        }
        System.out.println(commonLetters);
    }

}
