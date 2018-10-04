
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
     * @param theFirstName is the first name of the model.
     * @param theLastName is the last name of the model.
     * @param theHeightInches is the height of the model in inches.
     * @param theWeightPounds is the weight in pounds.
     * @param traveler is checking to see if the model travels or not.
     * @param smoker is to see if th model smokes or not.
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
     * @param theFirstName is the first name of the model.
     * @param theLastName is the last name of the model.
     * @param theHeightInches is the height of the model in inches.
     * @param theWeightPounds is the weight of the model in pounds.
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
     * @param  willTravel sets the value for canTravel.
     */
    public final void setCanTravel(boolean willTravel)
    {
        canTravel = willTravel;
    }

    /**
     * @param smoker sets the value for smokes.
     */
    public final void setSmokes(boolean smoker)
    {
        smokes = smoker;
    }

    /**
     * @param first sets the value for firstName.
     */
    public final void setFirstName(String first){
        if((first != null) && (first.length() >= MIN_FIRST_LAST_NAME) && (first.length() <= MAX_FIRST_LAST_NAME)){
            firstName = first;
        }
    }
    
    /**
     * @param last sets the value for lastName.
     */
    public final void setLastName(String last){
        if((last != null) && (last.length() >= MIN_FIRST_LAST_NAME) && (last.length() <= MAX_FIRST_LAST_NAME)){
            lastName = last;
        }
    }
    
    /**
     * @param height sets the value for heightInches.
     */
    public final void setHeightInches(int height){
        if((height >= MIN_HEIGHT_INCHES) && (height <= MAX_HEIGHT_INCHES)){
            heightInches = height;
        }
    }
    
    /**
     * @param weight sets the value for weightPounds.
     */
    public final void setWeightPounds(double weight){
        if((weight >= MIN_WEIGHT_POUNDS) && (weight <= MAX_WEIGHT_POUNDS)){
            weightPounds = weight;
        }
    }

    //Accessor methods "Getter"

    /**
     * @return the first name
     */
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
     * @return the last name
     */
    public String getLastName(){
        return this.lastName;
    } 

    /**
     * @return the height in inches
     */
    public int getHeightInches(){
        return this.heightInches;
    }

    /**
     * @return the weight in pounds
     */
    public double getWeightPounds(){
        return this.weightPounds;
    }
    
    /**
     * @return if the model travels or not
     */
    public boolean getCanTravel(){
        return this.canTravel;
    }
    
    /**
     * @return if the model smokes or not
     */
    public boolean getSmokes(){
        return this.smokes;
    }
    
    /**
     * 
     * Accessor methods but are not pure accessor methods because it has some logic
     * 
     * checks to see which one out of the the three possible values will be returned
     * 
     * @return value feet
     * @return value feet value inch
     * @return value feet value inches
     * 
     */
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
    
    /**
     * Mutator Methods
     * 
     * @return converts pounds into kilograms
     */
    public long getWeightKg(){
        long kilograms = Math.round(weightPounds * 0.454);
        return kilograms;
    }

    /**
     * 
     * @return occupation of model
     */
    public static String getOccupation(){
        return occupation;
    }
    

    //mutator methods
    
    /**
     * @param kilogram for weight of model
     */
    
    public void setWeight(long kilograms){
        kilograms = Math.round(weightPounds * 0.454);
    }
    
    
    /**
     * @param pounds sets the weight of the model
     */
    public void setWeight(double pounds){
        weightPounds = weightPounds;
    }

    /**
     * @param feet and inches sets the height of the model
     */
    public void setHeight(int feet, int inches){
        inches = Math.round(heightInches);
        feet = (int)Math.round(heightInches * 0.083);
        double leftoverInches = inches%feet;

        if(leftoverInches == 1){
            feet = feet;
        }

        else if(leftoverInches == 0){
            feet = feet;
        }

        else{
            feet = feet;
            inches = (int)leftoverInches;
        }
    }

    public void setHeight(int inches){
        heightInches = inches;
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
