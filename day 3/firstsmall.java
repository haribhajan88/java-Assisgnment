import java.util.*;

public class firstsmall {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int NUM1 = sc.nextInt();
    int NUM2 = sc.nextInt();
    int NUM3 = sc.nextInt();
    if (NUM1<NUM2 && NUM1<NUM3){
        System.out.println(NUM1+" is the smallest number");
    }
    else{
        System.out.println(NUM1+" is not smallest number");
    }
    sc.close();
}
}
