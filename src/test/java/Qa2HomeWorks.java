import org.junit.jupiter.api.Test;


public class Qa2HomeWorks {
    private String name = "Bondage, Discipline, Dominance and Submission";

    @Test

//S=K(1+r)^n
//S = sum to return
//K = Credited sum
//n = number of payment`s periods
//r = interest rate (expressed in decimals)

    public void mathTest() {
        double sum = sumToReturn(3000, 3, 0.12);
        System.out.println("Sum to return is: " + sum);
        //Define variables
//        double K = 3000;
//        double n = 3;
//        double r = 0,12;

    }

    private double sumToReturn(double k, double n, double r) {
        double s = k*(Math.pow((1+r), n));
        return s;
    }

    @Test
    public void stringCount() {
        System.out.println("String length is " + name.length() + " chars");
        name.split("\\w+");
        String[] words = name.split("\\s+");

        System.out.println("String contains " + (words.length) + " words");


    }

    @Test
    public void distanceBetweenCoordinates() {

        double lat1 = 53.32055555555556;
        double lat2 = 53.31861111111111;
        double lon1 = -1.7297222222222221;
        double lon2 = -1.6997222222222223;

        System.out.println(distance(lat1, lat2, lon1, lon2) + "Km"); //Control sum: 2.0043678382716137 K.M
    }
    private double distance(double lat1, double lon1, double lat2, double lon2) {
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        //Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double r = 6371; //Radius of earth in kilometers

        return (c * r);

    }

}
