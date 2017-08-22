
import java.util.ArrayList;


public class Buket extends ArrayList<Flower> {

    public double getFresh (){
        double sum = 0;
        for (Flower f : this){
            sum = sum + f.getOld();
        }
        sum = sum/ this.size();
        return sum;
    }
    public  void getPrice (){
        int sum = 0;
        for (Flower f:  this){
            sum = sum + f.getCost();
        }
        System.out.println("Price " + this + " is " + sum+"\n");
    }
    public  void maxLength(){
        int l = this.get(0).getLength();
        Flower flower=this.get(0);
        for (Flower f : this){
            if (l < f.getLength()){
                l = f.getLength();
                flower = f;
            }
        }
        System.out.println("The longest flower in "+this+" is " + flower+"\n");

    }

    public Buket addFl(Flower f){
        this.add(f);
        return this;
    }

    @Override
    public String toString() {
        String line = "";
        for (Flower f : this){
            line = line + f.toString()+ "\n";
        }
        return "Buket{ \n" + line + " }";
    }
}