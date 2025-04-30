import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeat {
    public int longestSubString(String s){
        Set<Character> charSets = new HashSet<>();

        char [] charInputs = s.toCharArray();
        int maxLength = 0;

        for(int i=0; i<charInputs.length; i++){
            int curLength = 0;
             for(int j=i; j<charInputs.length; j++) {
                 char curChar = charInputs[j];
                 if (charSets.contains(curChar)) {
                     break;
                 } else {
                     charSets.add(curChar);
                     curLength++;
                 }
             }
            if(maxLength < curLength) {
                maxLength = curLength;
            }
            charSets.clear();
        }
        return maxLength;
    }

}
