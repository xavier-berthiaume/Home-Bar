package bar;

public class LiquidElement extends BarElement{

    public int size;
    public float price;
    public String brand;

    public LiquidElement(String name, int size, float price, String brand){
        super(name);
        this.size = size;
        this.price = price;
        this.brand = brand;    
    }
    public static LiquidElement parseFromString(String string){
        String name = string.split(", ")[0];
        int size = Integer.parseInt(string.split(", ")[1]);
        float price = Float.parseFloat(string.split(", ")[2]);
        String brand = string.split(", ")[3];
        return new LiquidElement(name, size, price, brand);
    }

    public int getSize(){
        return this.size;
    }

    public float getPrice(){
        return this.price;
    }

    public String getBrand(){
        return this.brand;
    }
}