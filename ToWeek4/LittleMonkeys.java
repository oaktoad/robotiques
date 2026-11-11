package ToWeek4;

class LittleMonkeys {
    public static void main(String[] args) 
    {   
        // Week3 assignment

        int monkeyCount = 5;
        boolean jumping = true;
        String state = (jumping) ? "jumping on the bed!" : "not jumping on the bed";
        
        switch(monkeyCount) 
        {
            case 1:
                System.out.println(monkeyCount + " little monkey is " + state);
                break;
            default:
                System.out.println(monkeyCount + " little monkeys are " + state);
        }
        if(monkeyCount > 0 && jumping)
           System.out.println("One fell off and bumped their head! \nMama called the doctor, and the doctor said: \nNo more monkeys jumping on the bed!");
        else if(monkeyCount == 0)
            System.out.println("There are no monkeys");
        
        
    }
}
