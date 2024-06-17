import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<String> teamOneList = new ArrayList<>();
        ArrayList<String> teamTwoList = new ArrayList<>();
        ArrayList<Integer> scoreOneList = new ArrayList<>();
        ArrayList<Integer> scoreTwoList = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                
                String teamOne = parts[0];
                String teamTwo = parts[1];
                int scoreOne = Integer.parseInt(parts[2]);
                int scoreTwo = Integer.parseInt(parts[3]);
                
                teamOneList.add(teamOne);
                teamTwoList.add(teamTwo);
                scoreOneList.add(scoreOne);
                scoreTwoList.add(scoreTwo);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String team = scan.nextLine();

        int count = 0;
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < teamOneList.size(); i++) {
            String teamOne = teamOneList.get(i);
            String teamTwo = teamTwoList.get(i);
            int scoreOne = scoreOneList.get(i);
            int scoreTwo = scoreTwoList.get(i);

            if (teamOne.equals(team) || teamTwo.equals(team)) {
                count++;
                if ((teamOne.equals(team) && scoreOne > scoreTwo) || 
                    (teamTwo.equals(team) && scoreTwo > scoreOne)) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
