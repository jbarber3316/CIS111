import java.util.Scanner;

public class converter
{
    public static void main(String[] args)
    {
    	System.out.print("Convert from? (fl. oz, gal, oz, lb, in, ft, mi) ");
    	Scanner in = new Scanner(System.in);

    	String convertFrom = in.nextLine();

    	System.out.print("Convert to? (ml, l, g, kg, mm, cm, m, km) ");
    	String convertTo = in.nextLine();

    	System.out.print("Value? ");
    	double inputValue = in.nextDouble();

    	if (convertFrom.equals("fl. oz") || convertFrom.equals("gal") || convertFrom.equals("oz") //if the user enters valid units to convert from
    		|| convertFrom.equals("lb")|| convertFrom.equals("in") || convertFrom.equals("ft")
    		|| convertFrom.equals("mi"))
    	{

    		//----------Volume----------//
    	
	    	if (convertFrom.equals("gal") || convertFrom.equals("fl. oz"))
	    	{
	    		if (convertFrom.equals("gal") && !convertFrom.equals("fl. oz"))
	    		{
	    			if (convertTo.equals("ml")) //gallons to milliliters
	    			{
	    				double gallons = inputValue;
	    				double milliliters = Math.round(gallons * 3785.41);
	    				System.out.println(gallons + " gal = " + milliliters + " ml");
	    			}
	    			else if (convertTo.equals("l")) //gallons to liters
	    			{
	    				double gallons = inputValue;
	    				double liters = Math.round(gallons * 3.78541);
	    				System.out.println(gallons + " gal = " + liters + " l");
	    			}
	    			else //gallons to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    		else if (convertFrom.equals("fl.oz"))
	    		{
	    			if (convertTo.equals("ml")) //ounces to milliliters
	    			{
	    				double fluidOunces = inputValue;
	    				double milliliters = Math.round(fluidOunces * 29.5735);
	    				System.out.println(fluidOunces + " fl. oz = " + milliliters + " ml");
	    			}
	    			else if (convertTo.equals("l")) //ounces to liters
	    			{
	    				double fluidOunces = inputValue;
	    				double liters = Math.round(fluidOunces * 0.0295735);
	    				System.out.println(fluidOunces + " fl. oz = " + liters + " l");
	    			}
	    			else //ounces to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    	}

	    	//----------Weight----------//

	    	else if (convertFrom.equals("oz") || convertFrom.equals("lb"))
	    	{
	    		if (convertFrom.equals("oz") && !convertFrom.equals("lb"))
	    		{

	    			double ounces = inputValue;

	    			if (convertTo.equals("g")) //ounces to grams
	    			{
	    				double grams = Math.round(ounces * 28.3495);
	    				System.out.println(ounces + " oz = " + grams + " g");
	    			}
	    			else if (convertTo.equals("kg")) //ounces to kilograms
	    			{
	    				double kilograms = Math.round(ounces * 0.0283495);
	    				System.out.println(ounces + " oz = " + kilograms + " kg");
	    			}
	    			else //ounces to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    		else if (convertFrom.equals("lb"))
	    		{

	    			double pounds = inputValue;

	    			if (convertTo.equals("g")) //pounds to grams
	    			{
	    				double grams = Math.round(pounds * 453.592);
	    				System.out.println(pounds + " lb = " + grams + " g");
	    			}
	    			else if (convertTo.equals("kg")) //pounds to kilograms
	    			{
	    				double kilograms = Math.round(pounds * 0.453592);
	    				System.out.println(pounds + " lb = " + kilograms + " kg");
	    			}
	    			else //pounds to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    	}

	    	//-----------Length----------//

	    	else if (convertFrom.equals("in") || convertFrom.equals("ft") || convertFrom.equals("mi"))
	    	{
	    		if (convertFrom.equals("in") && !convertFrom.equals("ft") && !convertFrom.equals("mi")) //from inches
	    		{

	    			double inches = inputValue;

	    			if (convertTo.equals("mm")) //inches to millimeters
	    			{
	    				double millimeters = Math.round(inches * 25.4);
	    				System.out.println(inches + " in = " + millimeters + " mm");
	    			}
	    			else if (convertTo.equals("cm")) //inches to centimeters
	    			{
	    				double centimeters = Math.round(inches * 2.54);
	    				System.out.println(inches + " in = " + centimeters + " cm");
	    			}
	    			else if (convertTo.equals("m")) //inches to meters
	    			{
	    				double meters = Math.round(inches * 0.0254);
	    				System.out.println(inches + " in = " + meters + " m");
	    			}
	    			else if (convertTo.equals("km")) //inches to kilometers
	    			{
	    				double kilometers = Math.round(inches * 0.0000254);
	    				System.out.println(inches + " in = " + kilometers + " km");
	    			}
	    			else //inches to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    		else if (convertFrom.equals("ft") && !convertFrom.equals("mi")) //from feet
	    		{

	    			double feet = inputValue;

	    			if (convertTo.equals("mm")) //feet to millimeters
	    			{
	    				double millimeters = Math.round(feet * 304.8);
	    				System.out.println(feet + " ft = " + millimeters + " mm");
	    			}
	    			else if (convertTo.equals("cm")) //feet to centimeters
	    			{
	    				double centimeters = Math.round(feet * 30.48);
	    				System.out.println(feet + " ft = " + centimeters + " cm");
	    			}
	    			else if (convertTo.equals("m")) //feet to meters
	    			{
	    				double meters = Math.round(feet * 0.3048);
	    				System.out.println(feet + " ft = " + meters + " m");
	    			}
	    			else if (convertTo.equals("km")) //feet to kilometers
	    			{
	    				double kilometers = Math.round(feet * 0.0003048);
	    				System.out.println(feet + " ft = " + kilometers + " km");
	    			}
	    			else //feet to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
	    		}
	    		else if (convertFrom.equals("mi")) //from miles
	    		{
	    			double miles = inputValue;

	    			if (convertTo.equals("mm")) //miles to millimeters
	    			{
	    				double millimeters = Math.round(miles * 1609344);
	    				System.out.println(miles + " mi = " + millimeters + " mm");
	    			}
	    			else if (convertTo.equals("cm")) //miles to centimeters
	    			{
	    				double centimeters = Math.round(miles * 160934.4);
	    				System.out.println(miles + " mi = " + centimeters + " cm");
	    			}
	    			else if (convertTo.equals("m")) //miles to meters
	    			{
	    				double meters = Math.round(miles * 1609.344);
	    				System.out.println(miles + " mi = " + meters + " m");
	    			}
	    			else if (convertTo.equals("km")) //miles to kilometers
	    			{
	    				double kilometers = Math.round(miles * 1.609344);
	    				System.out.println(miles + " mi = " + kilometers + " km");
	    			}
	    			else //miles to a different unit
	    			{
	    				System.out.println("Incompatible units for this program; convert between different measurement systems");
	    			}
    			}
	    	}
    	}
    	else //the first unit was not what a unit the program asked for
    	{
    		System.out.println("Units to convert from must be: fl. oz, gal, oz, lb, in, ft, mi");
    	}
   }
}