public class DecodeWays {

    public int numDecodings(String s) {
        int [] dynamic = new int [s.length()+1];
        char [] numChars = s.toCharArray();

        if(s.length() == 0 || numChars[0] == '0'){
            return 0;
        }
        dynamic[0] = 1;
        dynamic[1] = 1;

        for(int i=2; i<=s.length(); i++){
            int one = numChars[i-1] - '0';
            int two = (numChars[i-2] - '0') * 10 + (numChars[i-1] - '0');

            if(one != 0){
                dynamic[i] = dynamic[i] + dynamic[i-1];
            }
            if(two >= 10 && two <= 26){
                dynamic[i] = dynamic[i] + dynamic[i-2];
            }
        }

        return dynamic[s.length()];
    }
}
