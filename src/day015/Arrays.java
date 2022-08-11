package day015;

public class Arrays {
    public static void main(String[] args) {
        //Tek boyutlu dizi -Vektor
        //Iki boyutlu dizi-Matris

      /*  String[] gunler;
        gunler=new String[7];
        gunler[0]="Pazartesi";
        ..
        ..
        gunler[6]="Pazar";*/

        String[] gunler={"Pazartesi","Sali","Carsamba","Persembe",
        "Cuma","Cumartesi","Pazar"};
        System.out.println("Eleman Adedi(Sifirinci Index):= "+gunler.length);
        System.out.println("Ilk Eleman(Birinci Index): "+ gunler[0]);
      /*  for (int i=0;i< gunler.length; i++){
            System.out.println(gunler[i]);
        }*/
        for (String gun:gunler){
            System.out.println(gun);

        }

    }
}
