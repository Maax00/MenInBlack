/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meninblack1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
//

//

/**
 *
 * @author clara
 */
public class Validering {
    public static boolean isValidString(String input){
        return input != null && !input.trim().isEmpty();
    }
    public static boolean isNameLetters(String name){
        String regex = "[A-za-z\\a\\s-]+$";
        return isValidString(name) && name.matches(regex);
    }
    public static boolean isValidPhone(String number){
        String regex = "[0-9\\s\\-()]+$";
        return isValidString(number) && number.matches(regex);
    }
    public static boolean isDate(String date){
        try{
            if(!isValidString(date)){
                return false;
            }
            //
            LocalDate currentDate = LocalDate.now();
            if(LocalDate.parse(date).isAfter(currentDate)){
                return false;
            }
            //
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException ex){
            return false;
        }
    }
    public static boolean isValidPassword(String password){
        if(password.length()>=7){
            return false;
        }
        else{
            return true;
        }
    }
    public static boolean isNumber(String integer){
        try{
            int num = Integer.parseInt(integer);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    public static boolean isValidEmail(String email){
        if(email.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isCommaNumber(double num){
        boolean result = false;
        if(num/1==num && num>0){
            result = true;
        }
        return result;
    }
}
