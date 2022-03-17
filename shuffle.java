import java.lang.*;
    public class shuffle {
        static boolean isInterleaved(String A, String B,String C)
        {
            int M=A.length(),N= B.length();
            boolean L[][]=new boolean[M+1][N+1];
            if ((M+N)!=C.length())
                return false;
            for(int i=0;i<=M;i++)
            {
                for(int j=0;j<=N;j++)
                {
                    if(i==0 && j==0)
                    {
                        L[i][j]=true;

                else if (i==0)
                    {
                        if(B.charAt(j-1)==C.charAt(j-1))
                            L[i][j]=L[i][j];
                    }
                    else if(A.charAt(i-1)==C.charAt(i+j-1)&& B.charAt(j-1)!=C.charAt(i+j-1))
                        L[i][j]=L[i-1][i];
                    else if(A.charAt(i-1)==C.charAt(i+j-1)&& B.charAt(j-1)=C.charAt(i+j-1))
                        L[i][j]=L[i][j]=L[i][j-1];
                    else if(A.charAt(i-1)==C.charAt(i+j-1)&& B.charAt(j-1)==C.charAt(i+j-1))
                        L[i][j]=(L[i-1][j]||L[i][j-1]);
                    }
                }
                return L[M][N];
            }
            static void checkinterleaving(String A,String B, String C)
            {
                if(isInterleaved(A,B,C))
                    System.out.println("Valid shuffle");
                else
                    System.out.println("Invalid shuffle");
            }
            public static void main(String[] args)
            {
                checkinterleaving("gid","hash","hgasidh");
            }

        }
    }

