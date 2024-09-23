package Code;

class Binary{
    public static void main(String[] args) {
        int[] nums = {1,22,33,44,55,66,77,88,99,100,102};
        int target = 55;
        System.out.println();
    }

    static int Search (int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if(target<nums[mid]){
                mid = end - 1;
            } else if(target>nums[mid]){
                mid = start + 1; 
            } else{
                return mid;
            }
        }
        return -1;
    }
}