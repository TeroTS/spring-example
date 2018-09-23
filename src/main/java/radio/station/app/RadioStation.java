
package radio.station.app;

import java.util.ArrayList;

public class RadioStation
{
	private String stationCall;
	private Operator operator;
	private ArrayList<Amplifier> amplifiers = new ArrayList<Amplifier>();
	private ArrayList<Antenna> antennas = new ArrayList<Antenna>();
	private ArrayList<Transceiver> transceivers = new ArrayList<Transceiver>();

	public RadioStation(String stationCall)
	{
		super();
		this.stationCall = stationCall; 
	}

	public RadioStation(String stationCall, Operator operator)
	{
		super();
		this.stationCall = stationCall;
		this.operator = operator;
	}

	public String getstationCall()
	{
		return stationCall;
	}

	public void setstationCall(String stationCall)
	{
		this.stationCall = stationCall;
	}

	public Operator getOperator()
	{
		return operator;
	}

	public void setOperator(Operator operator)
	{
		this.operator = operator;
	}

	public ArrayList<Amplifier> getAmplifiers()
	{
		return amplifiers;
	}

	public void setAmplifiers(ArrayList<Amplifier> amplifiers)
	{
		this.amplifiers = amplifiers;
	}

	public ArrayList<Antenna> getAntennas()
	{
		return antennas;
	}

	public void setAntennas(ArrayList<Antenna> antennas)
	{
		this.antennas = antennas;
	}

	public ArrayList<Transceiver> getTrancievers()
	{
		return transceivers;
	}

	public void setTrancievers(ArrayList<Transceiver> trancievers)
	{
		this.transceivers = trancievers;
	}

	@Override
	public String toString()
	{
		return "Station Call ....: " + stationCall;
	}

}