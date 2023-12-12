class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] aux = new int[2];
        for (int i = 0; i < nums.length; i++) {            
            for (int j = i + 1; j < nums.length; j++) { // i + 1 é para que nunca se some o mesmo index como por ex index 1 somado com ele mesmo
                if(nums[i] + nums[j] == target){
                    aux[0] = i;
                    aux[1] = j;
                    return aux;
                }
            }
        }
        return null;
    }



    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;

        int[] result =twoSum(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
    } 
}