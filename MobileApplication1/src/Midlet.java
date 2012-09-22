/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author Tor
 */
public class Midlet extends MIDlet {
    private MyForm myForm;
    
    public void startApp() {
        myForm = new MyForm();
        Display.getDisplay(this).setCurrent(myForm);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
