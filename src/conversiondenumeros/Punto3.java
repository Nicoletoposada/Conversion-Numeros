package conversiondenumeros;

public class Punto3
{
    public void punto3()
    {
        //Llevar numeros de Octal a Hexadecimal y Decimal
        
        String octal1 = "773";
	String octal2 = "2045607";
		
	int a = Integer.parseInt(octal1, 8);
	int b = Integer.parseInt(octal2, 8);
	
        System.out.println(octal1 + " en sistema hexadecimal = " + Integer.toHexString(a) + " y en sistema decimal = " + a);
        System.out.println(octal2 + " en sistema hexadecimal = " + Integer.toHexString(b) + " y en sistema decimal = " + b);
    }
    
}
