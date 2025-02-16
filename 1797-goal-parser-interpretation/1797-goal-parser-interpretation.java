class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder(command.length());

        for (int i = 0; i < command.length(); i++) {
            var character = command.charAt(i);
            if (character == 'G') {
                sb.append('G');
            }
            else if (character == '(') {
                if (command.charAt(i+1) == ')') {
                    sb.append('o');
                    i++;
                }
                else {
                    sb.append("al");
                    i += 2;
                }
            }
        }
        return sb.toString();
    }
}