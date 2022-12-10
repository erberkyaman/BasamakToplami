import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        int result=0,number;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();
        while(number!=0){
            result+=number%10;
            number=number/10;
        }
        System.out.print("Sonuç : "+result);
    }
}
