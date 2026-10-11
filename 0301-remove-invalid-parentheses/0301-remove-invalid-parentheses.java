class Solution {

    Set<String> res;
    int n;
    int mn;

    public void rec(String s, int curr, int oc, int cc, String str, int nor) {

        if (oc - cc < 0)
            return;

        if (curr == n) {
            if (oc == cc) {
                res.add(str);
                mn = Math.min(mn, n - str.length());
            }
            return;
        }

        char ch = s.charAt(curr);

        if (ch == '(') {
            rec(s, curr + 1, oc + 1, cc, str + ch, nor);
            rec(s, curr + 1, oc, cc, str, nor + 1);
        } else if (ch == ')') {
            rec(s, curr + 1, oc, cc + 1, str + ch, nor);
            rec(s, curr + 1, oc, cc, str, nor + 1);
        } else
            rec(s, curr + 1, oc, cc, str + ch, nor + 1);

        return;
    }

    public List<String> removeInvalidParentheses(String s) {
        res = new HashSet<>();
        n = s.length();
        mn = Integer.MAX_VALUE;
        rec(s, 0, 0, 0, "", 0);
    
        Iterator<String> it = res.iterator();

        while (it.hasNext()) {
            String x = it.next();

            if (n - x.length() != mn)
                it.remove();
        }
        
        return new ArrayList<>(res);
    }
}