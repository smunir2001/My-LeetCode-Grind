import java.util.HashMap;
public class Solution1 {
    public int romanToInt(String s) {
        // HashMap for Roman values/numbers
        HashMap<Character, Integer> romansMap = new HashMap<>();
        romansMap.put('I', 1);
        romansMap.put('V', 5);
        romansMap.put('X', 10);
        romansMap.put('L', 50);
        romansMap.put('C', 100);
        romansMap.put('D', 500);
        romansMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1 < s.length()) && (romansMap.get(s.charAt(i)) < romansMap.get(s.charAt(i + 1)))) {
                result -= romansMap.get(s.charAt(i));
            } else {
                result += romansMap.get(s.charAt(i));
            }
        }
        return result;
    }
}