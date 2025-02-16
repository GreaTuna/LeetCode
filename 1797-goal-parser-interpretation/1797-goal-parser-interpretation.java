class Solution {
    public String interpret(String command) {
        String str = command.replace("()" , "o").replace("(al)" , "al") ; 
        return str ;
    }
}