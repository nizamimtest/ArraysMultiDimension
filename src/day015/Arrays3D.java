package day015;

public class Arrays3D {
    public static void main(String[] args) {
        //3D Arrays
        int[][][] notlar = {
                {
                        // Vize Final
                        {70, 80},//Mat
                        {50, 65},//Fizika
                        {80, 85}// Kimya
                },//Birinci ogrenci
                {
                        {50, 70},
                        {30, 60},
                        {75, 85}
                },//Ikinci ogrenci
                {
                        {80, 80},
                        {70, 70},
                        {60, 60}

                }//Ucuncu ogrenci

        };
for (int i=0;i< notlar.length;i++){
    for (int j=0;j< notlar[i].length;j++){
        for (int k=0;k< notlar[i][j].length;k++){
            System.out.print(notlar[i][j][k]+" ");
        }
        System.out.print("\t");
    }
    System.out.println();
}
    }
}