import java.util.ArrayList;

/**
 * Created by user on 8/3/2017.
 */
public class Main_Flower {

    public static int costBuket( Buket buket){
        int sum = 0;
        for (int i = 0; i< buket.size();i++){
            sum = sum +  buket.getBouquet().get(i).getCost();
        }
        return sum;
    }

    public static String maxLen(Buket buket) {
        int maxL = buket.getBouquet().get(0).getLength();
        String name = buket.getBouquet().get(0).getName();

        for (int i = 1; i < buket.size(); i++) {

            if (maxL < buket.getBouquet().get(i).getLength()) {
                maxL = buket.getBouquet().get(i).getLength();
                name = buket.getBouquet().get(i).getName();
            }
        }
        return name;
    }

    public static void main(String args[]){
        ArrayList<Flower> buket = new ArrayList<Flower>();
        ArrayList<Flower> buket2 = new ArrayList<Flower>();

        Rose rose1 = new Rose(50,5);
        Rose rose2 = new Rose(55,5);
        Rose rose3 = new Rose(50,3);
        Lilia lilia1 = new Lilia(100,2);
        Lilia lilia2 = new Lilia(110,1);
        Lilia lilia3 = new Lilia(120,3);
        Romashka romash1 = new Romashka(40,1);
        Romashka romash2 = new Romashka(30,2);
        Romashka romash3 = new Romashka(20,4);

        buket.add(rose1);
        buket.add(rose2);
        buket.add(rose3);
        buket.add(lilia1);
        buket.add(romash1);

        buket2.add(lilia2);
        buket2.add(lilia3);
        buket2.add(romash2);

        Buket buk1 = new Buket(buket);
        Buket buk2 = new Buket(buket2);





//        int sum = 0;
//        int maxLength = buket.get(0).getLength();
//        String nameMaxLen = buket.get(0).getName();
//        int minOld = buket.get(0).getOld();
//        String nameMinOld = buket.get(0).getName();
//
//        for (int i = 0;i<buket.size();i++){
//            sum = sum + buket.get(i).getCost();
//            if (maxLength< buket.get(i).getLength()){
//                maxLength = buket.get(i).getLength();
//                nameMaxLen = buket.get(i).getName();
//            }
//            if(minOld> buket.get(i).getOld()){
//                minOld = buket.get(i).getOld();
//                nameMinOld = buket.get(i).getName();
//            }
//        }


        System.out.println(costBuket(buk1));
        System.out.println(costBuket(buk2));

        System.out.println(maxLen(buk1));
        System.out.println(maxLen(buk2));
         if(buk1.oldBuket()<buk2.oldBuket()){
             System.out.println("fresher buk1");
         }else{
             System.out.println("fresher buk2");
         }

//        System.out.println(minOld);
//        System.out.println(nameMaxLen);
//        System.out.println(nameMinOld);



    }
}
