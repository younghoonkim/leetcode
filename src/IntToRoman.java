public class IntToRoman {
    public String itor(int num){

        String resultRoman = "";
        int [] numberArray = {1000,500,100,50,10,5,1};
        char [] romanArray = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        // 1 - 3999까지만만
//       Symbol	Value
//        I	1
//        V	5
//        X	10
//        L	50
//        C	100
//        D	500
//        M	1000
        // 9, 4만댐
        // 3749 > MMMDCCXLIX
        // 900 > DCCCC > CM
        // 400 >> CCCC > CD
        // 90 >> LXXXX > XC
        // 40 >> XXXX > XL
        // 9 >> VIIII > IX
        // 4 >> IIII > IV
        // 9 >> V
        // 4 >> IIII


        int seq = 0;
        while(true){
            if(num == 0){
                break;
            }
            int seqRomanCount = num / numberArray[seq];
            if(seqRomanCount == 4 && seq > 0){
                if(seq > 1 && resultRoman.length() > 0 &&  resultRoman.charAt(resultRoman.length()-1) == romanArray[seq-1]){
                    resultRoman = resultRoman.substring(0, resultRoman.length()-1) + romanArray[seq] + romanArray[seq-2];
                }else if(seq > 0){
                    resultRoman = resultRoman + romanArray[seq] + romanArray[seq-1];
                }
            }else {
                for (; seqRomanCount > 0; seqRomanCount--) {
                    resultRoman = resultRoman + romanArray[seq];
                }
            }
            num = num % numberArray[seq];
            seq++;
        }

        return resultRoman;
    }
}
