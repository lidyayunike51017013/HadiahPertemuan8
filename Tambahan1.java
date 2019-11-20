/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahan1;

/**
 *
 * @author ASUS
 */
import java.awt.*;
public class Tambahan1 extends Panel {
    Tambahan1(){
    setBackground(Color.LIGHT_GRAY);
    }

    /**
     * @param args the command line arguments
     */
    public void paint (Graphics M)   {
        //Cara Membuat Kerangka Mobil
        M.setColor(Color.WHITE);
        M.fillRect(100, 180, 400, 180);
        M.setColor(Color.WHITE);
        M.fillRect(500, 250, 100, 110);
       
        M.setColor(Color.YELLOW);
        M.fillRoundRect(142, 330, 100, 100,100,100);
        M.setColor(Color.BLACK);
        M.fillRoundRect(400, 330, 100, 100,100,100);
        M.setColor(Color.YELLOW);
        M.drawOval(142, 330, 100, 100);
        M.drawOval(400, 330, 100, 100);
        M.drawOval(399, 330, 100, 100);
        
        M.setColor(Color.BLUE);
        M.fillRect(240, 250, 130, 110);
        M.setColor(Color.WHITE);
        M.fillOval(310, 280, 50, 50);
        
        M.setColor(Color.YELLOW);
        Font f = new Font("Times New Roman", Font.ITALIC,25);
        FontMetrics fm = getFontMetrics(f);
        M.setFont(f);
        String nm = "SALAH SATU TAMPILAN SCRIPT DENGAN MENGGUNAKAN GRAFIK";
        M.drawString(nm, 150, 500);    
    }
    public static void main(String[] args) {
        Frame f = new Frame("Mobil");
       Tambahan1 Mp = new Tambahan1();
       f.add(Mp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}    

