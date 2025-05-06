import java.util.ArrayList;
import java.util.List;

public class PhoneLetter {

    private static final char [][] KEY_PAD = new char [][] {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };

    private List<String> result;
    public List<String> letterCombinations(String digits) {
        char [] digitCharArray = digits.toCharArray();
        result = new ArrayList();
        recursiveDfs(0,digitCharArray,"");

        return result;

    }
    public void recursiveDfs(int index, char[] digitCharArray, String keyString){
        if(index >= digitCharArray.length){
            if(!keyString.isEmpty()){
                result.add(keyString);
            }
            return;
        }
        int key = digitCharArray[index] - '2';
        int limit = key == 5 || key == 7 ? 4 : 3;
        for(int i=0; i<limit; i++){
            recursiveDfs(index+1, digitCharArray, keyString + KEY_PAD[key][i]);
        }
    }
}
