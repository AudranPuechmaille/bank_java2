package components;

import java.util.Date;

public class Debit extends Flow 
{
    public Debit(String comment, String identifier, double amount, Integer targetAccountNumber, boolean effect, Date flowDate) 
    {
        super(comment, identifier, amount, targetAccountNumber, effect, flowDate);
    }
}