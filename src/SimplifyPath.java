import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
public class SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        List<String> splitList = Arrays.asList(path.split("/"));

        for(int i=1; i<splitList.size(); i++){
            String curSplitPath = splitList.get(i);
            if(curSplitPath.equals(".")){

            }else if(curSplitPath.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if (curSplitPath.isEmpty()) {

            }else{
                stack.push(curSplitPath);
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result = result + "/" + stack.removeLast();
        }
        if(result.isEmpty()){
            result = "/";
        }

        return result;
    }
}
