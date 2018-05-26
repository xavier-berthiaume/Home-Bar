package bar;

public class MenuItem extends SolidElement{
    
    private String[] flavors;
    private String[] ingredients;
    
    public MenuItem(String name, int size, String flavors, String ingredients){
        super(name, size);
        this.flavors = splitIntoArray(flavors);
        this.ingredients = splitIntoArray(ingredients);
    }

    public static MenuItem parseFromString(String string){
        String[] values = string.split(" ");
    	String name = values[0];
        int size = Integer.parseInt(values[1]);
        String flavors = values[2];
        String ingredients = values[3];
        return new MenuItem(name, size, flavors, ingredients);
    }
    
    public String[] getFlavors(){
        return flavors;
    }

    public String[] getIngredients(){
        return ingredients;
    }
    
}
