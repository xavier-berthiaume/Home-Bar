package bar;

<<<<<<< HEAD
import java.io.Serializable;
import java.util.ArrayList;

public class Bar implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7007629337382003766L;
	private ArrayList<BarElement> bottles;
=======
import java.util.ArrayList;

public class Bar{

    private ArrayList<BarElement> bottles;
>>>>>>> refs/remotes/origin/master
    private ArrayList<BarElement> toolset;
    private ArrayList<BarElement> syrups;
    private ArrayList<BarElement> juices;
    private ArrayList<BarElement> menus;

    public ArrayList<BarElement> getList(int list){
        switch(list){
            case 0:
                return bottles;
            case 1:
                return syrups;
            case 2: 
                return juices;
            case 3:
                return toolset;
            case 4:
                return menus;
        }
        return null;
    }

    public void removeBarElement(ArrayList<BarElement> array, BarElement element){
        array.remove(element);
    }

    public void addBarElement(ArrayList<BarElement> array, BarElement element){
        array.add(element);
    }
}