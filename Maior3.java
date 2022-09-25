import java.util.Scanner;
//Programa que peça 3 valores e diga qual o maior deles
 class Maior3{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    float n1,n2,n3;
    System.out.print("digite um número:");
    n1=ler.nextFloat();
    System.out.print("digite um outro número:");
    n2=ler.nextFloat();
    System.out.print("digite um outro número:");
    n3=ler.nextFloat();
    if(n1>n2 && n1>n3){
      System.out.println("O número "+n1+" é maior que "+n2+" e que "+n3);
    }else if(n2>n1 && n2>n3){
      System.out.println("O número "+n2+" é maior que "+n1+" e que "+n3);
    }else if(n3>n2 && n3>n1){
      System.out.println("O número "+n3+" é maior que "+n1+" e que "+n2);
      }
      
   }
 }
