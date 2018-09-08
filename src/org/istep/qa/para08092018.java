package org.istep.qa;
import java.util.Scanner;
public class para08092018 {
    public static void main(String[] args) {
        /*int i = 1;
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
*/
        //-----------------------------------------------------------------------
        /*int a;
        String b = "tekst kotori ti vvel"; // создали строку
        String v = "tekst kotori ti vvil vtoroi raz"; // создали строку
        System.out.println(b.charAt(2)); //вывод второй буквы
        System.out.println(b.length()); // выыдвет длину текста
        String result=b+v; //склеивает две строчки
        System.out.println(result); //вывод склеиного результата
        //-------------------------------------------------------------------------
    // метод "equals" сравнение, пример (System.out.printLn (y.equals(u)) сравнили  строки "y" и "u"
    // метод "equalslgnoreCase" сравнение, пример (System.out.printLn (y.equalslgnoreCase(u)) сравнили  строки "y" и "u"
    // concat объединяет строки

        */
        //---------------------------------------------------------------
        /*String s1 = "123";
        String s2 = "567";
        String s3 = s1.concat(s2); // записывает значение s1+s2
        */
        //-----------------------------------------------------------------
        //split разделяет строку по какомуто символу (дефис, пробел или букве)
  String str= new String("Добро-пожаловать-сюда");
  System.out.println("Возвращаетмое значение");
  String[] result = str.split("-", 2); //разделяет строку (str) по дефису с лимитом "2" части
  for (int i=0; i<result.length; i++) {
      System.out.println(result[i]);
  }
    }
}
/*
contains - ищем совпадающие символы в строке "кот" в слове "Котенок"
String testString = "Котенок";
if ()
*/
