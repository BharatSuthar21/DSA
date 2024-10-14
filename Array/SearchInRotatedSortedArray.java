public class  SearchInRotatedSortedArray{

    int findIndex(int[] nums, int target){
        int start = 0; 
        int end = nums.length-1;
        int middle;

        while(start <= end){
            middle = start + (end-start)/2;

            if(nums[middle] == target){
                return middle;
            }
            else{
                if(nums[middle] >= nums[start]){
                    if(nums[start]<= target && target < nums[middle]){
                        end = middle-1;
                    }
                    else{
                        start = middle+1;
                    }
                }
                else{
                    if(nums[end] >= target && target > nums[middle]){
                        start = middle+1;
                    }
                    else{
                        end = middle-1;
                    }
                }
            }
        }        
        return -1;
    }
    public static void main(String args[]){
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2,3};
        System.out.println(s.findIndex(nums, 4));
        System.out.println(s.findIndex(nums, 5));
        System.out.println(s.findIndex(nums, 6));
        System.out.println(s.findIndex(nums, 7));
        System.out.println(s.findIndex(nums, 0));
        System.out.println(s.findIndex(nums, 1));
        System.out.println(s.findIndex(nums, 2));
        System.out.println(s.findIndex(nums, 52));
    }
}