package consumption.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Expense {

    private int sum;
    private ConsumptionType consumptionType;
    private String cont;
    private String description;
    private Date consumptionDate;

    private String transferCont;

    public Expense(int sum, ConsumptionType consumptionType, String cont, String description, Date consumptionDate, String transferCont) {
        this.sum = sum;
        this.consumptionType = consumptionType;
        this.cont = cont;
        this.description = description;
        this.consumptionDate = consumptionDate;
        this.transferCont = transferCont;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public ConsumptionType getConsumptionType() {
        return consumptionType;
    }

    public void setConsumptionType(ConsumptionType consumptionType) {
        this.consumptionType = consumptionType;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getConsumptionDate() {
        return consumptionDate;
    }

    public void setConsumptionDate(Date consumptionDate) {
        this.consumptionDate = consumptionDate;
    }

    public String getTransferCont() {
        return transferCont;
    }

    public void setTransferCont(String transferCont) {
        this.transferCont = transferCont;
    }

    public void printExpense(){

        DateFormat format = new SimpleDateFormat("d.MMMM.YYYY", Locale.ENGLISH);
        //consumptionDate.parse(format);
        System.out.print("sum:"+sum+"; type:"+consumptionType.toString()+"; cont:"+cont+"; description:"+description+"; date:"+consumptionDate.getDay()+"."+consumptionDate.getMonth()+"."+consumptionDate.getYear() );
        if(null != transferCont){
            System.out.print("; transfer cont:"+ transferCont);
        }
        System.out.println();
    }
}
