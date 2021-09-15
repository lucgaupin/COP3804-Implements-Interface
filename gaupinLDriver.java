public class gaupinLDriver implements gaupinLInterface
{
    public String personPanterID = "";
    public String personLastName = "";
    public String personFirstName = "";
    
    public void thePersonSchool( )
    {
        System.out.println(school);
    }

    public void thePersonID( String thePersonID )
    {
        this.personPanterID = thePersonID;
        System.out.println(thePersonID);
    }

    public void thePersonLastName( String thePersonLastName )
    {
        this.personLastName = thePersonLastName;
        System.out.println(thePersonLastName);
    }

    public void thePersonFirstName( String thePersonFirstName )
    {
        this.personFirstName = thePersonFirstName;
        System.out.println(thePersonFirstName);
    }

    public static void main( String[] args )
    {
        gaupinLDriver gaupinLDriver = new gaupinLDriver();

        gaupinLDriver.thePersonSchool( );
        gaupinLDriver.thePersonID( "6273885" );
        gaupinLDriver.thePersonLastName( "Gaupin" );
        gaupinLDriver.thePersonFirstName( "Luc" );
    }
}
