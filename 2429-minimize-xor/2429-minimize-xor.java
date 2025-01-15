class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        
        int x = 0;
        for (int i = 31; i >= 0; i--) {  
            if ((num1 & (1 << i)) != 0) { 
                x |= (1 << i);   
                count--;
                if (count == 0) { 
                    break;
                }
            }
        }
        
        for (int i = 0; i < 32; i++) {
            if (count == 0) {  
                break;
            }
            if ((x & (1 << i)) == 0) {  
                x |= (1 << i);        
                count--;
            }
        }
        
        return x;
    }
}