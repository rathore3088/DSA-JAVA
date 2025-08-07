public class sorted {
    static boolean sortedarray(int [] arr,int index){
       if (index == arr.length-1) {
        return true;
       }
       return arr[index] < arr[index+1] && sortedarray(arr, index+1);
        }
    
    public static void main(String[] args) {
        int [] arr ={1,2,3,9,6,7};
        System.out.println(sortedarray( arr,0));
        
    }

    
}
