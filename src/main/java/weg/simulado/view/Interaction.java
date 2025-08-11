package weg.simulado.view;

import weg.simulado.model.Equipamento;

import java.util.Scanner;

public class Interaction {

    Scanner input;

    public Interaction (){
        this.input = new Scanner(System.in);
    }

    public int mainMenu(){
        System.out.println("|----------------------------------------------|");
        System.out.println("|         Bem vindo a WEG Control's            |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1- Cadastrar Equipamento                     |");
        System.out.println("| 2- Listar Todos                              |");
        System.out.println("| 3- Listar por Tipo                           |");
        System.out.println("| 4- Pesquisar por Código                      |");
        System.out.println("| 5- Remover por Código                        |");
        System.out.println("| 6- Movimentar Estoque                        |");
        System.out.println("| 0- Sair                                      |");
        System.out.println("|----------------------------------------------|");
        return HandleError.validateInt();
    }

    public int chooseTypeRegister(){
        System.out.println("|----------------------------------------------|");
        System.out.println("|            Cadastrar Equipamento             |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1- Motor Elétrico                            |");
        System.out.println("| 2- Painel de Controle                        |");
        System.out.println("|----------------------------------------------|");
        return HandleError.validateInt();
    }

    public String registerCode(){
        input.nextLine();
        System.out.print("Insira o Código do Equipamento: ");
        return input.nextLine();
    }

    public String registerName(){
        System.out.print("Insira o Nome do Produto: ");
        return input.nextLine();
    }

    public int registerAmount() {
        System.out.print("Insira a Quantidade do Produto ");
        return HandleError.validateInt();
    }

    public double registerPrice(){
        System.out.print("Insira o Preço do Equipamento ");
        return HandleError.validateDouble();

    }

    public double registerPower(){
        System.out.print("Insira a Potência do Equipamento: ");
        return HandleError.validateDouble();

    }

    public String registerVoltage(){
        input.nextLine();
        System.out.print("Insira a Tensão do Equipamento: ");
        return input.nextLine();
    }

    public void ListEquipment(Equipamento p, int cont){
        System.out.println(cont + "- " + p);
    }

    public int chooseTypeList(){
        System.out.println("|----------------------------------------------|");
        System.out.println("|            Listar Equipamento                |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1- Motor Elétrico                            |");
        System.out.println("| 2- Painel de Controle                        |");
        System.out.println("|----------------------------------------------|");
        return HandleError.validateInt();    }

    public String searchByCode(){
        input.nextLine();
        System.out.println("Insira o Código do Equipamento: ");
        return input.nextLine();
    }

    public void ListEquipment(Equipamento p){
        System.out.println(p);
    }

    public String removeByCode(){
        input.nextLine();
        System.out.println("Insira o Código do Equipamento: ");
        return input.nextLine();
    }

    public int chooseMovement(){
        System.out.println("|----------------------------------------------|");
        System.out.println("|            Tipo de Movimentação              |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 1- Adicionar unidades                        |");
        System.out.println("| 2- Retirar unidades                          |");
        System.out.println("|----------------------------------------------|");
        return HandleError.validateInt();
    }

    public String insertCode(){
        input.nextLine();
        System.out.print("Insira o Còdigo do Equipamento: ");
        return input.nextLine();
    }

    public int amountInsert(){
        System.out.print("Insira a Quantidade que Deseja adicionar ");
        return HandleError.validateInt();
    }

    public int amountDelete(){
        System.out.print("Insira a Quantidade que Deseja remover ");
        return HandleError.validateInt();
    }

    public void invalidAction(){
        System.out.println("Ação não permitida. O estoque não pode ficar negativo!!!");
    }

    public void emptyStock(){
        System.out.println("Estoque vazio!!!");
    }


}
