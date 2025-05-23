public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuffer longPrefix = new StringBuffer("");

        for(int i=0; i<strs[0].length(); i++){
            char compareChar =  strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].length() <= i) {
                    return longPrefix.toString();
                }
                else{
                    char compareChar2 = strs[j].charAt(i);
                    if(compareChar != compareChar2){
                        return longPrefix.toString();
                    }
                }
            }
            longPrefix.append(compareChar);
        }

        return longPrefix.toString();

    }
}
