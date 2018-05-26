package ui;

import java.awt.Dimension;

import javax.swing.JPanel;

public class WebViewer extends JPanel {

	private Manager manager;
	/**
	 * Create the panel.
	 */
	public WebViewer(Manager manager) {
		this.manager = manager;
		
		JPanel panel = new JPanel();
		panel.setSize(800, 600);
		add(panel);
	}

}
