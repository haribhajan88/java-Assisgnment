import java.util.*;

public class largeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUM1 = sc.nextInt();
        int NUM2 = sc.nextInt();
        int NUM3 = sc.nextInt();
        if (NUM1>NUM2 && NUM1>NUM3){
            System.out.println(NUM1+" is the largest number");
        }
        else if (NUM2>NUM1 && NUM2>NUM3){
            System.out.println(NUM2+" is the largest number");
        }
        else{
            System.out.println(NUM3+" is the largest number");
        }
        sc.close();
    }
}
