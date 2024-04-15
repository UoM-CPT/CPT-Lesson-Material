class Solution {
    public void sortColors(int[] nums) {
        int N = nums.length;
        int M = 0;
        for(int i = 0; i < N; i++){
            if(nums[i] > M){
                M = nums[i];
            }
        }
        int[] count = new int[M + 1];
        for(int i = 0; i < M; i++){
            count[i] = 0;
        }
        for(int i = 0; i < N; i++){
            count[nums[i]]++;
        }
        for(int i = 1; i <= M; i++){
            count[i] += count[i - 1];
        }
        int[] output = new int[N];
        for(int i = N - 1; i >= 0; i--){
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        for(int i = 0; i < N; i++){
            nums[i] = output[i];
        }
    }
}
