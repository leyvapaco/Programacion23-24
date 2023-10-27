package u3.general;

class Array2 {
    public static void main( String args[] ) {
 

        // ------  Primer array de ejemplo, valores prefijados
        int[] a = { 10, 12345, -15, 0, 7 };
        System.out.print( "Los valores de a son: " );
        for (int i=0; i<5; i++)
            System.out.print( a[i] + " " );
        System.out.println( );
 
        // ------  Segundo array de ejemplo, valores uno por uno
        int[] b;
        b = new int [3];
        b[0] = 15; b[1] = 132; b[2] = -1;
        
        System.out.print( "Los valores de b son: " );
        for (int i=0; i<3; i++)
            System.out.print( b[i] + " " );
        System.out.println( );
 
        // ------  Tercer array de ejemplo, valores con "for"
        int j = 4;
        int[] c = new int[j];
        for (int i=0; i < j; i++)
            c[i] = (i+1)*(i+1);
        
        System.out.print( "Los valores de c son: " );
        for (int i=0; i < j; i++)
            System.out.print( c[i] + " " );
        System.out.println( );
   }
}