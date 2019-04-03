package at.fhj.iit;

public class Main {

    public static void main(String[] args) {

        // TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
        Calculator calc = new CalculatorImpl();

        calc.addValue(20);    // currently highest number
        calc.addValue(4);    // currently lowest number
        calc.addValue(16);

        // add other integers

        // output lowest number
        System.out.println("lowest number: " + calc.getMinimum());

        // output highest number
        System.out.println("highest number: " + calc.getMaximum());

		// output sum of all numbers
		System.out.println("sum of all numbers: " + calc.sum());
	}
}
