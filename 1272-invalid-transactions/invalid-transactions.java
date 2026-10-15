
class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < transactions.length; i++) {
            String[] s = transactions[i].split(",");
            list.add(s);
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            String[] arr = list.get(i);

            if (Integer.parseInt(arr[2]) > 1000) {
                set.add(i);
            }

            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;

                String[] other = list.get(j);

                if (arr[0].equals(other[0]) &&
                    Math.abs(Integer.parseInt(arr[1]) -
                             Integer.parseInt(other[1])) <= 60 &&
                    !arr[3].equals(other[3])) {
                    set.add(i);
                }
            }
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < transactions.length; i++) {
            if (set.contains(i)) {
                ans.add(transactions[i]);
            }
        }

        return ans;
    }
}
