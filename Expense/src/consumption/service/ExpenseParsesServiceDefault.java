package consumption.service;

import consumption.model.Expense;
import consumption.model.ConsumptionType;
import consumption.service.impl.ExpenseParsesService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExpenseParsesServiceDefault implements ExpenseParsesService {

    private static final int CUSTOM_EXPENSE_LENGTH = 5;
    private static final int TRANSFERE_EXPENSE_LENGTH = 6;

    public List<Expense> parseText(ArrayList<String> expenseList) {

        List<Expense> consumptionList = new ArrayList<Expense>();
        String delimitator = ";";

        try {

            for (int i = 0; i < expenseList.size(); i++) {

                String[] tokens = expenseList.get(i).split(delimitator);
                Expense expense;
                int sum = Integer.parseInt(tokens[0]);
                ConsumptionType consumptionType = ConsumptionType.valueOf(tokens[1]);

                String cont = tokens[2];

                if (CUSTOM_EXPENSE_LENGTH == tokens.length) {


                    String description = tokens[3];

                    DateFormat format = new SimpleDateFormat("d MMMM", Locale.ENGLISH);
                    Date date = format.parse(tokens[4]);

                    date.setYear(2016);
                    expense = new Expense(sum, consumptionType, cont, description, date, null);
                    consumptionList.add(expense);

                }
                else if(TRANSFERE_EXPENSE_LENGTH == tokens.length){

                    String contTransfer = tokens[3];
                    String description = tokens[4];

                    DateFormat format = new SimpleDateFormat("d MMMM", Locale.ENGLISH);
                    Date date = format.parse(tokens[5]);

                    expense = new Expense(sum, consumptionType, cont, description, date, contTransfer);
                    consumptionList.add(expense);

                }


            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return consumptionList;
    }


}
