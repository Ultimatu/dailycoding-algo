package algorithms.algo79;


import java.util.List;



public class Algo79 {

    // The list of integers to check
    private List<Integer> list;

    /**
     * Constructor for Problem79 class
     * @param list The list of integers to check
     */
    public Algo79(List<Integer> list) {
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