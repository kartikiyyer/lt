class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int[] prevResult = {};
        int[] result = {};
        for(int i =0 ; i <= nums.length -1 ; i=i+2) {
            prevResult = result;
            result = new int[nums[i] + prevResult.length];
            for (int j =0; j< prevResult.length ;j++) {
                result[j] = prevResult[j];
            }
            for (int j =0; j< nums[i] ;j++) {
                result[j+prevResult.length] = nums[i+1];
            }
        }
        return result;
    }
}