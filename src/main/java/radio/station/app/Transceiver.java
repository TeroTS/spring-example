
package radio.station.app;

public class Transceiver {

	private String manufacturer;
	private String model;

	public Transceiver(String manufacturer, String model)
	{
		this.manufacturer = manufacturer;
		this.model = model;
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

	@Override
	public String toString()
	{
		return String.format("%s %s", manufacturer, model);
	}

}