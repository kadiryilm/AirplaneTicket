import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double tutar,yas_indirimi,gidis_gelis_indirimi;
        int mesafe,yas,yolculuk_tipi;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mesafe bilgisini giriniz :");
        mesafe = input.nextInt();
        System.out.println("Lütfen yaş bilginizi belirtiniz :");
        yas = input.nextInt();
        System.out.println("Lütfen yolculuk tipini seçiniz : 1 / 2");
        yolculuk_tipi = input.nextInt();
        if (mesafe > 0) {
            tutar = (mesafe * 0.1);

            switch (yolculuk_tipi) {
                case 1:

                    if (yas < 12) {

                        System.out.println("Güncel tutar :" + (tutar * 0.5));
                    } else if (yas < 24) {

                        System.out.println("Güncel tutar :" + (tutar * 0.1));
                    } else if (yas > 65) {

                        System.out.println("Güncel tutar :" + (tutar * 0.3));
                    } else if (yas < 0 && yas > 100) {
                        System.out.println("Hatalı bilgi girdiniz.");
                    } else {
                        System.out.println("Güncel tutar :" + tutar);
                    }
                    break;
                case 2:
                    if (yas < 12) {
                        yas_indirimi = tutar * 0.5;
                        tutar = tutar - yas_indirimi;
                        gidis_gelis_indirimi = tutar * 0.2;
                        System.out.println("Güncel tutar :" + 2*(tutar-gidis_gelis_indirimi));
                    } else if (yas < 24) {
                        yas_indirimi = tutar * 0.1;
                        tutar = tutar - yas_indirimi;
                        gidis_gelis_indirimi = tutar * 0.2;
                        System.out.println("Güncel tutar :" + 2*(tutar-gidis_gelis_indirimi));
                    } else if (yas > 65) {
                        yas_indirimi = tutar * 0.3;
                        tutar = tutar - yas_indirimi;
                        gidis_gelis_indirimi = tutar * 0.2;
                        System.out.println("Güncel tutar :" + 2*(tutar-gidis_gelis_indirimi));
                    } else if (yas < 0 && yas > 100) {
                        System.out.println("Hatalı bilgi girdiniz.");
                    } else {
                        gidis_gelis_indirimi = tutar * 0.2;
                        System.out.println("Güncel tutar :" + 2*(tutar-gidis_gelis_indirimi));
                    }
                    break;
                default:
                    System.out.println("Hatalı bilgi girdiniz.");
            }
        }else{
        System.out.println("Hatalı bilgi girdiniz.");
        }
    }
}