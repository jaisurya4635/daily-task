import java.util.*;
public class squareroot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int l=0;
        int r=x;
        int a=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==x){
                a=mid;
                break;
            } 
            else if(mid*mid<x){
                a=mid;
                l=mid+1;
            } 
            else{
                r=mid-1;
            }
        }
        System.out.println(a);
    }
}
