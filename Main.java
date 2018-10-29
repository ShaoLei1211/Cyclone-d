public class Main {
    public static void main(String[] args) {
	// y=longitude; x=latitude
        distance(Math.toRadians(25),Math.toRadians(-15),Math.toRadians(23),Math.toRadians(-20));
        distance(Math.toRadians(23),Math.toRadians(-20),Math.toRadians(21),Math.toRadians(-24));
        distance(Math.toRadians(21),Math.toRadians(-24),Math.toRadians(20),Math.toRadians(-27));
        distance(Math.toRadians(20),Math.toRadians(-27),Math.toRadians(19),Math.toRadians(-35));
        distance(Math.toRadians(19),Math.toRadians(-35),Math.toRadians(21),Math.toRadians(-46));
        distance(Math.toRadians(21),Math.toRadians(-46),Math.toRadians(23),Math.toRadians(-56));
        distance(Math.toRadians(23),Math.toRadians(-56),Math.toRadians(25),Math.toRadians(-65));
        distance(Math.toRadians(25),Math.toRadians(-65),Math.toRadians(28),Math.toRadians(-70));
        distance(Math.toRadians(28),Math.toRadians(-70),Math.toRadians(32),Math.toRadians(-73));
        distance(Math.toRadians(32),Math.toRadians(-73),Math.toRadians(34),Math.toRadians(-74));
        distance(Math.toRadians(34),Math.toRadians(-74),Math.toRadians(36),Math.toRadians(-74));
        distance(Math.toRadians(36),Math.toRadians(-74),Math.toRadians(39),Math.toRadians(-74));

    }
    public static void distance(double x1, double y1, double x2, double y2){
        double a = Math.sin(( x2 - x1 ) / 2) * Math.sin(( x2 - x1 ) / 2) + Math.cos(x1) - Math.cos(x2) * Math.sin(( y2 - y1 ) / 2) * Math.sin(( y2 - y1 ) / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = 6371 * c;
        System.out.println("The distance between two measuring locations is " +d+ " km");

     //How can I add them up?

    }




    }



