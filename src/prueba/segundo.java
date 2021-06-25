
package test;


public class segundo {
    import  dominio.Punto ;
import static  java.lang.Math.pow ;
import static  java.lang.Math.sqrt ;
import  java.util.Scanner ;

público  de clase  TestPunto {

     datos del Scanner estático =  nuevo  Scanner ( System . in);

    public static void main(String[]args ) {
        System.out.println ( " Cuantos movientos desea realizar ?: " );
        int n =0;
        while (n <1) {
            n = datos.nextInt ();
        }
        Punto[] punto = new Punto [n];
        llenaMovimientos (punto);

    }

    public  static  void  llenaMovimientos (Punto  pnt []) {
        int dirX =  0 ;
        int dirY =  0 ;
        double distancia;
        int numMovimiento;
        pnt[0]= nuevo Punto(dirX, dirY);
        System.out.println(" Coordenada Inicial");
        System.out.println(pnt [0]);

        for(int i=0; i< pnt.longitud; i ++ ) {
            datos.nextInt();
            System.out.println( " " );
            System.out.println( " Ingrese la distancia del movimiento No " +(i+1));
            numMovimiento= datos.nextInt ();
            int valorEntero= (int) Math.piso(Matemáticas.aleatorio()*(4-1+1)+1);
            switch (valorEntero) {
                caso  1 :
                    dirX = dirX - numMovimiento;
                    Sistema . fuera . println ( " Movimiento hacia la Izquierda " );
                    romper ;
                caso  2 :
                    dirY = dirY + numMovimiento;
                    Sistema . fuera . println ( " Movimiento hacia Arriba " );
                    romper ;
                caso  3 :
                    dirY = dirY - numMovimiento;
                    Sistema . fuera . println ( " Movimiento hacia Abajo " );
                    romper ;
                caso  4 :
                    dirX = dirX + numMovimiento;
                    Sistema . fuera . println ( " Movimiento hacia la Derecha " );
                por defecto :
                    romper ;
            }
            Sistema . fuera . println ( " Estas en la coordenada: " );
            pnt [i] =  nuevo  Punto (dirX, dirY);
            Sistema . fuera . println (pnt [i]);
        }
        distancia = sqrt (pow ((dirX), 2 ) + pow ((dirY), 2 ));
        Sistema . fuera . printf ( " La distancia total recorrida es de:% .2f \ n " , distancia);
    }

}
