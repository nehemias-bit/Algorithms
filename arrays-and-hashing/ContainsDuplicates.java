import java.util.HashSet;

public class ContainsDuplicates {
  public static void main(String[] args) {

  }

  // Time complexity: Big O(n)
  // Space complexity: Big O(n)
  // working
  public static boolean containsDuplicates(int[] nums) {

    HashSet<Integer> numsSet = new HashSet<Integer>();
    for (int i = 0; i < nums.length; i++) {
      numsSet.add(nums[i]);
    }

    if (numsSet.size() < nums.length) {
      return true;
    }
    return false;

  }

}