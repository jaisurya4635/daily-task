import java.util.*;
public class longestsubstring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<str.length();r++){
            char ch=str.charAt(r);
            while(set.contains(ch)){
                set.remove(str.charAt(l));
                l++;
            }
            set.add(ch);
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
}