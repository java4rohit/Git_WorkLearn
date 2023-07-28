package com.java4rohit.LeetCode.EasyLevel;

public class MaximumSubArrays {

    public static int maxSubArray(int[] nums) {

        int currSum = nums[0];
        int overalSum = nums[0];

        for(int i =1; i < nums.length ; i++){

            if(currSum >= 0){
                currSum = currSum + nums[i];
            }
            else{
                currSum = nums[i];
            }

            if(currSum > overalSum){
                overalSum = currSum;
            }
        }
        return overalSum;
    }
    public static void main(String[] args) {

        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = maxSubArray(arr);
        System.out.println(n);
    }
}
