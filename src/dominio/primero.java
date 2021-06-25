
package dominio;


public class primero {
    paquete  dominio ;

 clase público.static {
     
 }

    private int dirX;
    private int dirY;
    
   

     Punto público ( int  dirX , int  dirY ) {
        this.dirX= dirX;
        this.dirY= dirY;
        return null;
        
    }

    public  int getDirX () {
        return dirX;
    }

    
    public  void  setDirX ( int  dirX ) {
        this.dirX= dirX;
    }

    public  int  getDirY () {
        return dirY;
    }

    public  void  setDirY ( int  dirY ) {
        this.dirY = dirY;
    }

    @Override
    public  String  toString () {
        return"X= "+ this. dirX+"  "+"Y= " + this. dirY;
    }

    private static class Punto {

        public Punto() {
        }
    }

    private static class clase {

        public clase() {
        }
    }

    private static class paquete {

        public paquete() {
        }
    }

}

