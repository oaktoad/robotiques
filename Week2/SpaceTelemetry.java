package Week2;
class SpaceTelemetry {
    public static void main(String[] args) 
    {   
        // Week2 assignment

        byte sectorId = 0b111;
        int statusCode = 0x2F;
        int tick = 1;
        long totalDistance = 12500000;
        tick++;
        
        float batteryCharge = 84.50f;
        float batteryUsed = 100 - batteryCharge;

        char signalQualityGrade = 'A';
        
        // Each tick is worth 24 hours mission wise. 
        double orbitalKMH = (totalDistance / 1000) / (tick * 24);
        int hudDisplaySpeed = (int)orbitalKMH;
        batteryCharge = 100 - batteryUsed;
        
        boolean oxygenStatus = true;
        boolean isSystemFunctioning = batteryCharge > 20.00f && oxygenStatus;
        


            
        System.out.println("=======================================");
        System.out.println("\tMARS ROVER TELEMETRY HUB");
        System.out.println("=======================================");
        System.out.println("Mission cycle \t : " + tick);
        System.out.println("Sector ID (Binary 0b111) : " + sectorId);
        System.out.println("System Hex Status \t : " + statusCode);
        System.out.println("Distance Traveled \t : " + totalDistance + " m");
        System.out.println("Signal Grade \t : " + signalQualityGrade);
        System.out.println("----------------------------------------");
        System.out.println("Orbital Speed (Exact) \t : " + orbitalKMH + " km/h");
        System.out.println("HUD Display Speed (int) \t : " + hudDisplaySpeed + " km/h");
        System.out.println("Power Consumed \t : " + batteryUsed + "%");
        System.out.println("----------------------------------------");
        System.out.println("Systems Nominal \t : " + isSystemFunctioning);
        System.out.println("=======================================");
    }
}
