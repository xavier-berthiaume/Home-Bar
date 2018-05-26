package bar;

public class Bottle extends LiquidElement{

    private String region;
    private String type;

    public Bottle(String name, int size, float price, String brand, String region, String type){
        super(name, size, price, brand);
        this.region = region;
        this.type = type;
    }

    public static Bottle parseFromString(String string){
        String name = string.split(" ,")[0];
        int size = Integer.parseInt(string.split(", ")[1]);
        float price = Float.parseFloat(string.split(", ")[2]);
        String brand = string.split(", ")[3];
        String region = string.split(", ")[4];
        String type = string.split(", ")[5];
        return new Bottle(name, size, price, brand, region, type);
    }

    public String getRegion(){
        return region;
    }

    public String getType(){
        return type;
    }
}