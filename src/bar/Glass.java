package bar;

public class Glass{

    public float volume;

    public Glass(float volume){
        this.volume = volume;
    }

    public static Glass parseFromString(String string){
        return new Glass(Float.parseFloat(string));
    }

    public float getVolume(){
        return this.volume;
    }
}