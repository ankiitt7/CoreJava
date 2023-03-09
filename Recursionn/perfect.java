package Recursionn;

public class perfect {
	static int n = 7;
    static int sum = 0;
    static int i = 1;
    static int findPerfect(int n, int i) {
        {
            if(i<=n/2)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
                i++;
                findPerfect(n,i);
            }
            return sum;
        }
    }
    public static void main(String args[])
    {
        int result = findPerfect(n,i);
        if(result == n)
            System.out.println("It is Perfect Number");
        else System.out.println("It is not Perfect Number");
    }
}

