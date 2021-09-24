/**
 * @author Caleb - cawasle
CIS175 - Fall 2021
Sep 21, 2021
 */
package model;


public class FarenheitConverter {
	
	private int farenheit;
	private int temp;
	
	
	public FarenheitConverter() 
	{
		super();
	}
		
	public FarenheitConverter(int temp) 
	{
		super();
		this.temp = temp;
		farenheitConverter(temp); 
	}
	
	public int getTemp()
	{
		return temp;
	}
	
	public void setTemp(int temp)
	{
		this.temp = temp;
		farenheitConverter(temp);
	}

	/**
	 * @return the farenheit
	 */
	public int getFarenheit() 
	{
		return farenheit;
	}
	
	/**
	 * @param farenheit the farenheit to set
	 */
	public void setFarenheit(int farenheit) 
	{
		this.farenheit = farenheit;
	}
	
	public void farenheitConverter(int temp)
	{
		setFarenheit((int) ((temp * 1.8) + 32));
	}

	@Override
	public String toString() 
	{
		return "TemperatureConverter [farenheit=" + farenheit + ", temp=" + temp + "]";
	}
	

	
	
	
	
	
	

}
