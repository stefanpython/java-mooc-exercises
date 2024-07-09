import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        // List to store all recipes
        ArrayList<ArrayList<String>> recipes = new ArrayList<>();
        ArrayList<Integer> cookingTimes = new ArrayList<>();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                ArrayList<String> recipe = new ArrayList<>();
                recipe.add(fileScanner.nextLine()); // Recipe name
                cookingTimes.add(Integer.parseInt(fileScanner.nextLine())); // Cooking time

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    recipe.add(line); // Ingredient
                }

                recipes.add(recipe);
            }

            fileScanner.close();
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e.getMessage());
            return;
        }

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("stop - stops the program");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    System.out.println(recipes.get(i).get(0) + ", cooking time: " + cookingTimes.get(i));
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine().toLowerCase();
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).get(0).toLowerCase().contains(searchedWord)) {
                        System.out.println(recipes.get(i).get(0) + ", cooking time: " + cookingTimes.get(i));
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.parseInt(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (cookingTimes.get(i) <= maxCookingTime) {
                        System.out.println(recipes.get(i).get(0) + ", cooking time: " + cookingTimes.get(i));
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchedIngredient = scanner.nextLine().toLowerCase();
                System.out.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    ArrayList<String> ingredients = recipes.get(i);
                    boolean found = false;
                    for (int j = 1; j < ingredients.size(); j++) { // start from 1 to skip the recipe name
                        if (ingredients.get(j).toLowerCase().equals(searchedIngredient)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println(ingredients.get(0) + ", cooking time: " + cookingTimes.get(i));
                    }
                }
            } else if (command.equals("stop")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        scanner.close();
    }
}
