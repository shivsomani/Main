import java.util.Scanner;

public class Smallest
{
    public static void main(String[] args) 
    {
        int nums[]=new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<nums.length;i++)
        {
            System.out.println("Enter the element at position"+ i);
            nums[i]=sc.nextInt();
        }

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
