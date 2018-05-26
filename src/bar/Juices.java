package bar;

public class Juices extends LiquidElement{

    private String fruits;

    public Juices(String name, int size, float price, String brand, String fruits){
        super(name, size, price, brand);
        this.fruits = fruits;
    }

    public static Juices parseFromString(String string){
        String[] values = string.split(" ");
        String name = values[0];
        int size = Integer.parseInt(values[1]);
        float price = Float.parseFloat(values[2]);
        String brand = values[3];
        String fruits = values[4];
        for(int x=5;x<values.length;x++){
            fruits = values[x];
        }
        return new Juices(name, size, price, brand, fruits);
    }

    public String getFruits(){
        return fruits;
    }
}