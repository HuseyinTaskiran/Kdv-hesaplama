import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double deger,kdv,kdvtutar,kdvli;


     Scanner inp = new Scanner(System.in);

        System.out.print("Tutar giriniz :");
        deger = inp.nextInt();
        kdv = 1.18;
        kdvli = kdv*deger;
        kdvtutar = kdvli-deger;
        System.out.println("Kdvsiz tutar= " + deger);
        System.out.println("Kdvli fiyat= " + kdvli);
        System.out.println("Kdv tutari= " + kdvtutar);







    }
}


