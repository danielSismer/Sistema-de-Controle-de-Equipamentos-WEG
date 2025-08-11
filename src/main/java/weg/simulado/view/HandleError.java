package weg.simulado.view;

import java.util.Scanner;

public class HandleError {

    static Scanner input = new Scanner(System.in);

    public static int validateInt(){
        boolean invalid = true;
        
        int option = 0;
        while(invalid){
            System.out.print("\nInsira aqui: ");
            String text = input.nextLine();
            try{
                option = Integer.parseInt(text);
                invalid = false;
            } catch(NumberFormatException e ){
                System.out.println("Entrada de Dados inválida. Digite um número inteiro");
            }
        }
        return option;
    }

    public static double validateDouble(){
        boolean invalid = true;

        double option = 0;
        while(invalid){
            System.out.print("Insira aqui: ");
            String text = input.nextLine();
            try{
                option = Double.parseDouble(text);
                invalid = false;
            } catch(NumberFormatException e ){
                System.out.println("Entrada de Dados inválida. Digite um númeo decimal");
            }
        }
        return option;
    }
}
