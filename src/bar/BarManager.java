package bar;

import java.io.*;
import ui.Manager;

public class BarManager {

	private Bar bar;
	private Manager ui;

	public BarManager(Bar bar) {
		this.bar = bar;
		ui = new Manager(this);
	}
	
	public BarManager(){
		bar = new Bar();
		ui = new Manager(this);
	}
	
	public void removeElement(BarElement element, int list){
		bar.removeBarElement(bar.getList(list), element); 
	}

	public void addElement(BarElement element, int list){
		bar.addBarElement(bar.getList(list), element);
	}

	public String getList(int list){
		return bar.getList(list).toString();
	}

	public int countItemsInList(int list){
		return bar.getList(list).size();
	}
	
	public void saveBarState() throws IOException{
		FileOutputStream fileOut = new FileOutputStream("/tmp/bar.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
		out.writeObject(bar);	
	}
	
	public static void readBarState() throws IOException, ClassNotFoundException{
		FileInputStream fileIn = new FileInputStream("/tmp/bar.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Bar bar = (Bar) in.readObject();
		
		new BarManager(bar);
	}
}

