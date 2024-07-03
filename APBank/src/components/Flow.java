package components;

import java.util.Date;

public abstract class Flow 
{
	private String comment;
	private Date flowDate;
	private String identifier;
	private double amount;
	private boolean effect;
	private int targetAccountNumber;
	
	public Flow(String comment, String identifier, double amount, Integer targetAccountNumber, boolean effect, Date flowDate)
	{
		if (comment == null || identifier == null || flowDate == null) 
		{
            throw new IllegalArgumentException("Comment, identifier, and flowDate cannot be null");
        }
		
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        
		this.comment = comment;
		this.identifier = identifier;
		this.amount = amount;
		this.targetAccountNumber = targetAccountNumber;
		this.effect = effect;
		this.flowDate = flowDate;
	}
	
	public String getComment() 
	{
		return comment;
	}
	
	public void setComment(String comment) 
	{
		if (comment == null) 
		{
            throw new IllegalArgumentException("Comment cannot be null");
        }
		
		this.comment = comment;
	}
	
	public Date getFlowDate() 
	{
		return flowDate;
	}
	
	public void setFlowDate(Date flowDate) 
	{
		if (flowDate == null) 
		{
            throw new IllegalArgumentException("FlowDate cannot be null");
        }
		
		this.flowDate = flowDate;
	}
	
	public String getIdentifier() 
	{
		return identifier;
	}
	
	public void setIdentifier(String identifier) 
	{
		if (identifier == null) 
		{
            throw new IllegalArgumentException("Identifier cannot be null");
        }
		
		this.identifier = identifier;
	}
	
	public double getAmount() 
	{
		return amount;
	}
	
	public void setAmount(int amount) 
	{
		this.amount = amount;
	}
	
	public boolean isEffect() 
	{
		return effect;
	}
	
	public void setEffect(boolean effect) 
	{
		this.effect = effect;
	}
	
	public int getTargetAccountNumber() 
	{
		return targetAccountNumber;
	}
	
	public void setTargetAccountNumber(int targetAccountNumber) 
	{
		this.targetAccountNumber = targetAccountNumber;
	}
}
