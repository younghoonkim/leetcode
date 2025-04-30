public class LongestPalindromic {
    public String longestPalindrome(String s){
        char [] charArray = s.toCharArray();
        String maxPalindromeString;
        int max = 1;
        int cur = 0;

        if(s.length() < 1){
            return "";
        }
        maxPalindromeString = charArray[0] + "";

        //babad
        for(int i=0; i<charArray.length; i++){
            // 옆으로 가면서 중복 찾기
            int left = 0;
            int right = 0;
            while(true){
                if(i+right >= charArray.length){
                    right--;
                    break;
                }
                if(charArray[i] == charArray[i+right]){
                    right++;
                }else{
                    right--;
                    break;
                }
            }
            // 하나씩 증가하며 같은지 비교
            while(true){
                if(i-left < 0 || i+right >= charArray.length){
                    left--;
                    right--;
                    break;
                }
                if(charArray[i-left] == charArray[i+right]){
                    left++;
                    right++;
                }else{
                    left--;
                    right--;
                    break;
                }
            }
            cur = i+right - (i-left) + 1;
            if(max < cur){
                max = cur;
                maxPalindromeString = s.substring(i-left, i+right+1);
            }
        }

        return maxPalindromeString;
    }
}
