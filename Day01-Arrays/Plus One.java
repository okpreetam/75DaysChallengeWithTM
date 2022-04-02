//Question Link: https://leetcode.com/problems/plus-one/

//Approach1: using arraylist
class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLen = digits.length;
        int carry = 0;
        int digit = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        if(digits[digitsLen-1] != 9){
            digits[digitsLen-1]++;
            return digits;
        }
        else{
            for(int i=digitsLen-1; i>=0; i--){
                if(i == digitsLen-1){
                    carry = (digits[i]+1)/10;
                    digit = (digits[i]+1)%10;
                }
                else{
                    digit = (digits[i]+carry)%10;
                    carry = (digits[i]+carry)/10;
                }

                if(i==0 && carry>0){
                    arr.add(0,digit);
                    arr.add(0,carry);
                }
                else{
                    arr.add(0,digit);
                }

            }
        }

        int[] ans = arr.stream().mapToInt(i -> i).toArray();
        return ans;
    }
}


//Approach2: using additional array
class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLen = digits.length;
        int carry = 0;
        int digit = 0;

        int digits1[] = new int[digitsLen+1];

        if(digits[digitsLen-1] != 9){
            digits[digitsLen-1]++;
            return digits;
        }
        else{
            for(int i=digitsLen-1; i>=0; i--){
                if(i == digitsLen-1){
                    carry = (digits[i]+1)/10;
                    digit = (digits[i]+1)%10;
                }
                else{
                    digit = (digits[i]+carry)%10;
                    carry = (digits[i]+carry)/10;
                }

                digits[i] = digit;
                digits1[i+1] = digit;
            }
        }

        if(carry==0){
            return digits;
        }
        else
        {
            digits1[0]=carry;
            return digits1;
        }
    }
}