package org.istep.qa;
import java.util.Scanner;
public class Zadacha2 {
    public static void main(String[] args) {
        String a = "Первое значение";
        System.out.println(a);
        Scanner scanner=new Scanner(System.in);
        a= scanner.nextLine(); // перезапись тойже строки с клавиатуры
        System.out.println(a);
    }
}