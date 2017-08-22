/**
 * Created by user on 8/10/2017.
 */
public class Flower {
    private String name;
    private int cost;
    private int length;
    private int old;
    private String form;


    public Flower(String name, int cost, int lengtn, int old) {
        this.name = name;
        this.cost = cost;
        this.length = lengtn;
        this.old = old;

    }



    @Override
    public String toString() {
        return "Flower{" +
                name  +
                ", cost=" + cost +
                ", old=" + old +
                ", length=" + length +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getOld() {
        return old;
    }


    public String getName() {
        return name;
    }

    public String getForm() {
        return form;
    }
}
