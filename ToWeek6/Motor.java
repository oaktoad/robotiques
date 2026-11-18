package ToWeek6;

class MotorStats 
{   
    String brand;
    float speed;
    boolean isRunning;

    //redundant.

    /*public MotorStats(String brandName, float motorSpeed, boolean isMotorRunning) 
    {
        brand = brandName;
        speed = motorSpeed;
        isRunning = isMotorRunning;
    }*/


    // getter and setter for brand.
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String motorBrand)
    {
        this.brand = motorBrand;
    }

    // sets the motor speed.
    public float setSpeed(float motorSpeed)
    {   
        this.speed = motorSpeed;
        System.out.println(getBrand() + " speed set to " + speed + " RPM");
        return speed;
    }
    
    // displays vital info. 
    public String displayInfo()
    {   
        System.out.println("--- " + brand + " Motor Status ---");
        System.out.println("Running: " + isRunning);
        if(!isRunning) speed = 0.0f;
        System.out.println("Speed: " + speed + " RPM");
        System.out.println("--------------------");
        return("");
    }
    // starts motor.
    public boolean run()
    {   
        if(!isRunning) System.out.println("EpicMotors is currently stopped. Start the motor before setting speed.");
        System.out.println(brand + " motor started.");
        isRunning = true;
        return (isRunning);
    }
    // stops motor.
    public boolean stop()
    {   
        System.out.println(brand + " motor stopped.");
        isRunning = false;
        return (isRunning);
    }
}
public class Motor
{   
    public static void main(String[] args) 
    {   
        // Motor objects.
        MotorStats Motor1 = new MotorStats();
        MotorStats Motor2 = new MotorStats();

        // Output for motor1
        System.out.println("=== TESTING MOTOR 1 ===");
        Motor1.setBrand("EpicMotors");
        Motor1.displayInfo();
        
        Motor1.run();
        Motor1.setSpeed(150.0f);
        Motor1.displayInfo();
        
        Motor1.stop();
        Motor1.displayInfo();

        System.out.println("\n\n\n");

        // Output for Motor2
        System.out.println("=== TESTING MOTOR 2 ===");

        Motor2.setBrand("CoolioMotors");
        Motor2.displayInfo();
        
        Motor2.run();
        Motor2.setSpeed(150.0f);
        Motor2.displayInfo();
        
        Motor2.stop();
        Motor2.displayInfo();
    }
}
