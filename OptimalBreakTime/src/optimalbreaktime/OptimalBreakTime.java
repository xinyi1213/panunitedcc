/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimalbreaktime;

import java.util.Scanner;

/**
 *
 * @author Xin Yi
 */
public class OptimalBreakTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        System.out.println("enter length of array");

        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.println("enter elements");

        for (int i = 0; i < n; i++) {//for reading array
            arr[i] = s.nextInt();

        }
    }
    
}
