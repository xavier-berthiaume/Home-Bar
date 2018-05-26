package bar;

public class SolidElement extends BarElement{

    private float size;

    public SolidElement(String name, float size){
        super(name);
        this.size = size;
    }

    public static SolidElement parseFromString(String string){
        String[] values = string.split(" ");
        String name = values[0];
        float size = Float.parseFloat(values[1]);
    	return new SolidElement(name, size);
    }

    public float getSize(){
        return size;
    }
}