
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0273898
 */
public class RomanNumerals {
    Scanner keyboard = new Scanner(System.in);
    
    int number = keyboard.nextInt();
    
    String output = "";
    
    switch (number) {
        case 1:
            output = "I";
            break;
        case 2:
            output = "II";
        case 3:
            output = "III";
    }
}
