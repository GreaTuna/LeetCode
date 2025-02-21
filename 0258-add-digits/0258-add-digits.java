class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int last_digit = num % 10;
            num = num/10;
            num += last_digit;
        }
        return num;
    }
}