public class AssigOne226 
{
    public static void main(String[] args)
    {
        System.out.println("Periodic Table Printer");
        System.out.println("**********************");
        //the program heading and an underline, which will appear to the user
        PeriodicTable pt = new PeriodicTable();
        //calling the PeriodicTable file and Constructor
        System.out.println("Periodic Table");
        System.out.println("=============="); 
        //how the heading of the printed table should look
        pt.printTable();
        //to print the relevant parts of the table, eg. if these include the Lanthanum or Actinium groups
        pt.printGroups();
    /*  to display any elements in the Lanthanum and Actinium groups if the user has requested this 
        and if these elements are within the range of start and stop       
    */
    } 
}
