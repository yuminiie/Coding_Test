class Solution {
    public int solution(String[] order) {
        int total = 0;

        for (int i = 0; i < order.length; i++) {
            String item = order[i];

            if (item.contains("americano") || item.equals("anything")) {
                total += 4500;
            } else if (item.contains("cafelatte")) {
                total += 5000;
            }
        }

        return total;
    }
}