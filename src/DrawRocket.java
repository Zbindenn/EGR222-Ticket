public class DrawRocket {
    /**
     * Created by Noah Zbinden(627664) on 9/11/2018
     * You shouldn't use any if-else statements
     * Put comments in your code
     * Follow freedom of information and gilligans island rule
     * Discussed with: None
     * Below program builds a ship using char's with a variable on size which will change the size of the ship proportionally.
     **/

    //Make below variable a class constant used only by this class (DO NOT CHANGE THE NAME OF THE VARIABLE)
    private static final int SIZE =4; // DO NOT REMOVE THIS LINE

    public static void main(String[] args) {
        buildShip(SIZE);                // Call method buildShip with an int size
    }


    public static void buildShip(int size){  // Helper method pulls all methods together to print out in desired order
        Trishape(size);
        PrintPlusLine(size);
        UpwardShip(size);
        DownardShip(size);
        PrintPlusLine(size);
        DownardShip(size);
        UpwardShip(size);
        PrintPlusLine(size);
        Trishape(size);
    }

    public static void Trishape(int size){          // Builds Top and bottom cone of ship
        int width = ((size*4)+2);

        for (int i = 0; i < (size*2)-1; i++) {
            int gap = (width - (4+(2*i)))/2;        // Width of space for each side
            int nonGap = (4+(2*i));                 // Width of cone
            int numSlash = (nonGap-2)/2;            // Num of Slashes on each side

            PrintSpaces1(gap);                      // Call print Spaces1 with gap as int
            PrintSlash(numSlash, "/");           //  Call print PrintSlash with an int and the char printed
            System.out.print("**");                 //  Print 2 stars
            PrintSlash(numSlash, "\\");          //  Call print Spaces1 with gap as int
            PrintSpaces1(gap);                      //  Call print PrintSlash with an int and the char printed
            System.out.println();                   //  Start a new line
        }
    }

    public static void PrintPlusLine(int size){ // Prints a line between sections of ship
        System.out.print("+");                  // Print a "+" at the start every time line is called

        for (int i = 0; i < size*2 ;i++){       // for loop to print '=* many times depending on size
            System.out.print("=*");
        }
        System.out.print("+");                  // Print a "+" at the end every time line is called
        System.out.println();
    }

    public static void UpwardShip(int size){     // Builds the top half of the body of the ship by using bottom three methods and passing them through a loop
        int OutsideDots = size;                 // Need an instant of size that I can decrease value without changing for loop

        for(int i = 1; i<= size; i++){
            OutsideDots--;
            System.out.print("|");
            PrintDots(OutsideDots);               // Call PrintDots with passing Outside the Dots to know how many to print
            PrintSlash(i,"/\\");               // Call Print slash passing i and a downward cone shape
            PrintDots(OutsideDots*2); // Because middle dots pattern is twice as long multiply outside dots by 2
            PrintSlash(i,"/\\");               // Call Print slash passing i and a downward cone shape
            PrintDots(OutsideDots);
            System.out.print("|");
            System.out.println();
        }
    }

    public static void DownardShip(int size){   // Builds the bottom half of the body of the ship using methods below running them through a loop
        int OutsideDots = size;                 // Need an instant of size that I can decrease value without changing for loop

        for(int i = 1; i<= size; i++) {
            System.out.print("|");
            OutsideDots--;
            PrintDots(i-1);                   // Call PrintDots but needs dots to start at 0 and go up so pass i-1
            PrintSlash(OutsideDots+1,"\\/"); // Print slash passing a upward cone and outside dots +1
            PrintDots((i*2)-2);               // Middle dots twice as big so need (i-1)*2 passed
            PrintSlash(OutsideDots+1,"\\/");
            PrintDots(i-1);
            System.out.print("|");
            System.out.println();
        }
    }

    public static void PrintSpaces1(int gap){
        for (int z = 0; z < gap; z++) {                  // Print spaces for a int passed
            System.out.print(" ");
        }
    }

    public static void PrintSlash(int numSlash, String c){
        for (int j = 0; j < numSlash; j++) {             // Print passed string for an int passed
            System.out.print(c);
        }
    }

    public static void PrintDots(int OutsideDots){      // Prints Dots for an int given
        for(int j = 0 ; j < OutsideDots; j++) {
            System.out.print(".");
        }
    }
}
