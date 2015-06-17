package graphics.components;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ImagePanel extends JPanel{
	private BufferedImage image;
	private int xdim;
	private int ydim;
	
    public ImagePanel(String pathNname) throws IOException {            
    	image = ImageIO.read(new File(pathNname));
    }
    
    @Override
    public void setSize(int xdim, int ydim){
    	this.xdim = xdim;
    	this.ydim = ydim;
    }
    
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.xdim, this.ydim, null);    
    }

}