/**
 * KIT107 Assignment 1
 *
 * Periodic Table Printer Class
 *
 * @author Robert Bailey, 961231 Insert student IDs and names here
 * @version <<Insert date of completion here>>
 */


import java.util.Scanner;
import java.text.DecimalFormat;


public class PeriodicTable implements PeriodicTableInterface
{
    // Final Instance Variables
    protected final String TABLE[][]={{"H","1"},{"He","18"},{"Li","1"},{"Be","2"},{"B","13"},{"C","14"},{"N","15"},{"O","16"},{"F","17"},
        {"Ne","18"},{"Na","1"},{"Mg","2"},{"Al","13"},{"Si","14"},{"P","15"},{"S","16"},{"Cl","17"},{"Ar","18"},{"K","1"},{"Ca","2"},
        {"Sc","3"},{"Ti","4"},{"V","5"},{"Cr","6"},{"Mn","7"},{"Fe","8"},{"Co","9"},{"Ni","10"},{"Cu","11"},{"Zn","12"},{"Ga","13"},
        {"Ge","14"},{"As","15"},{"Se","16"},{"Br","17"},{"Kr","18"},{"Rb","1"},{"Sr","2"},{"Y","3"},{"Zr","4"},{"Nb","5"},{"Mo","6"},
        {"Tc","7"},{"Ru","8"},{"Rh","9"},{"Pd","10"},{"Ag","11"},{"Cd","12"},{"In","13"},{"Sn","14"},{"Sb","15"},{"Te","16"},
        {"I","17"},{"Xe","18"},{"Cs","1"},{"Ba","2"},{"La","-11"},{"Ce","-12"},{"Pr","-13"},{"Nd","-14"},{"Pm","-15"},{"Sm","-16"},
        {"Eu","-17"},{"Gd","-18"},{"Tb","-19"},{"Dy","-20"},{"Ho","-21"},{"Er","-22"},{"Tm","-23"},{"Yb","-24"},{"Lu","-25"},
        {"Hf","4"},{"Ta","5"},{"W","6"},{"Re","7"},{"Os","8"},{"Ir","9"},{"Pt","10"},{"Au","11"},{"Hg","12"},{"Tl","13"},{"Pb","14"},
        {"Bi","15"},{"Po","16"},{"At","17"},{"Rn","18"},{"Fr","1"},{"Ra","2"},{"Ac","-31"},{"Th","-32"},{"Pa","-33"},{"U","-34"},
        {"Np","-35"},{"Pu","-36"},{"Am","-37"},{"Cm","-38"},{"Bk","-39"},{"Cf","-40"},{"Es","-41"},{"Fm","-42"},{"Md","-43"},
        {"No","-44"},{"Lr","-45"},{"Rf","4"},{"Db","5"},{"Sg","6"},{"Bh","7"},{"Hs","8"},{"Mt","9"},{"Ds","10"},{"Rg","11"},
        {"Cn","12"},{"Uut","13"},{"Fl","14"},{"Uup","15"},{"Lv","16"},{"Uus","17"},{"Uuo","18"}};
    protected final DecimalFormat FMT=new DecimalFormat("000");
    
    // Non-final Instance Variables

    /**  
     * PeriodicTable() -- Constructor

     * Pre-condition: none
     * Post-condition: the instance variable show is set to true if printing of the lanthanum and actinium groups is desired and false
     *                 otherwise; start is given the atomic number of the first element to display; stop is given the atomic number of
     *                 the last element to display.
     */
    public PeriodicTable()
    {
    /**  
     * calling and initiating Scanner, this import
     */
        Scanner sc = new Scanner(System.in);    // mechanism for user input
         
        // Declaring local variables       
        String userInput;
         
         //obtaining the necessary user input
        System.out.print("Print the Lanthanum or Actinium groups if necessary [Y/N]? ");
        userInput = sc.nextLine();

    /**
     * setting the start, stop, and show instance variables by obtaining information from the user via prompts,
     * along with handling errorneous/unexpected entries by the user
     */
         // like this (below?)
        boolean show = userInput.equalsIgnoreCase("Y");

        sc.close();
    }
    
    
    /**
     * printTable() -- display (excerpt of) periodic table
     *
     * Pre-condition: instance variabls start and stop have been validly defined
     * Post-condition: the (excerpt of) the periodic table from elements between the range of start and stop (excluding the lanthanum
     *                 and actinium groups) has been printed and if this range includes those groups then the relevant instance
     *                 variable (printLan or printAct) is true, otherwise it/these are false
     */
    
    
    /**
     * Insertion at front?
     */
    public void printTable()
    {
// COMPLETE ME!
    }
    
    
    /**
     * printGroups() -- display (excerpt of) lanthanum and actinium groups
     *
     * Pre-condition: the instance variables start, stop, show, printLan, printAct have been validly defined
     * Post-condition: if display of the lanthanum groups is necessary (because of the range) and desired by the user, then (a
     *                 portion of) it is displayed; ditto the actinium group
     */
    public void printGroups()
    {
// COMPLETE ME!
    }
}
