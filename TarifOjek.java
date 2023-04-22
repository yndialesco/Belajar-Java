import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TarifOjek {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int tarif = 0, jarak, KMPertama = 9500, sisa, potongan = 0;
        System.out.print("Masukka nama costumer: ");
        nama = input.readLine();
        System.out.print("Masukkan jarak: ");
        jarak = Integer.parseInt(input.readLine());
        if (jarak < 4) {
            tarif = 2500 * jarak;
        } else if (jarak == 4) {
            tarif = KMPertama;
        } else if (jarak > 4) {
            if ((jarak >= 10) && (jarak < 16)) {
                potongan = 2000;
                sisa = jarak - 4;
                tarif = KMPertama + (sisa * 2500) - potongan;
                System.out.printf("Selamat anda mendapatkan potongan Rp%d%nTarif yang harus dibayarkan %s adalah sebesar Rp%d", potongan, nama, tarif);
            } else if (jarak > 15) {
                potongan = 5000;
                sisa = jarak - 4;
                tarif = KMPertama + (sisa * 2500) - potongan;
                System.out.printf("Selamat anda mendapatkan potongan Rp%d%nTarif yang harus dibayarkan %s adalah sebesar Rp%d", potongan, nama, tarif);
            } else {
                sisa = jarak - 4;
                tarif = KMPertama + (sisa * 2500);
                System.out.printf("Tarif yang harus dibayarkan %s adalah sebesar Rp%d %n", nama, tarif);
            }
        }

    }

}
