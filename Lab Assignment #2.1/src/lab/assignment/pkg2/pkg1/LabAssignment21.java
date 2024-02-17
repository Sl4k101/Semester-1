package lab.assignment.pkg2.pkg1;

public class LabAssignment21 {

    public static void main(String[] args) {
       Q1();
       Q2();
       Q3();
       Q4();
        Q5();
    }

    public static void Q1() {
        double miles = 1;
        double kilometers = miles * 1.6;
        System.out.println("Q1:\nmiles = " + miles + "\nKilometers = " + kilometers);
    }

    public static void Q2() {
        double triangleSideLength = 3.5;
        double area = (Math.pow(3, 0.5) / 4) * Math.pow(triangleSideLength, 2);
        double volume = area * triangleSideLength;
        System.out.println("Q2:\nArea = " + area + "\nVolume = " + volume);
    }

    public static void Q3() {
        double subtotal = 10;
        double gratuity = 12;
        double gratuityCost = (gratuity / 100) * subtotal;
        System.out.println("Q3:\nthe gratuity is $" + gratuityCost + " and total is $" + (gratuityCost + subtotal));
    }

    public static void Q4() {
        int intInput = 932;
        int intOutput = (intInput % 10) * ((intInput / 10) % 10) * ((intInput / 10) / 10);
        System.out.println("Q4:\n" + intOutput);
    }

    public static void Q5() {
        double velocity = 60;
        double acceleration = 4.5;
        double runwayLength = Math.pow(velocity, 2) / (2 * acceleration);
        System.out.println("Q5:\nEnter takeoff speed: " + velocity + " m/s\nEnter acceleration: " + acceleration + " m/s^2\nMinimum runway length: " + runwayLength + " m");
    }
}
