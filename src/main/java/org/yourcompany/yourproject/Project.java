/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author Admin
 */
public class Project {

    public static void main(String[] args) {
        System.out.println( "Add:" + addition(6, 9) + "\nSubt:" + subtraction(9, 8) + "\nDiv:" + division(9, 1) );
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
