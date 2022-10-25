class Solution {
    public int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b,a%b);
    }
    public int commonFactors(int a, int b) {
        int GCD = gcd(a, b);
        int commanFactor = 0;
        for(int i=1;i*i <= GCD ;i++) {
            if(i*i==GCD) {
                commanFactor += 1;
            }
            else if(GCD%i==0) {
                commanFactor += 2;
            }
        }
        return commanFactor;
        
    }
}
