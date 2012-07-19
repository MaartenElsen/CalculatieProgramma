/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatieprogramma;

import calculatieprogramma.ui.StartScherm;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Mettuh
 */
public class CalculatieProgramma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CalculatieProgramma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new StartScherm().setVisible(true);
    }
}
