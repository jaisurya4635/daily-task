import java.util.*;
public class findduplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dup=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(!seen.add(arr[i])){
                dup.add(arr[i]);
            }
        }
        System.out.println(dup);
    }
}
