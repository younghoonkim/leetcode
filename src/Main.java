import java.util.List;

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
//        ContainerMostWater cm = new ContainerMostWater();
//        int [] inputs = {1,8,6,2,5,4,8,3,7};
//        int result = cm.mostWaterConatain(inputs);
//        System.out.printf("%d", result);

        // 62. UniquePath
//        UniquePath up = new UniquePath();
//        int result = up.uniquePaths(7,3);
//        System.out.printf("%d", result);

        // 63. UniquePaths
//        UniquePath2  up = new UniquePath2();
//        int result = up.uniquePathsWithObstacles(new int [][] {{0,0,0},{0,1,0},{0,0,0}});
//        System.out.printf("%d",result);
        // 17. Letter Combinations of a Phone Number
//        PhoneLetter pl = new PhoneLetter();
//        List<String> result = pl.letterCombinations("3");
//        System.out.println(result);

        // 22. Generate Parentheses
//        GenerateParentheses gp = new GenerateParentheses();
//        List<String> result = gp.generateParenthesis(3);
//        System.out.println(result);

        // 12.Integer to Roman
//        IntToRoman iR = new IntToRoman();
//        String result = iR.itor(4);
//        System.out.printf("%s",result);

        // 34. Find First and Last Position of Element in Sorted Array
//        FindNumPosition fp = new FindNumPosition();
//        int [] result = fp.searchRange(new int[] {1}, 1);
//        System.out.printf("%d %d", result[0], result[1]);

        // 39. Combination Sum
//        CombinationSum cs = new CombinationSum();
//        List<List<Integer>> result = cs.combinationSum(new int[] {2,3,6,7}, 7);
//        System.out.println(result);

        // 40. Combination Sum II
//        CombinationSum cs = new CombinationSum();
//        List<List<Integer>> result = cs.combinationSum2(new int[] {10,1,2,7,6,1,5}, 8);
//        System.out.println(result);

        // 46. Permutations
//        Permutations permutations = new Permutations();
//        List<List<Integer>> result = permutations.permute(new int [] {1,1,2});
//        System.out.println(result);

        // 743. Network Delay Time
//        NetworkDelay nd = new NetworkDelay();
//        int result = nd.networkDelayTime(new int [][] {{2,1,1}, {2,3,1}, {3,4,1}}, 4, 2);
//        System.out.println(result);

        // 71. Simplify Path
//        SimplifyPath sp = new SimplifyPath();
//        String result = sp.simplifyPath("/AagbK/////iavh/M/rmKaS/tXD/././lND//");
//        System.out.println(result);

        // 74. Search a 2D Matrix
//        Search2DMatrix sm = new Search2DMatrix();
//        boolean result = sm.searchMatrix(new int [][] {{1,3,5}}, 1);
//        System.out.println(result);

        // 240. Search a 2D Matrix2
//        Search2DMatrix sm = new Search2DMatrix();
//        //boolean result = sm.searchMatrix2(new int [][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}}, 5);
//        boolean result = sm.searchMatrix2(new int [][] {{-5}}, -5);
//        System.out.println(result);

        // 91. Decode Ways
//        DecodeWays dw = new DecodeWays();
//        int result = dw.numDecodings("2101");
//        System.out.println(result);

        // 208. Implement Trie (Prefix Tree)
//        Trie trie = new Trie();
//        trie.insert("apple");
//        System.out.println(trie.search("apple"));
//        System.out.println(trie.search("app"));
//        System.out.println(trie.startsWith("app"));
//        trie.insert("app");
//        System.out.println(trie.search("app"));

        // 154. Find Minimum in Rotated Sorted Array II
//        FindMinimunRotatedSortedArray fr = new FindMinimunRotatedSortedArray();
//        int result = fr.findMin(new int[]{2,2,2,0,1});
//        System.out.println(result);

        LongestCommonPrefix lp = new LongestCommonPrefix();
        String result = lp.longestCommonPrefix(new String[] {"flower","flow","flight"});
        System.out.println(result);


    }
}
