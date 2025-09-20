import java.util.*;

public class sum_num_while_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int sum1 =n*(n+1)/2;
        while(num!=n){
            num =num+1;
            num++;
        }
        if (num==sum1){
            System.out.println("it is correct");
        
        }
        else{
            System.out.println("not");
        }
            
        sc.close();
    }
}
