public class Main {
    public static void main(String[] args){
        // 3. Longest Substring Without Repeating Characters
//        LongestSubstringNoRepeat ls = new LongestSubstringNoRepeat();
//        int result = ls.longestSubString("aab");
//        System.out.printf("%d", result);

        // 5. Longest Palindromic Substring
//        LongestPalindromic lp = new LongestPalindromic();
//        String result = lp.longestPalindrome("babad");
//        System.out.printf("%s", result);
        // 6. Zigzag Conversion


        // 8. String to Integer (atoi)
//        StringToInt si = new StringToInt();
//        int result = si.atoi("-91283472332");
//        System.out.printf("%d", result);

        // 11. Container With Most Water
        ContainerMostWater cm = new ContainerMostWater();
        int [] inputs = {1,8,6,2,5,4,8,3,7};
        int result = cm.mostWaterConatain(inputs);
        System.out.printf("%d", result);

    }
}
