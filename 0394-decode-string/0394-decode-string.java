class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        StringBuilder curStr = new StringBuilder();
        
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                resStack.push(curStr);
                curStr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedStr = resStack.pop();
                int currentK = countStack.pop();
                
                for (int j = 0; j < currentK; j++) {
                    decodedStr.append(curStr);
                }
                curStr = decodedStr;
            } else {
                curStr.append(ch);
            }
        }
        return curStr.toString();
    }
}
