
/**
 * Write a description of class Model here.
 *
 * @author Monika Szucs
 * @version October 1, 2018
 */
public class Model
{
    //Constants
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
        setSmokes(Smoker);
    }

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
    
    public final void setFirstName(String first){
        if((first != null) && (first.length() >= 3) && (first.length() <= 20)){
            firstName = first;
        }
    }
    
    //Accessor methods
    
    public String getHeightInFeetAndInches(){
    
    }
    
    public long getWeightKg(){
    
    }
    
    
    public static String getOccupation(){
    }
    
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
