 

package com.mycompany.name1;

 import java.util.Scanner;
public class Name1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter your number :");
         int num = sc.nextInt();
         sc.nextLine();
         System.out.print("Enter your  name :" );
         String name = sc.nextLine();
         System.out.print("Enter your  age :"  );
         int age = sc.nextInt();
         
          name2 n=new name2( num,name,age);
          n.myInfo();
    }
}
