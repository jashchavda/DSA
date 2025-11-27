public class moveHashWithPreserveOrder {
    public static void main(String[] args) {
        String str = "abcd#efgh#ijkl#" ; 
        ans(str) ; 
    }

    public static void ans(String str) {
     int n = str.length() ; 

     char[] arr = str.toCharArray() ; 

       int  j = n - 1 ; 
     for(int i = n - 1 ; i>=0 ; i--) {
     
        if(arr[i] != '#') {
            arr[j] = arr[i] ;
            j-- ; 
        }

     }
     
     while(j >= 0 ) {
       arr[j] = '#' ;  
       j-- ;
     }

System.out.println(arr);

    }
}
