////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 11/12/2020
// Classwork 6
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Classwork6 {
    public static void main(String[] args) {
    craps();
}

    // Generate random number in integer
    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random()
                * (upperBound - lowerBound + 1));
    }

    //Setting up both dice rolls and combining the two and displaying results
    public static int roll() {
        int dice1 = intRandom(1, 6);
        int dice2 = intRandom(1, 6);
        int sum = dice1 + dice2;

        System.out.println("You roll " + dice1 + " + " + dice2 + " = " + sum);

        return sum;

    }

    // Method checking dice rolls with craps rules
    public static void craps() {

        int first;



        first = roll();
        // Engine checking the dice rolls and declaring whether or not you've won or not
        switch (first) {
            case 2:
            case 3:
            case 12:
                System.out.println("You lose");
                break;
            case 7:
            case 11:
                System.out.println("You win");
                break;
            default:
                System.out.println("The point is " + first);
                int next;
                do {
                    next = roll();

                } while (!(next == first || next == 7));

                if (next == 7) {
                    System.out.println("You lose");
                } else {
                    System.out.println("You win");
                }

        }

    }

}

