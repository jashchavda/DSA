public class moveAllZeroBruteforce {
    
static void movezeros(int[] arr) {
    int n = arr.length ;
      int index = 0 ;
    int[] temp = new int[n] ;

  for(int i = 0 ; i < n ; i++) {
          
    if(arr[i] != 0) {
        temp[index] = arr[i] ;
        index++;
    }

  }

      while(index < n) {
        temp[index] = 0 ;
        index++ ; 
    }
   
    for(int i = 0 ; i < n ; i++) {
        arr[i] = temp[i];
    }

}

public static void main(String[] args) {

int[] arr = {1,3,0,6,0,3,6,0} ;

movezeros(arr) ;

  for(int elem : arr) {
    System.out.print(elem + " ");
  }


}


}
