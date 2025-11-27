import java.util.* ;
class Fibo_upto_NO_OFTerm {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int num = sc.nextInt();


  int a = 0 ;
  int  b = 1 ;

    int sum = 0 ;
    
    for(int i = 0 ; i < num ; i++) {
      System.out.print(a + " ");
      sum = a + b ; 
      a = b ; 
      b = sum ;

    }

    } 

}