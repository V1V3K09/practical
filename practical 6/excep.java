public class excep{
    public static void main (String[] args)
    {
    System.out.println("c=1/0");
        try
            {
                int c=1/0;
                System.out.println("try block is running");
            }
        catch(Exception e)
        {
            System.out.println("catch block is running");
        }
        System.out.println("c=1/1");
        try
            {
                int c=1/1;
                System.out.println("try block is running");
            }
        catch(Exception e)
        {
            System.out.println("catch block is running");
        }
}
}
