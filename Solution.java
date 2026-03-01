1.4
import java.util.Scanner;
public class Solution {
        static long[] meo=new long[102];
        public static long fibonacci(long n) {
            if(n==0) return 0;
            else if(n==1) return 1;
            else if(n<0) return -1;
            if(meo[(int)n]!=0){
                return meo[(int)n];
            }
            long f1=fibonacci(n-1),f2=fibonacci(n-2);
            if(f1>Long.MAX_VALUE || f2>Long.MAX_VALUE){
                meo[(int)n]=Long.MAX_VALUE;
                return Long.MAX_VALUE;
            }
            else if(f1+f2>Long.MAX_VALUE){
                meo[(int)n]=Long.MAX_VALUE;
                return Long.MAX_VALUE;
            }
            else{
                meo[(int)n]=f1+f2;
                return meo[(int)n];
            }

        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            long n =sc.nextLong();
            System.out.println(fibonacci(n));
        }
} 
