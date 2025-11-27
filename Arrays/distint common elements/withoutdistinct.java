import java.util.* ; 
public class withoutdistinct {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,5,6,7,8,9,6};
        int[] arr2 = {10,11,12,13,5,5,6,6};

        check(arr1 , arr2);


    }

    public static void check(int[] arr1 , int[] arr2) {

       HashSet<Integer> set1 = new HashSet<>() ; 
       ArrayList<Integer> lst = new ArrayList<>();
      for(int num : arr2) {
        set1.add(num);
      }

      for(int num : arr1) {
        if(set1.contains(num)) {
         lst.add(num);
        }
      }

      System.out.println(lst);

    }
}