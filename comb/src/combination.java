import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        Scanner inp= new Scanner (System.in);
        int n ,r, nfak=1, rfak=1, sfak=1, subs, formule;

        System.out.print("Enter the factorial number n: ");
        n= inp.nextInt();
        System.out.print("Enter The Factorial Nuber r: ");
        r = inp.nextInt();

        for (int a=1; a<=n; a++){
            nfak *=a;
        }
        for (int b=1;b<=r;b++){
            rfak *= b;
        }
        subs= (n-r);
        for (int c=1; c<=subs;c++){
            sfak *=  c;
        }
        formule=nfak/(rfak*sfak);
        System.out.print("C(" + n + "," + r + ")=" + formule);
    }
}
