package TugasSesi4;


public class TugasSesi4 {
     public static void main(String[] args) {
        
        System.out.println("=".repeat(18) + " Tugas Sesi 4 " + "=".repeat(18));

        System.out.println("=".repeat(50));
        
        char hotel [][] = {
            
            // Kamar (Kolom) 1, 2, 3, 4, 5
            // Lantai (Baris) 1, 2, 3, 4     
            
            {'*', '*', '*', 'X', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', 'X'}
        };
        
        char kamarIsi = 'X';
        char kamarKosong = '*';
        int jumlahKamar = hotel.length;
        int jumlahKamarKosong = 0;
        
        for(int lantai = 0; lantai < jumlahKamar; lantai++){
            for(int kamar = 0; kamar < hotel[lantai].length; kamar++){
                if(hotel[lantai][kamar] == kamarIsi){
                    System.out.println("\033[1mTamu berada di Lantai "+ (lantai+1) +" Kamar "+ (kamar+1)+ "\033[0m");
                }
                
                if(hotel[lantai][kamar] == kamarKosong){
                    jumlahKamarKosong++;
                }
            }
        }
        System.out.println("\033[1mJumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar\033[0m");
        System.out.println("=".repeat(50));
    }
}     
