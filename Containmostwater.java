public class Containmostwater {
    public static int maxWater(int[] nums){
        int lp =0 ;
        int rp = nums.length -1;
        int maxWater = 0;
        while(lp < rp ){
            int ht = Math.min(nums[lp], nums[rp]);
            int width = rp - lp ;
            int  currentWater = ht*width;
            maxWater = Math.max(maxWater, currentWater);
            if(nums[lp]< nums[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int [] height = {1,8,6,4,5,9,7};
        System.out.println(maxWater(height));
        
    }
    
}
