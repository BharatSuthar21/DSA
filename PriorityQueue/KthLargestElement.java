import java.util.PriorityQueue;

public class KthLargestElement{
    int kthALargestElementInArray(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int i  = 0; i < nums.length; i++){
            if(minHeap.size() <k){
                minHeap.add(nums[i]);
            }
            else{
                if(nums[i] > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        return minHeap.poll();
    }
    public static void main(String args[]){
        KthLargestElement l = new KthLargestElement();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(l.kthALargestElementInArray(nums, 4));
    }
}