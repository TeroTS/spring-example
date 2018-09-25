package radio.station.app;


public class Operator
{
	private String firstName;
	private String lastName;
	private String callsign;
	private String association;

	public Operator(String firstName, String lastName, String callsign, String association)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.callsign = callsign;
		this.association = association;
	}

	public Operator(String association)
	{
		this.association = association;
	}

	public String calculateAssociationFee()
	{
		double fee = 0;
		
		if (association != null)
		{
			switch (association)
			{
				case "ARRL":
					fee = 120.00;
				break;

				case "CWOPS":
					fee = 25.00;
				break;
			}
		}
		return String.format("$%.2f", fee);
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getCallsign()
	{
		return callsign;
	}

	public void setCallsign(String callsign)
	{
		this.callsign = callsign;
	}

	public String getAssociation()
	{
		return association;
	}

	public void setAssociation(String association)
	{
		this.callsign = association;
	}
	
	@Override
	public String toString()
	{
		return String.format("Operator ........: %s %s, %s", firstName, lastName, callsign);
	}
	
}