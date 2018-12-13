package com.school_desks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    ArrayList<Integer> numbers = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      try {
        System.out.println(
                "Please, indicate the number of students" +
                        " in the one of three group\nand press the key 'Enter': ");
        String s = reader.readLine();
        if (Integer.parseInt(s) < 1 || Integer.parseInt(s) > 1000) {
          System.out.println("The wrong number!");
          i--;
        } else {
          numbers.add(i, Integer.parseInt(s));
        }
      } catch (NumberFormatException e) {
        System.out.println("The wrong format!");
      } catch (Exception e) {
        System.out.println("The error result! Try again.");
      }
    }
    System.out.println("Total number of desks required for purchase: ");
    double sum = 0;
    for (int number : numbers) {
      double n = (double) number / 2;
      sum += Math.ceil(n);
    }
    System.out.println((int) sum);
  }
}