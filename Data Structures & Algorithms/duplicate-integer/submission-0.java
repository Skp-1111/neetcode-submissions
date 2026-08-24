
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); // Sort the array
        for (int i = 0; i < nums.length - 1; i++) { // Iterate until the second last element
            if (nums[i] == nums[i + 1]) { // Check for duplicates
                return true; // Return true if a duplicate is found
            }
        }
        return false; // Return false if no duplicates are found
    }
}
