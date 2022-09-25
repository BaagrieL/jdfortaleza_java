import java.util.Scanner;
/*Programa que verifique se a letra informada
 *é F ou M.
 *para F-Feminino, para M-Masculino, Sexo inválido 
 */
 class FM{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    String sexo;
    System.out.println("digite no campo abaixo seu sexo:");
    sexo=ler.next();
    
    if(sexo.equalsIgnoreCase("F")){
      System.out.print("Feminino");
    }else if(sexo.equalsIgnoreCase("M")){
      System.out.print("Masculino");
    }else{
      System.out.print("Sexo inválido, tente novamente");
    }
      
   }
 }
