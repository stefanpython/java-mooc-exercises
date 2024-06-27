/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author tao
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary objects;

    public TextUI(Scanner scannerUI, SimpleDictionary objectsUI) {
        this.scanner = scannerUI;
        this.objects = objectsUI;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Unknown command");
            }
            
            if(command.equals("add")) {
                System.out.println("Word: ");
                String word = this.scanner.nextLine();
                
                System.out.println("Translation: ");
                String translation = this.scanner.nextLine();
                
                objects.add(word, translation);
            } else {
                System.out.println("Unknown command");
            }
            
            if(command.equals("search")) {
                System.out.println("To be translated: ");
                String translated = this.scanner.nextLine();
                
                String obj = objects.translate(translated);
                if(obj == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println("Translation: " + obj);
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
            
        }
    }
    
    
}
