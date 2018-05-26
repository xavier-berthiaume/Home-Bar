package bar;

public class Tools extends SolidElement{

    private String type;

    public Tools(String name, float size, String type){
        super(name, size);
        this.type = type;
    }

    public static Tools parseFromString(String string){
        String values[] = string.split(" ");
        String name = values[0];
        float size = Float.parseFloat(values[1]);
        String type = values[2];
        return new Tools(name, size, type);
    }
    public String getType(){
        return type;
    }
}