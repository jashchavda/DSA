import java.util.* ;
public class LongestCommonPrefix2 {

    public static String lcp(String[] str) {
if(str.length == 0 || str == null) {
    return "";
}

Arrays.sort(str);
char[] first = str[0].toCharArray();
char[] last = str[str.length - 1].toCharArray();

StringBuilder substr = new StringBuilder();

for(int i = 0 ;  i < first.length ; i++) {
    if(first[i] == last[i]) {
       substr.append(first[i]) ;
    }
    else if(first[i] != last[i] || i >= last.length) {
        break ;
    }
}

return substr.toString() ;

    }
    public static void main(String[] args) {
        
        String[] strs = {"flsfjakf" , "flsabjf" , "flsfer"} ; 

        String ans = LongestCommonPrefix2.lcp(strs);
      System.out.println("The longest common prifix is " + ans);
    }
}
