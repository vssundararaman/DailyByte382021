package com.vidya;

import java.util.HashMap;
import java.util.Map;

/**
 * 219. Contains Duplicate II
 *
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Time complexity O(N)
 * Space Complexity O(1)
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.println(containsNearByDuplicates(nums,k));

    }

    static boolean containsNearByDuplicates(int[] nums, int k){

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];

            if(hashMap.containsKey(current) && i - hashMap.get(current) <= k){
                return true;
            }else{
                hashMap.put(current,i);
            }
        }
        return false;
    }
}
