import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import radio.station.app.RadioStation;


public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);

        RadioStation radioStation = appContext.getBean(RadioStation.class);

        // Print out station configuration and fees
        System.out.println();
        System.out.println("Station Info");
        System.out.println("------------------------------------------------------------------");
        System.out.println(radioStation);
        System.out.println(radioStation.getOperator());
        System.out.println("Association Fees : " + radioStation.getOperator().calculateAssociationFee());
        System.out.println("");
        // print out station equipment list
        System.out.println("Equipment List");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Transceivers ....: " + radioStation.getTrancievers());
        System.out.println("Amplifiers ......: " + radioStation.getAmplifiers());
        System.out.println("Antennas ........: " + radioStation.getAntennas());
        System.out.println();

    }

}