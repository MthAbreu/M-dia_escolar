/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package média_escolar;

import java.util.Scanner;

public class Média_escolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       double num1, num2, exame, media1, media2;
       
       System.out.println ("informe a primeira nota do aluno: ");
       num1 = entrada.nextDouble();
       System.out.println ("informe a segunda nota do aluno: ");
       num2 = entrada.nextDouble();
       
       media1 = (num1 + num2)/2;
       
       if (media1 >= 7)
       {
           System.out.println ("Aluno aprovado com a nota:" +media1);
       }
       else
       {
           System.out.println ("informe a nota do exame do aluno: ");
           exame = entrada.nextDouble();
           
           media2 = (media1 + exame)/2;
           
           if (media2 >= 5)
           {
               System.out.println ("Aluno Aprovado em Exame com a nota: " +media2);
           }
           else
           {
               System.out.println ("O aluno foi reprovado com a nota: " +media2);
           }
       }
         
       
       
    }
    
}
