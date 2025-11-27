import java.util.*;

public class EfficieantSolution {
    public static void main(String[] args) {

        String str = "aassddfftgghhjk" ; 

        LinkedHashMap<Character, Integer> mpp = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {

            mpp.put(ch , mpp.getOrDefault(ch , 0) + 1); 

        }


        for(Map.Entry<Character,Integer> entry : mpp.entrySet()) {
             if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break ; 
             }
        }


        
    }
    
}
