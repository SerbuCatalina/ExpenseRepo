package consumption;

import consumption.model.Expense;
import consumption.service.ExpenseParsesServiceDefault;

import java.util.ArrayList;
import java.util.List;

public class ConsumptionApp {
    public static void main(String[] args) {

        ArrayList<String> expensesList = new ArrayList<String>();

        String expense1 = "130;CH;ing;cumparaturiAuchan;9 sept;";
        String expense2 = "30;CH;ingcat;cumparaturiProfi;12 sept;";
        String expense3 = "70;CH;cash;piata;13 sept;";
        String expense4 = "100;CH;ing;cumparaturiAuchan;13 sept ;";
        String expense5 = "1000;TRANSFER;ing;cont_eco;lunaSeptembrie;14 sept;";
        String expense6 = "100;INTRAT;ing;decontareConcurs;4 nov;";

        expensesList.add(expense1);
        expensesList.add(expense2);
        expensesList.add(expense3);
        expensesList.add(expense4);
        expensesList.add(expense5);
        expensesList.add(expense6);


        ExpenseParsesServiceDefault expenseService = new ExpenseParsesServiceDefault();

        List<Expense> exepnsesObjects = expenseService.parseText(expensesList);

        for(Expense e: exepnsesObjects){
            e.printExpense();
        }


    }
}
