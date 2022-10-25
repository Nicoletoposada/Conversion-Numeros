package conversiondenumeros;

public class Punto2
{
    public void punto2()
    {
        //Llevar numeros de Binario a Octal y Hexadecimal
        
        String binario1 = "101001010001";
	String binario2 = "010101001011";
	String binario3 = "010000101011";
        String binario4 = "010101001011";
        String binario5 = "111000001010";
		
	int a = Integer.parseInt(binario1, 2);
	int b = Integer.parseInt(binario2, 2);
	int c = Integer.parseInt(binario3, 2);
        int d = Integer.parseInt(binario4, 2);
        int e = Integer.parseInt(binario5, 2);
	
	System.out.println(binario1 + " en sistema octal = " + Integer.toOctalString(a) + " y en hexadecial es = " + Integer.toHexString(a));
	System.out.println(binario2 + " en sistema octal = " + Integer.toOctalString(b) + " y en hexadecial es = " + Integer.toHexString(b));
	System.out.println(binario3 + " en sistema octal = " + Integer.toOctalString(c) + " y en hexadecial es = " + Integer.toHexString(c));
        System.out.println(binario4 + " en sistema octal = " + Integer.toOctalString(d) + " y en hexadecial es = " + Integer.toHexString(d));
        System.out.println(binario5 + " en sistema octal = " + Integer.toOctalString(e) + " y en hexadecial es = " + Integer.toHexString(e));
    }
    
}
