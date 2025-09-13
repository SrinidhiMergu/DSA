public class MinimumOperationsToTransformAString {
    public int minOperations(String s) {
        int ops = 0;

        for (int i = 0; i < s.length(); ++i) {
            int diff = ((26 - (s.charAt(i) - 'a')) % 26);
            ops = Math.max(ops, diff);
        }
        return ops;
    }

    public int minOperations2(String s) {
        int ops = 0;
        int freq[] = new int[26];
        int aValue = (int) 'a';
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 0 && c != 'a') {
                // int diff = ((26 - (s.charAt(i) - 'a')) % 26);
                ops = Math.max(ops, 26 - Math.abs(c - 'a'));
            }
        }
        return ops;
    }
}
