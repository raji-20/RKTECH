import java.util.*;
public class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try {
        String s=sc.next();
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                c1=1;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c2=1;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                c3=1;
            }
            else{
                c4=1;
            }
        }
        int r=4-(c1+c2+c3+c4);
        if((r+n)>8){
            System.out.println(r);
            
            }
            else  {
            	System.out.println(8-n);
            }
        }
        
        catch (Exception e) {
            System.out.println("Invalid input. Please enter valid input.");
        } finally {
            sc.close();
        }
    }
}