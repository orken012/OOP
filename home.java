
import java.util.*;
public class home {
    public static void main(String[] args) {
        //write your code there
       Scanner num=new Scanner(System.in);
        int num1,opv,ipn,result;
        int maxopv=2125000;
        System.out.print("salary: ");
        num1=num.nextInt();
        opv=num1/10;
        if(opv<maxopv&&num1>42500) {
            ipn = (num1 - opv - 42500) / 10;
            result = num1 - opv - ipn;
            System.out.println("income= " + result);
        }else{
            result=num1-opv;
            System.out.println("income= "+result);
        }
    }
}