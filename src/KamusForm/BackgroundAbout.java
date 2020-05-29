/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KamusForm;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Nur Ichsan
 */
public class BackgroundAbout extends JPanel{
    private Image about;
    
    public BackgroundAbout() {
    about = new ImageIcon(getClass().getResource("About2.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);

        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(about, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
