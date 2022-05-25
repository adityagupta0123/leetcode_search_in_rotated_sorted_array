class Solution {
    public int search(int[] nums, int x) {
        int l =0, h =nums.length -1;
       while(l <= h ){
            int mid = l + (h - l)/2;
            if(x == nums[mid])
                return mid;
           if(nums[l] <=nums[mid]){
            if ( x >= nums[l] && x <nums[mid])
                h = mid-1;
            else
                l = mid + 1;
           }else{
               if(x > nums[mid] && x <= nums[h])
                   l = mid + 1;
               else
                   h = mid -1;
           } 
                
        }
        return -1;
    }
  
}
