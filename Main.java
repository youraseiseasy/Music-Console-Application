
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("==================================");
		System.out.println("CO452 Programming Concepts 2022/23");
		System.out.println("==================================");
		System.out.println();
		System.out.println(" Assignment brief ");
		System.out.println();
		System.out.println(" 7th November ");
		System.out.println();
			
		double total = 0;
        int count = 0;
        String name = "Computing Concepts";

        while( count < 3)
        {
               total = total + InputReader.getDouble("25 : ");
               count++;
        }
        
        double average = total / (count+1);

        System.out.println("25 " + average);
    } 
}