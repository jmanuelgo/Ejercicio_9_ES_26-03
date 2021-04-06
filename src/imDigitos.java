import java.util.Scanner;
public class imDigitos {
    public static void main (String [] args) {
        int num, inv = 0, resto;
        do {
            Scanner read = new Scanner(System.in);
            System.out.print("introduzca un numero ");
            num= read.nextInt();
        } while (num<1000);

        System.out.println("El nuevo numero hecho por los  digitos impares es:");
        while (num>0){
            resto=num%10;
            if (resto% 2!=0){
                System.out.print(resto);
            }
            num/=10;
        }
    }
}
