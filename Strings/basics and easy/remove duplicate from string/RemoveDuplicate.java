import java.util.* ; 
public class RemoveDuplicate {
    public static void main(String[] args) {
    
        String str = "aassddffgghhjjkkl" ; 
        check(str);


    }

    public static void check(String str) {

        int n = str.length() ; 
        StringBuilder ans = new StringBuilder() ; 

        HashSet<Character> hst = new HashSet<>() ;
        
        for(char ch : str.toCharArray()) {
            if(!hst.contains(ch)) {
                hst.add(ch);
                ans.append(ch);
            }


    }

    String result = ans.toString() ; 
     System.out.println(result);
}
}