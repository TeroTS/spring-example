import org.springframework.context.annotation.*;
import radio.station.app.*;
import java.util.ArrayList;


@Configuration
public class Config {

    @Bean
    public Operator operator() {
        return new Operator("Greg","Beam","KI7MT","ARRL");
    }

    @Bean
    public ArrayList<Amplifier> amplifiers() {
        ArrayList<Amplifier> amplifiers = new ArrayList<>();
        amplifiers.add(new Amplifier("Ameritron", "AL-1500"));
        amplifiers.add(new Amplifier("Collins","30L-1"));
        return amplifiers;
    }

    @Bean
    public ArrayList<Transceiver> transceivers() {
        ArrayList<Transceiver> transceivers = new ArrayList<>();
        transceivers.add(new Transceiver("Yaesu","FT-2000D"));
        transceivers.add(new Transceiver("Icom", "IC-7800"));
        return transceivers;
    }

    @Bean
    public ArrayList<Antenna> antennas() {
        ArrayList<Antenna> antennas = new ArrayList<>();
        antennas.add(new Antenna("Force-12","MX-5-20","Yagi"));
        antennas.add(new Antenna("VorTex","5BTV","Vertical"));
        return antennas;
    }

    @Bean
    public RadioStation radioStation() {
        return new RadioStation("KI7MT");
    }

}
