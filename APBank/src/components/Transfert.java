package components;

import java.util.Date;

public class Transfert extends Flow 
{
    private Integer issuingAccountNumber;

    public Transfert(String comment, String identifier, double amount, int targetAccountNumber, boolean effect, Date flowDate, Integer issuingAccountNumber) 
    {
        super(comment, identifier, amount, targetAccountNumber, effect, flowDate);
        
        if (issuingAccountNumber == null) 
        {
            throw new IllegalArgumentException("Issuing account number cannot be null");
        }
        
        this.issuingAccountNumber = issuingAccountNumber;
    }

    public Integer getIssuingAccountNumber() 
    {
        return issuingAccountNumber;
    }

    public void setIssuingAccountNumber(Integer issuingAccountNumber) 
    {
        if (issuingAccountNumber == null) 
        {
            throw new IllegalArgumentException("Issuing account number cannot be null");
        }
        
        this.issuingAccountNumber = issuingAccountNumber;
    }
}
