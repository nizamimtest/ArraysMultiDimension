package day015;

public class Arrays2D {
    public static void main(String[] args) {
        //2 Dimension Array
        // int [][] notlar_1=new int[5][3];
        //        notlar_1[0][1]=60;
        int[] [] notlar={
                //M,F,K
                {70,60,50},//Ahmet
                {80,55,75},//Zeynep
                {75,85,95},//Ayse
                {40,60,80},//Deniz
                {30,80,50} //Gorkem
        };
        double[] toplamlar=new double[3];
        String[] isimler={"Ahmet","Zeynep","Ayse","Deniz","Gorkem"};
        System.out.println("Ogrenci\tMat\tFiz\tKim");
        System.out.println("-".repeat(19));
        for(int i=0;i< notlar.length;i++) {
            System.out.print(isimler[i]+"\t");
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.print(notlar[i][j]+"\t");
                toplamlar[j]+=notlar[i][j];
            }//Her bir dersin notu
            System.out.println();
        }//Her bir ogrenci
        System.out.println();
        System.out.println("Not Ortalamari");
        System.out.println("Mat: "+toplamlar[0]/ notlar.length);
        System.out.println("Fiz: "+toplamlar[1]/ notlar.length);
        System.out.println("Kim: "+toplamlar[2]/ notlar.length);

        }

    }

