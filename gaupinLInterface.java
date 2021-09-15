/*********************************************************************
 Author    : Luc Gaupin 
 Course    : COP 3804 - Intermediate Java Programming
 Professor : Michael Robinson 
 Program # : Program Purpose/Description 
             { Program to continue education on polymorphism/ inheritance and applying what we learned }

 Due Date  : 07/25/2021 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Luc Gaupin }..........
*********************************************************************/


public interface gaupinLInterface 
{
    public String personPanterID = "6273885";
    public String personLastName = "Gaupin";
    public String personFirstName = "Luc";
    public String school = "FIU";

    public static void thePersonSchool( )
    {
        System.out.println(school);
    }

    public static void thePersonID( )
    {
        System.out.println(personPanterID);
    }

    public static void thePersonLastName( )
    {
        System.out.println(personLastName);
    }

    public static void thePersonFirstName( )
    {
        System.out.println(personFirstName);
    }
}
