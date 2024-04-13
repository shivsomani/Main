public class Sorted {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        boolean ans=isSorted(nums);
        if(ans==true)
            System.out.println("Array is sorted");
    }

    static boolean isSorted(int[] num)
    {
        int i=0;
        //for(int i=0;i<num.length;i++)

        while(i<num.length)
        {
            if(num[i]<num[i+1])
                continue;
                i++;
                //break;
        }

    }
}
