/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;
import java.util.*;
/**
 *
 * @author Xin Yi
 */
class Challenge {

    /**
     * @param args the command line arguments
     */
    static int countWords(String inputstr){
        if(inputstr == null || inputstr.isEmpty()){
            return 0;
        }
        String[] words = inputstr.split("(?=\\p{Upper})");
        return words.length;    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println(countWords(in.nextLine()));
        
    }
}
