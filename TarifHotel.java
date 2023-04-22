import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TarifHotel {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String kelas;
        int lama;
        int tarif = 0, total = 0;
        System.out.print("Masukkan kelas inap: ");
        kelas = input.readLine();
        System.out.print("Masukkan lama menginap: ");
        lama = Integer.parseInt(input.readLine());
        if (kelas.equalsIgnoreCase("S")) {
            if ((lama >= 1) && (lama <= 2)) {
                tarif = 400000;
                
            } else {
                tarif = 350000;
               
            }
        } else 
            System.out.println("Maaf, kelas tidak tersedia.");
        if (kelas.equalsIgnoreCase("E")) {
            if ((lama >= 1) && (lama <= 2)) {
                tarif = 1200000;
            
            } else {
                tarif = 1000000;
               
            }
        } else 
            System.out.println("Maaf, kelas tidak tersedia.");
        total = tarif * lama;
        System.out.printf("Total yang harus dibayar sebesar %d ", total);
    }
}