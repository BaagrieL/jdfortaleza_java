import java.util.Scanner;
//Programa que peça um valor e diga se ele é negativo ou positivo 
 class MaiorN{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    float n1;
    System.out.print("digite um número:");
    n1=ler.nextInt();
    if(n1>0){
      System.out.println("O número "+n1+" é positivo");
    }else if(n1<0){
      System.out.println("O número "+n1+" é negativo");
      }else if(n1==0){
        System.out.println("O número "+n1+" é neutro");
      }
      
   }
 }
