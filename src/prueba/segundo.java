público  de clase  TestPunto {

     datos del Scanner estático =  nuevo  Scanner ( System . in);

    public  static  void  main ( String [] args ) {
        Sistema . fuera . println ( " Cuantos movientos desea realizar ?: " );
        int n =  0 ;
        while (n <  1 ) {
            n = datos . nextInt ();
        }
        Punto [] punto =  nuevo  Punto [n];
        llenaMovimientos (punto);

    }

    public  static  void  llenaMovimientos ( Punto  pnt []) {
        int dirX =  0 ;
        int dirY =  0 ;
        doble distancia;
        int numMovimiento;
        pnt [ 0 ] =  nuevo  Punto (dirX, dirY);
        Sistema . fuera . println ( " Coordenada Inicial " );
        Sistema . fuera . println (pnt [ 0 ]);

        para ( int i =  0 ; i < pnt . longitud; i ++ ) {
            datos . Proxima linea();
            Sistema . fuera . println ( " " );
            Sistema . fuera . println ( " Ingrese la distancia del movimiento No "  + (i +  1 ));
            numMovimiento = datos . nextInt ();
            int valorEntero = ( int ) Math . piso ( Matemáticas . aleatorio () * ( 4  -  1  +  1 ) +  1 );
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
