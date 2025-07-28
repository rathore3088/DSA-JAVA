public class binarysearch {
    static int binarySearch(int [] arr,int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid =(start +end)/2;
            if (arr[mid] == key ) {
                return mid;
            }
            // here is the right condition 
            if (arr[mid] < key) {
               start = mid+1;
            }
            // here is the left condition 
            else{
              end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={1,23,4,5,233,56};
        int key = 233;
        System.out.println("index of an array" + binarySearch(arr, key));
        
    }
    
}
