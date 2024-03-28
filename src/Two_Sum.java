public class Two_Sum {
    public static int[] twoSum(int[] nums, int target){
        int[] resul = new int[2];
        boolean x = false;
        if (nums.length != 0){
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        if (i != j){
                            resul[1] = i;
                            resul[0] = j;
                            x = true;
                        }
                    }
                }
            }
        }else {
            System.out.println("Array is empty");
        }
        if (!x){
            System.out.println("No solution for this target");
        }
        return resul;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,7,11,15};
        int[] nums2 = new int[]{3,2,4};
        int[] nums3 = new int[]{3,3};

        int[] resul = Two_Sum.twoSum(nums2,6);


        // For reading the result;
        System.out.print("[");
        for (int i = 0; i < resul.length-1; i++){
            System.out.print(resul[i]+",");
        }
        System.out.print(resul[resul.length-1]);
        System.out.print("]");
    }
}
