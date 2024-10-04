package Code;

class Binary{
    public static void main(String[] args) {
        int[] nums = {1,22,33,44,55,66,77,88,99,100,102};
        int[] nums1 = {102,99,88,77,66,55,44,33,22,11,10};
        int target = 55;
        int target1 = 44;
        int target2 = 66;
        System.out.println(Search(nums, target));
        System.out.println(Search1(nums1, target1));
        System.out.println(Linear(nums1, target2));
    }

    static int Search (int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if(target<nums[mid]){
                end = mid - 1;
            } else if(target>nums[mid]){
                start = mid + 1; 
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int Search1 (int[] nums1, int target1){
        int start = 0;
        int end = nums1.length-1;
        while (start<=end) {
            int mid = start + (end-start) / 2;
            if(target1<nums1[mid]){
                start = mid + 1;
            } else if(target1>nums1[mid]){
                end = mid - 1; 
            } else{
                return mid;
            }
        }
        return -1;
    }

    static int Linear (int[] nums, int target2){
        for (int i =0 ; i< nums.length ; i++) {
            if(target2 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
