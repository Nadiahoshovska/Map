import java.util.ArrayList;
/**
 * Created by user on 8/10/2017.
 */
public class Shop {
    private  ArrayList<Buket> bukets = new ArrayList<Buket>();




    public static Buket addFlower (Buket buk, Flower f){
        buk.add(f);
        return buk;
    }
    public  ArrayList<Buket> addBuket(Buket b){
        this.bukets.add(b);
        return  this.bukets;
    }


//    public static void getPrice (Buket buk){
//        int sum = 0;
//        for (Flower f:  buk){
//            sum = sum + f.getCost();
//        }
//        System.out.println("Price " + buk + " is " + sum+"\n");
//    }
//    public static void maxLength(Buket buk){
//        int l = buk.get(0).getLength();
//        Flower flower=buk.get(0);
//        for (Flower f : buk){
//            if (l < f.getLength()){
//                l = f.getLength();
//                flower = f;
//            }
//        }
//        System.out.println("The longest flower in "+buk+" is " + flower+"\n");
//
//    }

    public  void Fresher(){
        double fresh = this.bukets.get(0).getFresh();
        Buket buket = this.bukets.get(0);
        for (Buket b : this.bukets){
            if (fresh > b.getFresh()){
                fresh = b.getFresh();
                buket = b;
            }
        }
        System.out.println("The Fresher buket in " + this+" is "+buket+"\n");

    }

    public  void findBuketwithFlower(Flower f){
        boolean tic = true;
        for(Buket buk: this.bukets){
            for (Flower fl : buk){
                if(f.equals(fl)){
                    System.out.println(f + " is in "+ buk+"\n");
                    tic = false;
                    break;
                }

            }
        }
        if (tic){
            System.out.println("We don't have buket with this " + f+"\n");
        }
    }

    public ArrayList<Buket> getBukets() {
        return bukets;
    }

    public void setBukets(ArrayList<Buket> bukets) {
        this.bukets = bukets;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "bukets= \n" + bukets +
                '}';
    }

    public  static void main (String args[]){
        Flower r1 = new Flower("rose",30,81,1);
        Flower r2 = new Flower("rose",40,95,1);
        Flower r3 = new Flower("rose",50,56,2);
        Flower l1 = new Flower("lilia",96,100,1);
        Flower l2 = new Flower("lilia",35,85,6);
        Flower l3 = new Flower("lilia",80,81,5);
        Flower rom1 = new Flower("romashka",15,43,2);
        Flower rom2 = new Flower("romashka",22,54,1);
        Flower rom3 = new Flower("romashka",56,88,2);




        Buket buk1 = new Buket();
        buk1.addFl(r1).addFl(l1).addFl(rom1);
        buk1.getPrice();


        Buket buk2 = new Buket();
        buk2.addFl(r2).addFl(l2).addFl(rom2);
        buk2.maxLength();

        Buket buk3 = new Buket();
        buk3.addFl(r3).addFl(l3).addFl(rom3);

        addFlower(buk1,r2);

        ArrayList<Buket> buketsInShop = new ArrayList<Buket>();
        buketsInShop.add(buk1);

        Shop shop = new Shop();
        shop.setBukets(buketsInShop);
        shop.addBuket(buk2);
        shop.Fresher();

        shop.findBuketwithFlower(r3);




    }
}
