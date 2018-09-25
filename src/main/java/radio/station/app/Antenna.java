package radio.station.app;


public class Antenna
{
	private String manufacturer;
	private String model;
	private String type;

	public Antenna(String manufacturer, String model, String type)
	{
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
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

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s %s", manufacturer, model, type);
	}

}