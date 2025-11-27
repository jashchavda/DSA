import java.util.* ;
public class bs {

 static int binary_Search(int[] arr , int input) {

    int low = 0 ;
    int high = arr.length - 1 ;

    while(low <= high) {

        int mid = (low + high) / 2 ;

        if(arr[mid] == input) {
            return mid ;
        }

              if(arr[mid] < input ) {
                low = low + 1;
              }
              else {
                high = mid - 1 ;
              }




    }

 return -1 ;
 }


    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int size = sc.nextInt();

int[] arr = new int[size];

for(int i = 0 ; i < size ; i++) {
    arr[i] = sc.nextInt();
}

Arrays.sort(arr);

int input = sc.nextInt();

int result = binary_Search(arr , input);
System.out.println("The number" + input + " is at index " + result);
    }
}