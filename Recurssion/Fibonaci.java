package Recurssion;

public class Fibonaci {
	static int[] dp;
	public static int Fibo(int n) {
		if(n<=1)return n;
		if(dp[n]!=-1)return dp[n];
		int ans =Fibo(n-1)+Fibo(n-2); 
		dp[n]=ans;
		return ans;
	}

	public static void main(String[] args) {
		int n=6;
		dp=new int[n+1];
		for(int i=0;i<dp.length;i++) { 
			dp[i]=-1;
		}
		System.out.println(Fibo(n));
		// TODO Auto-generated method stub

	}

}
    
