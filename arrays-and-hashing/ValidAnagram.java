import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ValidAnagram {

  public static void main(String[] args) {

    String t1 = "anagram";
    String t2 = "nagaram";
    String t3 = "ab";
    String t4 = "a";

    System.out.println(validAnagram(t3, t4));

  }

  public static boolean validAnagram(String s, String t) {

    if (s.length() < t.length() || t.length() < s.length()) {
      return false;
    }

    HashMap<String, Integer> sMap = new HashMap<>();
    HashMap<String, Integer> tMap = new HashMap<>();
    List<String> sList = Arrays.asList(s.split(""));
    List<String> tList = Arrays.asList(t.split(""));

    for (int i = 0; i < sList.size(); i++) {
      if (sMap.keySet().contains(sList.get(i))) {
        sMap.put(sList.get(i), sMap.get(sList.get(i)) + 1);
      } else {
        sMap.put(sList.get(i), 1);
      }
    }

    for (int i = 0; i < tList.size(); i++) {
      if (tMap.keySet().contains(tList.get(i))) {
        tMap.put(tList.get(i), tMap.get(tList.get(i)) + 1);
      } else {
        tMap.put(tList.get(i), 1);
      }
    }

    int count = 0;
    for (String key : sMap.keySet()) {
      int keySetSize = sMap.keySet().size();

      if (sMap.get(key) == tMap.get(key)) {
        count += 1;
        if (count == keySetSize) {
          return true;
        }
      }
    }

    return false;

  }

}
