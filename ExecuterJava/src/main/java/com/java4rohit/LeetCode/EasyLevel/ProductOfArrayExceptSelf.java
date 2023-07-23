package com.java4rohit.LeetCode.EasyLevel;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {


        int []leftmulti = new int[nums.length];
        int []rightmulti = new int[nums.length];
        int []res = new int[nums.length];

        leftmulti[0] = nums[0];
        int multi = 1;
        for(int i= 0 ; i<nums.length ; i++){
            multi = multi * nums[i];
            leftmulti[i]=multi;
        }
        multi=1;
        for(int i= 1 ; i<nums.length+1; i++){
            multi = multi * nums[nums.length-i];
            rightmulti[nums.length-i]=multi;
        }
        for(int i = 0; i<nums.length;i++ ){
            if(i == 0){
                res[i]=rightmulti[i+1];
            }
            else if(i==nums.length-1){
                res[i]=leftmulti[i-1];
            }
            else{
                int n = leftmulti[i-1]*rightmulti[i+1];
                res[i]=n;
            }

        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       int[] arr = productExceptSelf(nums);

        System.out.println(Arrays.toString(arr));
    }
}
