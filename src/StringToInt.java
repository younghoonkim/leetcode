public class StringToInt {
    public int atoi(String s) {
        //String spaceRemoveString = s.replace(" ", "");
        String spaceRemoveString = s.trim();
        int signed = 1;

        if(spaceRemoveString.length() < 1){
            return 0;
        }

        char [] charArray = spaceRemoveString.toCharArray();
        int startIdx = 0;
        if(charArray[0] == '-'){
            signed = -1;
            startIdx = 1;
        }else if(charArray[0] == '+'){
            startIdx = 1;
        }


        int lastIdx = startIdx;
        for(int i=startIdx; i<charArray.length; i++){
            char curChar = charArray[i];
            // 숫자맞나?
            if(curChar >= '0' && curChar <= '9'){
                lastIdx++;
            }else{
                break;
            }
        }
        if(lastIdx == startIdx){
            return 0;
        }
        int result = 0;
        try {
            result = Integer.parseInt(spaceRemoveString.substring(startIdx, lastIdx)) * signed;
        }catch (NumberFormatException e){
            if(signed > 0){
                result = Integer.MAX_VALUE;
            }else{
                result = Integer.MIN_VALUE;
            }
        }
        return result;
    }
}
