class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int qtr = size / 4;
        int count = 1;
        int num = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {

            if ( num == arr[i]) count++;
            else count = 1;
            
            if (count > qtr) return arr[i];
            
            num = arr[i];
        }

        return num;
    }
}