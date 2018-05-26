package bar;

public class Syrups extends LiquidElement{
    
    private String flavors[];

    public Syrups(String name, int size, float price, String brand, String flavors){
        super(name, size, price, brand);
        this.flavors = BarElement.splitIntoArray(flavors);
    }

    public static Syrups parseFromString(String string){
        String values[] = string.split(" ");
        String name = values[0];
        int size = Integer.parseInt(values[1]);
        float price = Float.parseFloat(values[2]);
        String brand = values[3];
        String flavors = values[4];
        return new Syrups(name, size, price, brand, flavors);
    }
}