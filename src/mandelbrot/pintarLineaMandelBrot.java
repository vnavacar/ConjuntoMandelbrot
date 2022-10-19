
/* 
package mandelbrot;

public class pintarLineaMandelBrot(int linea) extends Thread {

    int linea;

    public pintarLineaMandelBrot(int linea){
        this.linea = linea;
    }
    public void run(){
        Graphics g = panel.getGraphics();
        double x=0, y=0;
        int w = linea;
        int h = panel.getHeight();
        for(int j=0; j<panel.getHeight(); j++){
            x =  j * (x2 - x1)/w + x1;
            y = y1 - linea * (y1 - y2)/h;
            
            int velocidad = mandelbrot(x, y);
            
            g.setColor(Color.getHSBColor((velocidad)/(float)160, 1, 1));
            g.drawRect(j, linea, 1, 1);
        }
    }
    

}*/