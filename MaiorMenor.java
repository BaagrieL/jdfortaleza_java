import java.util.Scanner;
//Programa que peça um valor e diga qual o maior e o menor deles 
 class MaiorMenor{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    float n1,n2,n3,maior,menor;
    System.out.print("digite um número:");
      n1=ler.nextFloat();
    System.out.print("digite um outro número:");
      n2=ler.nextFloat();
    System.out.print("digite um outro número:");
      n3=ler.nextFloat();
    
    //achando o maior

    maior=n1;
    menor=n1;
    if(n2>maior){
      maior=n2;
    }if(n3>maior){
      maior=n3;
    }
    System.out.println("maior:"+maior);
    
    //achando o menor

    if(n2<menor){
      menor=n2;
    }if(n3<menor){
      menor=n3;
    }
    System.out.println("menor:"+menor);
      
   }
 }