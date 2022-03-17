public class substring {
    import java.util.*;
    public class PrintSubArrays {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("enter the number of input");
            int a = scan.nextInt();
            int arr[] = new int[a];
            int count=0;
            int i,j,sum=0;
            for(i=0;i<a;i++)
            {
                arr[i]=scan.nextInt();
            }
            scan.close();
            for(i=0;i<a;i++)
            {
                sum=0;
                for(j=i;j<a;j++)
                {
                    sum=arr[i]+sum;
                    System.out.println(sum);
                    if(sum<0){
                        count++;
                    }
                }
            }
            System.out.println(count);

        }

    }

}
