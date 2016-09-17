/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pakar.kelas_tanmbahan;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Ncef
 */
public class button extends JButton{
    private Color color;
     public button(){
         setOpaque(false);
         setContentAreaFilled(false);
         setBorderPainted(false);
         color = new Color(0,0,0,100);
     }
     
    @Override
    public void setBackground(Color Background){
        super.setBackground(Background);
        color = new Color(255,255,255,255);
        repaint();
    }
     
    protected void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setColor(color);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        graphics2D.dispose();
    }
}
