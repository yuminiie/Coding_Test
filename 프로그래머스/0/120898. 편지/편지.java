class Solution {
    public int solution(String message) {
        if (message == null) return 0;  // null 예외 방지
        return message.length() * 2;
    }
}