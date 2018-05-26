package bar;

public class BarElement{

    public String name;

    public static String[] splitIntoArray(String string){
    	return string.split("-");
    }
    
    public BarElement(String name){
        this.name = name;
    }
    
    public static BarElement parseFromString(String string){
        return new BarElement(string);
    }

    public String getName(){
        return this.name;
    }
    
}