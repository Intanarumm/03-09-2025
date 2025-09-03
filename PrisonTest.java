public class PrisonTest {
    public static void main(String[] args) {
        Prisoner twitch = new Prisoner();
        twitch.name = "Twitch";
        twitch.heightMeters = 1.73;
        twitch.sentenceYears = 3;

        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.heightMeters = 2.08;
        bubba.sentenceYears = 4;

        twitch.think();
        bubba.think();

        System.out.println("Ref twitch = " + twitch);
        System.out.println("Ref bubba = " + bubba);

        System.out.println("bubba == twitch ? " + (bubba == twitch));

        twitch.name = "Bubba";
        twitch.heightMeters = 2.08;
        twitch.sentenceYears = 4;

        System.out.println("Setelah properti sama: ");
        System.out.println("bubba == twitch ? " + (bubba == twitch));

        boolean sameFields =
            bubba.name.equals(twitch.name) &&
            bubba.heightMeters == twitch.heightMeters &&
            bubba.sentenceYears == twitch.sentenceYears;
        System.out.println("Apakah Isinya Sama? " + sameFields);

        Camera remote1 = new Camera();
        Camera remote2 = new Camera();
        remote1.play();
        remote2.play();
        
        Camera camA = new Camera();
        Camera camB = camA;
        camA.play();
        camB.stop();

        Camera cam = new Camera();
        cam.menu();

        Prisoner p = new Prisoner();
        p.name = "Sample Prisoner";
        p.heightMeters = 1.80;
        p.sentenceYears =2;
        p.think();


    }
    
}
