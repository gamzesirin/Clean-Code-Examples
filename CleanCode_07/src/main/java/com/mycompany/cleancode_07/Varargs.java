/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cleancode_07;

/**
 *
 * @author gamze
 */
public class Varargs {

    public static int sum(int a, int... args) {
        int sum = 0;
        for (int i : args)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        sum(1);


    }

}