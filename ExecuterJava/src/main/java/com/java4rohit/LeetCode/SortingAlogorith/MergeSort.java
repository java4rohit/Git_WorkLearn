package com.java4rohit.LeetCode.SortingAlogorith;


import java.util.Arrays;

//time Complexcity - Big o NlogN
// space Complexcity-
public class MergeSort {
    private static int[] mergeSort(int[] arr,int lo,int hi) {

        if(lo == hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = lo+(hi-lo)/2;
        int [] firstSortedArrays = mergeSort(arr,lo,mid);
        int [] secondSortedArray = mergeSort(arr,mid+1,hi);
        int [] finalSortedArrays = mergeTwoSortArrays(firstSortedArrays,secondSortedArray);
        return finalSortedArrays;
    }

    private static int[] mergeTwoSortArrays(int[] a, int[] b) {


        int res [] = new int[a.length+b.length];

        int i = 0, j =0, k = 0;

        while(i<a.length && j <b.length) {
                if(a[i] <= b[j]){
                    res[k] = a[i];
                    i++;
                    k++;
                }else{
                    res[k] = b[j];
                    j++;
                    k++;
                }
            }
            while(i<a.length){
                res[k] = a[i];
                i++;
                k++;
            }
            while(j<b.length){
                res[k] = b[j];
                j++;
                k++;
            }

        return res;
    }

    public static void main(String[] args) {
        int arr [] ={7,4,1,3,6,8,2,5};
        int [] sortedArrays =mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(sortedArrays));

    }


}
