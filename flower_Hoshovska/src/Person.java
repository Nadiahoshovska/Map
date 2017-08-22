/**
 * Created by user on 8/3/2017.
 */
public class Person {
     private Buket buket;

     public int costBuket(){
         int sum = 0;
         for (int i = 0; i< buket.size();i++){
           sum = sum +  buket.getBouquet().get(i).getCost();
         }
         return sum;
     }

     public String maxLen() {
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
     public int fresh(Buket buket){
         if(this.buket.oldBuket()<buket.oldBuket() ){
             return 1;
         }
         else return 0;
     }
}
