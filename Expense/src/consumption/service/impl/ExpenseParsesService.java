package consumption.service.impl;


import consumption.model.Expense;

import java.util.ArrayList;
import java.util.List;

public interface ExpenseParsesService {
    public List<Expense> parseText(ArrayList<String> expenseString);
}
