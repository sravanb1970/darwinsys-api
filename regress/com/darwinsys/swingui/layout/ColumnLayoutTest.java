package com.darwinsys.swingui.layout;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.junit.Test;

/**
 * Simple class to non-exhaustively test out RelLayout layout manager.
 */
public class ColumnLayoutTest extends JFrame {

	private static final long serialVersionUID = 5311489466425902707L;
	
	JButton adButton;	// adjust (dummy here)
	JButton qb;			// quit

	/**
	 * Simple main program to test out RelLayout.
	 * Invoke directly from Java interpreter.
	 */
	public static void main(String[] av) {
		new ColumnLayoutTest(ColumnLayout.X_AXIS, 0, 0).setVisible(true);
		new ColumnLayoutTest(ColumnLayout.Y_AXIS, 0, 0).setVisible(true);
		new ColumnLayoutTest(ColumnLayout.X_AXIS, 10, 10).setVisible(true);
		new ColumnLayoutTest(ColumnLayout.Y_AXIS, 10, 10).setVisible(true);
	}

	/** Construct a Test test program. */
	ColumnLayoutTest(int alignment, int hpad, int vpad) {
		super("Column Layout Tester");
		Container cp = getContentPane();
		ColumnLayout cl = new ColumnLayout(alignment, hpad, vpad);
		cp.setLayout(cl);
		cp.add(new JButton("X"));
		cp.add(new JButton("MidWidth"));
		cp.add(new JButton("A Long Button"));
		cl.addSpacer(cp);
		cp.add(qb = new JButton("Quit"));
		qb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		pack();
	}
	
	public ColumnLayoutTest() {
		// empty
	}
	
	@Test
	public void trivialTest() {
		try {
			main(null);
		} catch (HeadlessException he) {
			System.out.println("ColumnLayoutTest.test(): cannot test Headless");
		}
	}
}
