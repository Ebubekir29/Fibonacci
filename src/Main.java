import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elemanSayisi,ilkEleman=0,ikinciEleman=1,toplam;
        System.out.print("Eleman Sayisini giriniz : ");
        elemanSayisi = scan.nextInt();
        System.out.print(ilkEleman+" "+ikinciEleman);
        for(int i=0;i<elemanSayisi-1;i++)
        {
            toplam = ilkEleman+ikinciEleman;
            ilkEleman=ikinciEleman;
            ikinciEleman=toplam;
            System.out.print(" "+toplam);
        }
    }
}
