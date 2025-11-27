// too easy  
import java.util.* ;
class LongestCommonPrifix {
public String longestprefix(String[] str) {

    if(str.length == 0 || str == null) {
        return "";
    }

    Arrays.sort(str);

    char[] arr1 = str[0].toCharArray();
    char[] arr2 = str[str.length - 1].toCharArray();

    StringBuilder bokuto = new StringBuilder();

    for(int i = 0  ; i < arr1.length ; i++) {
        if(i >= arr2.length || arr1[i] != arr2[i]) {
            break ;
        }
        bokuto.append(arr1[i]);
    }
    return bokuto.toString();

}
  public static void main(String[] args) {

LongestCommonPrifix lcp = new LongestCommonPrifix();

String[] str = {"flower" , "flow" , "flight"};

String result = lcp.longestprefix(str);
System.out.println("The longest prefix is " + result);

  }  
}