class MaxTotalValue {
    public long maxTotalValues(int[] nums, int k) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return 1L * k * (max - min);
    }
}