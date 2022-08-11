package day015;

public class JaggedArray {
    public static void main(String[] args) {
        //Jagged Diziler
        //1.Gunler
        //2.Aylar
        //3.Mevsimler
     /* String[][] time=new String[3][];

        time[0]=new String[7];
        time[1]=new String[12];
        time[2]=new String[4];

        time[0][0]="Pazartesi";
        time[0][1]="Sali";
        time[0][2]="Carsanba";
        time[0][3]="Persenmbe";
        time[0][4]="Cuma";
        time[0][5]="Cumartesi";
        time[0][6]="Pazar";
      */
        String[][] time = {
                {"Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartes", "Pazar"},
                {"Ocak", "Subat", "Mart", "Nisan", "Mayis", "Haziran", "Temmuz", "Agustus", "Eylul", "Ekim", "Kasim", "Aralik"},
                {"Ilkbahar", "Yaz", "Sonbahar", "Kis"}
        };
        for (int i = 0; i < time.length; i++) {
            for (int j=0;j<time[i].length;j++){
                System.out.print(time[i][j]+ " ");
            }
            System.out.println();
        }
    }
}