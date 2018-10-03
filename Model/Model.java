
/**
 * Write a description of class Model here.
 *
 * @author Monika Szucs
 * @version October 1, 2018
 */
public class Model
{
    //Constants
    private static  final   int     MIN_FIRST_LAST_NAME = 3;
    private static  final   int     MAX_FIRST_LAST_NAME = 20;
    private static  final   int     MIN_HEIGHT_INCHES = 24;
    private static  final   int     MAX_HEIGHT_INCHES = 84;
    private static  final   double  MIN_WEIGHT_POUNDS = 80.0;
    private static  final   double  MAX_WEIGHT_POUNDS = 280.0;

    //Class (Static) Variables
    private static  String occupation = "modeling";

    // instance variables
    private String  firstName;
    private String  lastName;
    private int     heightInches;
    private double  weightPounds;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Constructor for objects of class Model
     * 
     * Constructor #1
     * 
     * @param
     * @param
     * @param
     * @param
     * @param
     * @param
     * 
     */
    public Model(   String theFirstName, 
    String theLastName, 
    int theHeightInches, 
    double theWeightPounds,
    boolean traveler,
    boolean smoker
    )
    {
        setFirstName(theFirstName);
        setLastName(theLastName);
        setHeightInches(theHeightInches);
        setWeightPounds(theWeightPounds);
        setCanTravel(traveler);
        setSmokes(smoker);
    }

    /**
     * Constructor for objects of class Model
     * 
     * Constructor #2
     * 
     * @param
     * @param
     * @param
     * @param
     * 
     */
    public Model(   String theFirstName, 
    String theLastName, 
    int theHeightInches, 
    double theWeightPounds
    )
    {
        setFirstName(theFirstName);
        setLastName(theLastName);
        setHeightInches(theHeightInches);
        setWeightPounds(theWeightPounds);
        setCanTravel(true);
        setSmokes(false);

    }

    //Mutator Method "Setters"

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public final void setCanTravel(boolean willTravel)
    {
        canTravel = willTravel;
    }

    public final void setSmokes(boolean smoker)
    {
        smokes = smoker;
    }

    public final void setFirstName(String first){
        if((first != null) && (first.length() >= MIN_FIRST_LAST_NAME) && (first.length() <= MAX_FIRST_LAST_NAME)){
            firstName = first;
        }
    }

    public final void setLastName(String last){
        if((last != null) && (last.length() >= MIN_FIRST_LAST_NAME) && (last.length() <= MAX_FIRST_LAST_NAME)){
            lastName = last;
        }
    }

    public final void setHeightInches(int height){
        if((height >= MIN_HEIGHT_INCHES) && (height <= MAX_HEIGHT_INCHES)){
            heightInches = height;
        }
    }

    public final void setWeightPounds(double weight){
        if((weight >= MIN_WEIGHT_POUNDS) && (weight <= MAX_WEIGHT_POUNDS)){
            weightPounds = weight;
        }
    }

    //Accessor methods "Getter"
    /*
    String  firstName;
    private String  lastName;
    private int     heightInches;
    private double  weightPounds;
    private boolean canTravel;
    private boolean smokes;
     */

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    } 

    public int getHeightInches(){
        return this.heightInches;
    }

    public double getWeightPounds(){
        return this.heightInches;
    }

    public boolean getCanTravel(){
        return this.canTravel;
    }

    public boolean getSmokes(){
        return this.smokes;
    }

    public String getHeightInFeetAndInches(){
        double inches = (double) heightInches;
        double feet = ((double)heightInches * 0.083);
        double leftoverInches = inches%feet;

        if(leftoverInches == 1){
            return String.valueOf(feet) + " feet " + String.valueOf(leftoverInches) + " inch.";
        }

        else if(leftoverInches == 0){
            return String.valueOf(feet) + " feet.";
        }

        else{
            return String.valueOf(feet) + " feet " + String.valueOf(leftoverInches) + " inches.";
        }

    }

    public long getWeightKg(){
        long kilograms = Math.round(weightPounds * 0.454);
        return kilograms;
    }

    /**
    public static String getOccupation(){
    }
     **/

    //mutator methods
    public void setWeight(long kilograms){
    }
    
    public void setWeight(double pounds){
    }

    public void setHeight(int feet, int inches){
    }

    public void setHeight(int inches){
    }

    public void printDetails(){
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInches() + " inches");
        System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");

        if(canTravel){
            System.out.print("Does travel");
        } else {
            System.out.print("Does not travel");
        }

        if(smokes){
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

}
