import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> resultArray = new ArrayList();

        backtracking(0, n, "", resultArray);

        return resultArray;

    }

    public void backtracking(int openCount, int remainCount, String completeParentheses, List<String> resultArray){
        if(remainCount == 0 && openCount == 0){
            resultArray.add(completeParentheses);
            return;
        }
        if(remainCount > 0){
            backtracking(openCount+1, remainCount-1, completeParentheses+ "(", resultArray);
        }
        if(openCount > 0){
            backtracking(openCount-1, remainCount, completeParentheses + ")", resultArray);
        }

    }
}
