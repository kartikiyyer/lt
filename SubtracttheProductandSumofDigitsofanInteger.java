class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int remainder = 0;
        while(n>0) {
            remainder = n % 10;
            n = n / 10;
            product *= remainder;
            sum += remainder;
        }
        
        return product - sum;
        
    }
}