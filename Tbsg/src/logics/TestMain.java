package logics;

import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import graphics.map.Map;
import logics.map.MapGraphObject;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapGraphObject m = new MapGraphObject(0,0,"test.gif");
		/*MapGraphObject m2 = new MapGraphObject(10,100,"test.gif");
		MapGraphObject m3 = new MapGraphObject(5,5,"test.gif");
		MapGraphObject m4 = new MapGraphObject(-10,-1,"test.gif");
		*/
		Map mm = new Map();
		Panel p = new Panel();
		
		mm.addObject(m);//mm.addObject(m2);mm.addObject(m3);mm.addObject(m4);
		mm.setXYArea(0, 0, 1000, 1000);
		JFrame jf = new JFrame("Töttöröö");
		jf.setSize(500, 500);
		//jf.add(mm);
		jf.add(mm);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
