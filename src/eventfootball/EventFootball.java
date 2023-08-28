/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eventfootball;

import java.util.Scanner;

/**
 *
 * @author tomaeyo
 */
public class EventFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSource score = new ScoreSource();
        Subscriber James = new Subscriber();
        Subscriber Mike = new Subscriber();
        
        score.addSubscriber(James);
        score.addSubscriber(Mike);
        
        while(true) {
            System.out.print("Enter Score -> ");
            String input = sc.nextLine();
            
            if(input.equals("")) {
                break;
            }
            else {
                score.setScore(input);
            }
        }
    }
    
}
