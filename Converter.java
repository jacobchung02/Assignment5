import java.util.Scanner;

public class Converter 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner strScanner = new Scanner(System.in);  // For choosing what unit to convert.
        Scanner numScanner = new Scanner(System.in);  // For choosing how many of chosen unit to convert.

        Double numToConvert = 0.0;
        Double converted = 0.0;

        String errorMsg = "Your input is not currently handled by this app, please input another query, for example, kg to lb.";
        String listMsg = "List of conversions: \nkm to m \t m to km \nkg to lb \t lb to kg \nm to ft \t ft to m" +
                              "\nkm to mi \t mi to km \nL to mL \t mL to L";

        String fromUnit = " ";
        String toUnit = " ";

        System.out.println("Welcome to metric converter!\nPlease input your query." +
                           "\nFor example, km to m." + "\nEnter 'list' for a list of conversions." +
                           "\nEnter 'exit' to exit the program.");
        
        String userInput = strScanner.nextLine();

        // Loop repeatedly asks for input until the user types, "exit".
        while (!(userInput.equals("exit")))
        {
            Boolean isConverted = false;  // Set to true upon successful conversion.

            // Handle input based on choice user selects.
            switch (userInput) 
            {
                case "km to m":  

                    try
                    {
                        // Take number user wishes to convert and print.
                        fromUnit = "km";
                        toUnit = "m";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;  // Allows converted values to be printed since conversion worked.
                        converted = numToConvert * 1000;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        // If anything besides a number is input, tell user to try again.
                        System.out.println(errorMsg);
                    }
                    
                    break;
                
                case "m to km":  

                    try
                    {
                        fromUnit = "m";
                        toUnit = "km";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert / 1000;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;

                case "kg to lb":

                    try
                    {
                        fromUnit = "kg";
                        toUnit = "lb";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert * 2.2;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;
                
                case "lb to kg":

                    try
                    {
                        fromUnit = "lb";
                        toUnit = "kg";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert / 2.2;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;

                case "m to ft":

                    try
                    {
                        fromUnit = "m";
                        toUnit = "ft";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert * 3.28;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;
                
                case "ft to m":

                    try
                    {
                        fromUnit = "ft";
                        toUnit = "m";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert / 3.28;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;

                case "km to mi":
                    
                    try
                    {
                        fromUnit = "km";
                        toUnit = "mi";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert * 0.62;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;

                case "mi to km":
                    
                    try
                    {
                        fromUnit = "mi";
                        toUnit = "km";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert * 1.609;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;
                
                case "L to mL":
                    
                    try
                    {
                        fromUnit = "L";
                        toUnit = "mL";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert * 1000;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;
                
                case "mL to L":
                    
                    try
                    {
                        fromUnit = "mL";
                        toUnit = "L";

                        System.out.println("Input number of " + fromUnit + " to convert to " + toUnit + ": ");

                        numToConvert = Double.parseDouble(numScanner.next());
                        isConverted = true;
                        converted = numToConvert / 1000;
                        break; 
                    } 
                    catch (NumberFormatException except) 
                    {
                        System.out.println(errorMsg);
                    }
                    
                    break;
                    
                // Prints user a formatted list of each conversion option they can choose.
                case "list":
                    System.out.println(listMsg);
                    break;

                // If no case passes, print error message and exit switch.
                default: 
                    System.out.println(errorMsg);
                    break;
            }


            // Print converted values for successful operations.
            if (isConverted)
            {
                System.out.println(String.format("%.3f", numToConvert) + " " + fromUnit + " = " + 
                                   String.format("%.3f", converted) + " " + toUnit);
            }

            // Take next input.
            System.out.println("Enter another query, or 'exit' if you are done: ");
            userInput = strScanner.nextLine();
        }

        System.out.println("Goodbye!\n");

        strScanner.close();
        numScanner.close();
    }

}
