import javax.swing.*;
import java.lang.*;

public class Exercicio26{

    public static void main( String [] args) {

        int matriz [][][] = new int [2] [2] [2];
        int proximo;
        boolean while1 = true;
        String now;
        int soma = 0;
        double media =0.00;


        for(int i=0; i<2; i++)
          for(int j=0; j<2; j++)
            for(int x=0; x<2; x++)
             {
                    while(while1)
                  {
                      try
                      {
                        now = JOptionPane.showInputDialog("Digite o termo da posição "+ i +" "+ j+ " "+x);
                        matriz[i][j][x] = Integer.parseInt(now);
                        while1 = false;
                      }
                      catch (Exception e)
                      {
                          JOptionPane.showMessageDialog(null, "Erro na conversão faça de novo:\n"+ e.toString());
                          while1 = true;
                      }
                  }

                  while1 = true;
             } 

        
        for(int i=0; i<2; i++)
        {  
          
          System.out.print("\Linha " + i +"\n");
          for(int j=0; j<2; j++)
          {
              System.out.print("Coluna "+ j +"\t");
              for(int x=0; x<2; x++)
                 System.out.print(matriz[i][j][x]+" ["+i+"] ["+j+"] ["+x+"] \t");
          }  
        }         

         while(while1)
         {

                        char a =JOptionPane.showInputDialog("Escolha uma opção:\n" +
                        "Digite apenas um caractere!!!!!!\n" +
                        "A - Soma dos elementos da primeira coluna\n"+
                        "B - Soma dos elementos de cada coluna\n "+
                        "C - Produtos dos elementos da primeira linha\n"+
                        "D - Soma de todos os elementos\n" +
                        "E - Média de todos os elementos\n"+
                        "F - Exibir elementos maiores que a média\n"+
                        "G - Mostrar maiores elementos e suas posições\n" +
                        "H - Mostrar menores elementos e suas posições\n" +
                        "Demais opções - Sair do programa ...").toUpperCase().charAt(0);
                        
                    
                        switch(a)
                        {
                            case 'A':
                            soma = 0;
                            for(int i=0; i<2; i++)
                            for(int x=0; x<2; x++)
                            {
                                soma = soma + matriz[i][0][x];                  
                            }
                            JOptionPane.showMessageDialog(null ,"Soma da primeira coluna é "+ soma);
                            break;
                            case 'B':
                                soma = 0;
                                for(int j=0; j<2; j++)
                                {   
                                    soma = 0;
                                    for(int i=0; i<2; i++)
                                    {
                                        
                                        for(int x=0; x<2; x++)
                                        {
                                            soma = soma + matriz[i][j][x];                  
                                        }
                                       
                                    }
                                
                                 JOptionPane.showMessageDialog(null ,"Soma da coluna número "+ j +" é "+ soma);
                                }
                            break;
                            case 'C':
                           int produto = 1;
                            for(int j=0; j<2; j++)
                            for(int x=0; x<2; x++)  
                            {
                                produto = produto * matriz[0][j][x];                  
                            }
                            JOptionPane.showMessageDialog(null ,"Soma da primeira linha é "+ produto);
                            break;
                           
                            case 'D':
                            JOptionPane.showMessageDialog(null ,"Soma de todos os  números é "+ soma(matriz));    
                            break;
                            case 'E':
                            media = soma(matriz)/8.0;
                            JOptionPane.showMessageDialog(null ,"A média é "+ media);    
                            break;
                            case 'F':
                            media = soma(matriz)/8.0;
                            
                                for(int i=0; i<2; i++)
                                for(int j=0; j<2; j++)
                                    for(int x=0; x<2; x++)
                                    {
                                        if(matriz [i] [j] [x] > media)
                                        JOptionPane.showMessageDialog(null, "Elemento "+ matriz [i][j][x] + "é maior que a media");
                                    }

                            break;
                            case 'G':
                            int maior =  matriz [0] [0] [0];
                           

                            
                                for(int i=0; i<2; i++)
                                for(int j=0; j<2; j++)
                                    for(int x=0; x<2; x++)
                                    {
                                        if(matriz [i] [j] [x] > maior)
                                        {
                                            maior = matriz [i][j][x];

                                        } 
                                    }
                                JOptionPane.showMessageDialog(null, "O maior elemento é "+ maior); 

                                   
                                for(int i=0; i<2; i++)
                                for(int j=0; j<2; j++)
                                    for(int x=0; x<2; x++)
                                    {
                                        if(matriz [i] [j] [x] == maior)
                                        {
                                           
                                             JOptionPane.showMessageDialog(null, "Na posição " +"["+ i +"]" +
                                             "["+ j +"]" +"["+ x +"]" ); 

                                        } 
                                    }

                            break;
                            case 'H':
                            int menor = matriz [0] [0] [0] ;

                            
                                for(int i=0; i<2; i++)
                                for(int j=0; j<2; j++)
                                    for(int x=0; x<2; x++)
                                    {
                                        if(matriz [i] [j] [x] < menor)
                                        menor = matriz [i][j][x];
                                    }
                                JOptionPane.showMessageDialog(null, "O menor elemento é "+ menor);


                                 for(int i=0; i<2; i++)
                                for(int j=0; j<2; j++)
                                    for(int x=0; x<2; x++)
                                    {
                                        if(matriz [i] [j] [x] == menor)
                                        {
                                           
                                             JOptionPane.showMessageDialog(null, "Na posição " +"["+ i +"]" +
                                             "["+ j +"]" +"["+ x +"]" ); 

                                        } 
                                    }    
                            break;
                            default:
                                JOptionPane.showMessageDialog(null, "Saindo...");
                                while1 = false;
                            break;  

                           
                            

                        }


         }   



    }

        static int soma(int [] [] [] matriz)
        {
         int soma = 0;   
           for(int i=0; i<2; i++)
                    for(int j=0; j<2; j++)
                    {
                        
                        for(int x=0; x<2; x++)
                        {
                            soma = soma + matriz[i][j][x];                  
                        }
                            
                    }

            return soma;
        
        }

    

  
}