/*Program to implement a user-defined Exception.
@Jubin Joy
Roll no: 35
Date: 15/12/2025
*/
class UDE extends Exception
{
    String strError;
    public UDE()
    {
        strError="Unknown Error";
    }
    public UDE(String s)
    {
        strError=s;
    }
    public String showError()
    {
        return strError;
    }

}
class Program22
{
    public static void main(String args[])
    {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = s.nextInt();
        System.out.print("Enter value for b: ");
        int b = s.nextInt();
        int c;
        try
        {
            if(b==0)
                throw new UDE("Dr is zero");
            c=a/b;
            System.out.println(c);
        }
        catch(UDE e)
        {
            System.out.println(e.showError());
        }
    }
}
