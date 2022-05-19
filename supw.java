//question link https://www.codechef.com/ZCOPRAC/problems/ZCO14002
int[] arr= {3 ,2 ,3, 2 ,3, 5, 1, 3};
		int n =8;
System.out.println(helper(arr,n))


	//using tabulation
	public static int helper(int[] arr,int n)
	{ 
		
		
		int[] dp = new int[n];
		dp[0]=arr[0];
		dp[1]=arr[1];
		dp[2]=arr[2];
		
		
		for(int i =3; i < n;i++ )
			dp[i]=Math.min( Math.min(dp[i-1],dp[i-2] ),dp[i-3]) + arr[i] ;
		
		int answer =Math.min( Math.min(dp[n-1],dp[n-2] ),dp[n-3]) ;
		
		return answer;
	}
