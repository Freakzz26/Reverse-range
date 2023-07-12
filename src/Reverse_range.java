import java.util.Scanner;
class Reverse
{
    void rev_value(int array[],int n,int b,int c){
        int i=b;
        int j=c;
        int temp=0;
        while(i<j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        System.out.println("Array after reversing: ");
        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }

    }
}
public class Reverse_range {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter the initial range: ");
        int b=scanner.nextInt();
        System.out.println("Enter the final range: ");
        int c=scanner.nextInt();
        Reverse reverse=new Reverse();
        reverse.rev_value(array,n,b,c);




    }
}
