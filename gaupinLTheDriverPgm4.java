public class gaupinLTheDriverPgm4 
{
    static gaupinLInitialSuperPgm4 gaupinLInitialSuperPgm4 = new gaupinLInitialSuperPgm4( );
    static sub1 sub1 = new sub1( );
    static sub2 sub2 = new sub2( );
    static sub3 sub3 = new sub3( );
    static gaupinLTheBuilder gaupinLTheBuilder = new gaupinLTheBuilder( );
    static gaupinLOverloader gaupinLOverloader = new gaupinLOverloader( );

    public static void displaySuper( )
    {
        System.out.println("\n\n*****************************************************************");
        System.out.println("1) Displaying methods in gaupinLInitialSuperPgm4");
        gaupinLInitialSuperPgm4.method2();
        gaupinLInitialSuperPgm4.method3();
    }

    public static void displaySub1( )
    {
        System.out.println("\n2) Displaying methods in sub1");
        sub1.method2();
        sub1.method3();
    }

    public static void displaySub2( )
    {
        System.out.println("\n3) Displaying methods in sub2");
        sub2.method2();
        sub2.method3();
    }

    public static void displaySub3( )
    {
        System.out.println("\n4) Displaying methods in sub3");
        sub3.method2();
        sub3.method3();
    }

    public static void displayTheBuilder( )
    {
        System.out.println("\n5) Displaying methods in gaupinLTheBuilder");
        gaupinLTheBuilder.method2();
        gaupinLTheBuilder.method3();
    }

    public static void displayTheOverloader( )
    {
        System.out.println("\n6) Displaying methods in gaupinLOverloader");
        gaupinLOverloader.method2();
        System.out.println("\n*****************************************************************\n\n");
    }

    public static void main( String[] args )
    {
        displaySuper( );
        displaySub1( );
        displaySub2( );
        displaySub3( );
        displayTheBuilder( );
        displayTheOverloader( );
    }
}
