public class Main {
    public static void main(String[] args) {
	// y=longitude; x=latitude
        double d1=distance(Math.toRadians(25),Math.toRadians(-15),Math.toRadians(23),Math.toRadians(-20));
        double d2=distance(Math.toRadians(23),Math.toRadians(-20),Math.toRadians(21),Math.toRadians(-24));
        double d3=distance(Math.toRadians(21),Math.toRadians(-24),Math.toRadians(20),Math.toRadians(-27));
        double d4=distance(Math.toRadians(20),Math.toRadians(-27),Math.toRadians(19),Math.toRadians(-35));
        double d5=distance(Math.toRadians(19),Math.toRadians(-35),Math.toRadians(21),Math.toRadians(-46));
        double d6=distance(Math.toRadians(21),Math.toRadians(-46),Math.toRadians(23),Math.toRadians(-56));
        double d7=distance(Math.toRadians(23),Math.toRadians(-56),Math.toRadians(25),Math.toRadians(-65));
        double d8=distance(Math.toRadians(25),Math.toRadians(-65),Math.toRadians(28),Math.toRadians(-70));
        double d9=distance(Math.toRadians(28),Math.toRadians(-70),Math.toRadians(32),Math.toRadians(-73));
        double d10=distance(Math.toRadians(32),Math.toRadians(-73),Math.toRadians(34),Math.toRadians(-74));
        double d11=distance(Math.toRadians(34),Math.toRadians(-74),Math.toRadians(36),Math.toRadians(-74));
        double d12=distance(Math.toRadians(36),Math.toRadians(-74),Math.toRadians(39),Math.toRadians(-74));

        double totaldistance = d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12;
        System.out.printf("\nTotal distance is %.2f km\n",totaldistance);

    }
    public static double distance(double x1, double y1, double x2, double y2){
        double a = Math.sin(( x2 - x1 ) / 2) * Math.sin(( x2 - x1 ) / 2) + Math.cos(x1) * Math.cos(x2) * Math.sin(( y2 - y1 ) / 2) * Math.sin(( y2 - y1 ) / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = 6371 * c;
        System.out.println("The distance between two measuring locations is " +d+ " km");
        return d;
    }
    }
