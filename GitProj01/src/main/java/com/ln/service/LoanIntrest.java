package com.ln.service;

public class LoanIntrest
{
  
    public double calclntrestAmount(Double principleAmount, Double intrestRate ,Double time)
    {
    	if(principleAmount<=0 ||intrestRate<=0|| time <=0 )
    	{
    		throw new IllegalArgumentException("invalid inputs");
    	}
    		try{
    			Thread.sleep(3000);
    		}
    		catch(Exception e) 
    		{
				e.printStackTrace();
			}
    		//calculate the Simple Intrest amount
    		
    	
    	return principleAmount * (Math.pow(1.0+intrestRate/100.0,time));
    }
    public boolean isPallendrome(String str)
    {
    	if(str==null||str.length()==0||str.equalsIgnoreCase(""))
    	{
    		throw new IllegalArgumentException("invalid inputs");
    	}
    	String reverseStr=new StringBuilder(str).reverse().toString();
    	if(str.equalsIgnoreCase(reverseStr))
    	{
    		return true;
    	}
    	else {
			return false;
		}
    }
}
