package algorithms.medium;

import java.util.List;

/**
 * Exo: 
 *   Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.
 *   Example 1: 
 *    Input: [4,2,3]
 *   Output: True
 *  Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
 *  Example 2:
 *  Input: [4,2,1]
 * Output: False
 * Explanation: You can't get a non-decreasing array by modifying at most one element.
 */

public class Problem79 {

    // The list of integers to check
    private List<Integer> list;

    /**
     * Constructor for Problem79 class
     * @param list The list of integers to check
     */
    public Problem79(List<Integer> list) {
        this.list = list;
    }

    /**
     * Checks if the list is non-decreasing by allowing at most one decreasing pair of elements
     * @return true if the list is non-decreasing, false otherwise
     */
    public boolean isUnDecrease(){
        int count = 0;
        for(int i = 0; i < this.list.size()-1; i++){
            if((int)this.list.get(i) > (int)this.list.get(i+1)){
                count++;
            }
        }
        return count <= 1;
    }
}