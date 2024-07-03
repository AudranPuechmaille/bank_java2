package components;

import java.util.Date;

public class Credit extends Flow 
{
    public Credit(String comment, String identifier, double amount, Integer targetAccountNumber, boolean effect, Date flowDate) {
        super(comment, identifier, amount, targetAccountNumber, effect, flowDate);
    }
}
