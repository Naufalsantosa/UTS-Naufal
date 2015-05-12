/**
 * Created by user on 12/05/2015.
 */
public class kendaraan {
    public int kecepatanmaks;
    public int berat;
    public int kapasitas;

    public kendaraan(){
        kecepatanmaks = 20;
        System.out.println("Kecepatan Maksimal Kendaraan: "+kecepatanmaks);
    }
}

class Mobil extends kendaraan {
    public int jumlahroda;
    public Mobil (int max, int brt, int kpst, int jmlhrd){
        kecepatanmaks = max;
        berat = brt;
        kapasitas = kpst;
        jumlahroda = jmlhrd;
    }
    public void CetakSpesifikasi(){
        System.out.println("Kecepatan Maksimal Mobil: "+ kecepatanmaks);
        System.out.println("Berat Mobil: "+ berat);
        System.out.println("Kapasitas Power: "+ kapasitas);
        System.out.println("Jumlah Roda: "+ jumlahroda+"\n");
        System.out.println();
        }

    public void Jalankan(int j){
      kecepatanmaks = j;
        System.out.println("Mobil dijalankan dengan kecepatan : "+ kecepatanmaks);
    }
}
