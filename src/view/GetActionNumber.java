package view;

import utils.GetDataScanner;
import utils.ValidateChoice;

public class GetActionNumber {
    public static int getActionNumber() {
        String actionChoice;
        String CHOOSE_TASK_VIEW = """
                Выбор действия:
                1 - espresso
                2 - latte
                3 - cappuccino
                0 - выход
                """;
        System.out.println("\n" + CHOOSE_TASK_VIEW);
        do {
            actionChoice = GetDataScanner.getDataScanner("Введите номер напитка" + "\n");
            if (!ValidateChoice.isActionChoice(actionChoice)) System.out.println("Ошибка ввода! Повторите попытку.");
            else break;
        }
        while (true);

        return Integer.parseInt(actionChoice);
    }
}
