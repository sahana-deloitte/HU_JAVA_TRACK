public class Exception {
    public static void main(String args[])
    {
        try{
            int a=50,b=0;
                int c=a/b;
                System.out.println("result=" +c);
            }
            catch(ArithmeticException e )
            {
                System.out.println("can't divide a number by zero");
            }
            finally{
            System.out.println("Finally");

        }
    }
}
