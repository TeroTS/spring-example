package radio.station.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;


@Component
public class RadioStation
{
	private String stationCall;
	private Operator operator;
	private ArrayList<Amplifier> amplifiers = new ArrayList<>();
	private ArrayList<Antenna> antennas = new ArrayList<>();
	private ArrayList<Transceiver> transceivers = new ArrayList<>();

	public RadioStation(String stationCall)
	{
		this.stationCall = stationCall; 
	}

	public RadioStation(String stationCall, Operator operator)
	{
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

	@Autowired
	public void setOperator(Operator operator)
	{
		this.operator = operator;
	}

	public ArrayList<Amplifier> getAmplifiers()
	{
		return amplifiers;
	}

	@Autowired
	public void setAmplifiers(ArrayList<Amplifier> amplifiers)
	{
		this.amplifiers = amplifiers;
	}

	public ArrayList<Antenna> getAntennas()
	{
		return antennas;
	}

	@Autowired
	public void setAntennas(ArrayList<Antenna> antennas)
	{
		this.antennas = antennas;
	}

	public ArrayList<Transceiver> getTrancievers()
	{
		return transceivers;
	}

    @Autowired
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