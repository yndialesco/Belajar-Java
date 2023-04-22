import java.util.Scanner;
public class FunctionPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar;

        System.out.println("Lebar: ");
        lebar = input.nextInt();
        System.out.println("Panjang: ");
        panjang = input.nextInt();
        persegi(lebar, panjang);
        System.out.println("Luas persegi adalah " + luas(lebar, panjang) + "cm");
        System.out.println("Keliling persegi adalah " + keliling(lebar, panjang) + "cm");
        TampilLuasDanKeliling(lebar, panjang);
    }
    private static void persegi(int inputLebar, int inputPanjang) {
        for (int i = 0; i < inputLebar; i++) {
            for (int j = 0; j < inputPanjang; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    private static int luas(int lebar, int panjang) {
        int hasil = lebar * panjang;
        return hasil;
    }
    private static int keliling(int lebar, int panjang) {
        int hasil = (lebar + panjang) * 2;
        return hasil;
    }
    private static void TampilLuasDanKeliling(int lebar, int panjang) {
        System.out.println("Memanggil function dengan function");
        System.out.println("Luas persegi adalah " + luas(lebar, panjang) + "cm");
        System.out.println("Keliling persegi adalah " + keliling(lebar, panjang) + "cm");
    }
}