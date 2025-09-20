import java.util.*;

public class sum_until_0_or_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        while(true){
            int n = sc.nextInt();
            if(n<=0){
                break;
            }
            sum +=n;
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
    
}
