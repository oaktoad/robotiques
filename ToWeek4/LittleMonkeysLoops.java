package ToWeek4;

class LittleMonkeysLoop {
    public static void main(String[] args) 
    {
        // Week4 assignment

        

        // The for loop section of the program.
        int initMonkeys = 3;
        System.out.println("=== 1. For Loop: The Nursery Rhyme Countdown ===");
        for( int i = initMonkeys; i > 0; i--)
        {
            System.out.println(i + " little monkeys jumping on the bed,");
            System.out.println("One fell off and bumped their head!");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("\"No more monkeys jumping on the bed!\"");
        }

        // The while loop section of the program.
        System.out.println("=== 2. While Loop: Doctor's Checkup Routine ===");
        initMonkeys = 1;
        while(initMonkeys < 4)
        {
            System.out.println("Doctor is examining monkey #" + initMonkeys + "... All cleared!");
            initMonkeys++;
        }

        // The do-while loop section of the program.
        System.out.println("=== 3. Do-While Loop: Bedtime Verification ===");
        initMonkeys = 3;
        do
        {
            System.out.println("Tucking in monkey #" + initMonkeys + "... Fast asleep!");
            initMonkeys--;
        }while(initMonkeys > 0);
    }
}
