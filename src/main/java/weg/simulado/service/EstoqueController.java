package weg.simulado.service;

import java.util.ArrayList;
import java.util.List;

import weg.simulado.model.Equipamento;
import weg.simulado.model.MotorEletrico;
import weg.simulado.model.PainelControle;
import weg.simulado.view.Interaction;

public class EstoqueController {

    private final List<Equipamento> equipamentos;

    public EstoqueController() {
        this.equipamentos = new ArrayList<>();
    }

    public void mainController(int option, Equipamento equipamento, MotorEletrico motorEletrico, 
                              PainelControle painelControle, Interaction interaction) {
        switch (option) {
            case 1 -> {
                int optionRegister = interaction.chooseTypeRegister();
                switch (optionRegister) {
                    case 1 -> {
                        String code = interaction.registerCode();
                        String name = interaction.registerName();
                        int amount = interaction.registerAmount();
                        double price = interaction.registerPrice();
                        double power = interaction.registerPower();
                        motorEletrico = new MotorEletrico(code, name, amount, price, power);
                        equipamentos.add(motorEletrico);
                    }
                    case 2 -> {
                        String code = interaction.registerCode();
                        String name = interaction.registerName();
                        int amount = interaction.registerAmount();
                        double price = interaction.registerPrice();
                        String voltage = interaction.registerVoltage();
                        painelControle = new PainelControle(code, name, amount, price, voltage);
                        equipamentos.add(painelControle);
                    }
                }
            }
            case 2 -> {
                if (equipamentos.isEmpty()) {
                    interaction.emptyStock();
                } else {
                    int cont = 0;
                    for (Equipamento e : equipamentos) {
                        cont++;
                        interaction.ListEquipment(e, cont);
                        System.out.println("--------------------------");
                    }
                }
            }
            case 3 -> {
                int optionList = interaction.chooseTypeList();
                switch (optionList) {
                    case 1 -> {
                        int cont = 1;
                        for (Equipamento e : equipamentos) {
                            if (e instanceof MotorEletrico) {
                                interaction.ListEquipment(e, cont++);
                            }
                        }
                    }
                    case 2 -> {
                        int cont = 1;
                        for (Equipamento e : equipamentos) {
                            if (e instanceof PainelControle) {
                                interaction.ListEquipment(e, cont++);
                            }
                        }
                    }
                }
            }
            case 4 -> {
                String code = interaction.searchByCode();
                for (Equipamento e : equipamentos) {
                    if (code.equalsIgnoreCase(e.getCodigo())) {
                        interaction.ListEquipment(e);
                    }
                }
            }
            case 5 -> {
                String code = interaction.removeByCode();
                equipamentos.removeIf(e -> code.equalsIgnoreCase(e.getCodigo()));
            }
            case 6 -> {
                int optionMovement = interaction.chooseMovement();
                switch (optionMovement) {
                    case 1 -> {
                        String code = interaction.insertCode();
                        int amount = interaction.amountInsert();
                        for (Equipamento p : equipamentos) {
                            if (code.equalsIgnoreCase(p.getCodigo())) {
                                int currentAmount = p.getQuantidade();
                                int amountModify = amount + currentAmount;
                                p.setQuantidade(amountModify);
                            }
                        }
                    }
                    case 2 -> {
                        String code = interaction.insertCode();
                        int amountRemove = interaction.amountDelete();
                        for (Equipamento p : equipamentos) {
                            if (code.equalsIgnoreCase(p.getCodigo())) {
                                int currentAmount = p.getQuantidade();
                                int amountModify = currentAmount - amountRemove;
                                if (amountModify < 0) {
                                    interaction.invalidAction();
                                } else {
                                    p.setQuantidade(amountModify);
                                }
                            }
                        }
                    }
                }
            }
            case 7 -> {
                int optionReport = interaction.chooseReport();
                if (optionReport == 1) {
                    int cont = 0;
                    int totalAmount = 0;
                    for (Equipamento e : equipamentos) {
                        cont++;
                        totalAmount += e.getQuantidade();
                    }
                    interaction.informAmountEquipment(cont, totalAmount);
                } else if (optionReport == 2) {
                    double maiorPreco = 0;
                    for (Equipamento e : equipamentos) {
                        if (e.getPreco() > maiorPreco) {
                            maiorPreco = e.getPreco();
                        }
                    }
                    interaction.informMostValueEquipment(maiorPreco);
                } else if (optionReport == 3) {
                    int maiorQuantidade = 0;
                    for (Equipamento e : equipamentos) {
                        if (e.getQuantidade() > maiorQuantidade) {
                            maiorQuantidade = e.getQuantidade();
                        }
                    }
                    interaction.informMostAmountEquipment(maiorQuantidade);
                } else if (optionReport == 4) {
                    interaction.informLowAmount();
                    int cont = 0;
                    for (Equipamento e : equipamentos) {
                        if (e.getQuantidade() < 5) {
                            cont++;
                            interaction.ListEquipment(e, cont);
                        }
                    }
                    if (cont == 0) {
                        interaction.stockSafe();
                    }
                }
            }
            case 8 -> {
                String advancedSearchByName = interaction.nameToSearch();
                int cont = 0;
                for (Equipamento e : equipamentos) {
                    if (e.getNome().toLowerCase().contains(advancedSearchByName.toLowerCase())) {
                        cont++;
                        interaction.listNameEquipment(e, cont);
                    }
                }
                if (cont == 0) {
                    interaction.equipmentNotFound();
                }
            }
            case 9 -> {
                double advancedSearchByPrice = interaction.priceToSearch();
                int cont = 0;
                for (Equipamento e : equipamentos) {
                    if (e.getPreco() > advancedSearchByPrice) {
                        cont++;
                        interaction.listNameEquipment(e, cont);
                    }
                }
                if (cont == 0) {
                    interaction.equipmentNotFound();
                }
            }
            case 0 -> {
                System.exit(1000);
            }
            default -> {
            }
        }
    }
}