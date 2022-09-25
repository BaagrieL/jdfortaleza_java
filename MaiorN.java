import java.util.Scanner;
  
 class MaiorN{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    int n1,n2;
    System.out.print("digite um número:");
    n1=ler.nextInt();
    System.out.print("Digite um outro número:");
    n2=ler.nextInt();
    if(n1>n2){
      System.out.println("O número "+n1+" é maior que "+n2);
    }else{
      System.out.println("O número "+n2+" é maior que "+n1);
      }
   }
 }
