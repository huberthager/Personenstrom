import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



public class Main {

//	public static void main(String[] args) {
//		try {
//			SimObserver simob = new SimObserver();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		final FieldPanel fp = new FieldPanel("FieldPanelDemo");
//        /* Use an appropriate Look and Feel */
//        try {
//            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        } catch (UnsupportedLookAndFeelException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//        /* Turn off metal's use of bold fonts */
//        UIManager.put("swing.boldMetal", Boolean.FALSE);
//         
//        //Schedule a job for the event dispatch thread:
//        //creating and showing this application's GUI.
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                fp.createAndShowGUI();
//            }
//        });
//    }
	
	public static void main(String args[]){
		Scheduler scheduler= new Scheduler(100);
		scheduler.run();
	}
	
}
