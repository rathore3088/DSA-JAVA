public class largestnumberinarray {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,6,4,5};
        System.out.println(getlargest(arr));
    }
    static int getlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if (largest < arr[i]) {
                largest = arr[i];
                
            }
        }
        return largest;
    }
    
}
