
package radio.station.app;

public class Amplifier
{
	private String manufacturer;
	private String model;

	public Amplifier(String manufacturer, String model)
	{
		super();
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Amplifier(String model)
	{
		super();
		this.model = model;
	}

	public String checkPower(String value)
	{
		String maxPower = value;
		
		if (value == "AL-1500")
		{
			maxPower = "2500";
		}
		else
		{
			maxPower = "1000";
		}

		return String.format("%sW",maxPower);
	}

	public String getManufacturer()
	{
		return manufacturer;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	public String getModel()
	{
		return model;
	}

	public void setCost(String model)
	{
		this.model = model;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s", manufacturer, model);
	}
	
}