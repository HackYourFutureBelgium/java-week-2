package projects.project3;

/*
    2D Array Scoreboard
    Concepts used: Multidimensional arrays, nested loops.

    Create a 2D array representing scores of 3 players across 5 games.
    Fill the array with random numbers (e.g., 0–100).
    Print the scores in a table format.
    Calculate and display the total score of each player.
 */
public class MultiDimentionalArraysDemo {

    public static void main(String[] args) {
        int[][] scores = new int[3][5];
        fillScoresRandomly(scores);
        print(scores);
        calculateAndPrintTheTotalScore(scores);
    }

    private static void calculateAndPrintTheTotalScore(int[][] scores) {
        for(int i = 0; i<scores.length; i++) {
            int total = 0;
            for (int score: scores[i]) {
                total += score;
            }
            System.out.println("Score of player "
                    + (i+1) + " is " + total);
        }
    }

    /*
        Mutates scores
     */
    public static void fillScoresRandomly(int[][] scores) {
        for(int i=0; i<scores.length; i++) {
            for(int j=0; j<scores[i].length; j++) {

                scores[i][j] = Double.valueOf(Math.random()*100).intValue();

            }
        }
    }

    public static void print(int[][] scores) {
        for(int i=0; i<scores.length; i++) {
            System.out.println("Player number " + (i+1) + " Scores");
            for(int j : scores[i]) {
                System.out.print(" " + j );
            }
            System.out.println("\n");
        }
    }

}
