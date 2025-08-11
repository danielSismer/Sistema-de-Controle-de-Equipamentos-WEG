package weg.simulado.main;

import weg.simulado.model.Equipamento;
import weg.simulado.model.MotorEletrico;
import weg.simulado.model.PainelControle;
import weg.simulado.service.EstoqueController;
import weg.simulado.view.Interaction;

public class Main {

    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento();
        MotorEletrico motorEletrico = new MotorEletrico();
        PainelControle painelControle = new PainelControle();
        Interaction interaction = new Interaction();
        EstoqueController estoqueController = new EstoqueController();

        while (true) {
            int option = interaction.mainMenu();
            estoqueController.mainController(option, equipamento, motorEletrico, painelControle, interaction);

        }

    }
}
