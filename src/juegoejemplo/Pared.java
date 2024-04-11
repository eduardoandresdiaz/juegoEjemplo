
package juegoejemplo;


public class Pared {
    // tamaño de la pared 5x5
    private int posX;//entre 0 y 50
    private int posY;//entre 0 y 22

    public Pared() {
        
        posX=(int)Math.random()*80;
        posY=(int)Math.random()*17;
        
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    
}
