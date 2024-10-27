class P8A1 
{
    public static void main(String[] args) 
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int answer = 1;
        try
        {
            if(y>0)
            {
                for(int i = 1; i <= y; i++)
                {
                    answer = answer * x;
                }
                System.out.println("Value is: "+ answer);
            }
            else if(y==0)
            {
                answer = 1;
                System.out.println("Value is: "+ answer);
            }
            else
            {
                throw new Exception("Invalid inputs for x or y");
            }
        }   
        catch(Exception e)
        {
            System.out.println("Dear user "+ e.toString());
        }
        finally
        {
            System.out.println("This is finally block...");
        }
    }
}

