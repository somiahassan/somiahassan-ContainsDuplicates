
import java.util.HashSet;
import java.util.Set;
public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
           // Create a Set to track seen numbers
           Set<Integer> seen = new HashSet<>();
        
           // Iterate over the array
           for (int num : nums) {
               // If the Set already contains the number, we found a duplicate
               if (seen.contains(num)) {
                   return true;
               }
               // Otherwise, add the number to the Set
               seen.add(num);
           }
           
           // If we finish the loop without finding duplicates, return false
           return false;
       }
   
}
