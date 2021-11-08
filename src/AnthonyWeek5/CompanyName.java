package AnthonyWeek5;

import java.util.Date;

public class CompanyName {

    String companyName;
    Date date;
    String password;
    Integer balance;

    public CompanyName(String companyName, Date date, Integer balance, String password){
        this.companyName = companyName;
        this.date = date;
        this.balance = balance;
        this.password = password;

    }
}
