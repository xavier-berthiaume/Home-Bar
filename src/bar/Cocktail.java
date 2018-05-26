package bar;

public class Cocktail extends MenuItem{

    private BarElement glass;
    private int temperature;

    public Cocktail(String name, int size, String flavors, String ingredients, BarElement glass, int temperature){
        super(name, size, flavors, ingredients);
        this.glass = glass;
        this.temperature = temperature;
    }

    public BarElement getGlass(){
        return glass;
    }

    public int getTemperature(){
    return temperature;
    }
}