package Strings;

public class BalancedStringSplit {

    public static int balancedStringSplit(String s) {
        int answer = 0;
        int balanceCount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R'){
                balanceCount++;
            }else if(s.charAt(i)=='L'){
                balanceCount--;
            }
            if(balanceCount==0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
