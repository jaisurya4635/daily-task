import java.util.Scanner;

public class missingnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
           total+=arr[i];
        }
        int total1=((n+1)*(n+2))/2;
        System.out.println(total1-total);

    }
}
