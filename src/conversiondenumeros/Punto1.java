package conversiondenumeros;

public class Punto1
{
    public void punto1()
    {
        //Llevar numeros de Deciaml a Binario, Octal y Hexadecimal
        int numero;
        
        numero = 50430;
        System.out.println(numero + " en sistema binario = " + Integer.toBinaryString(numero) + ", en sistema octal = " + Integer.toOctalString(numero) + " y en sistema hexadecimal = " + Integer.toHexString(numero));
        
        numero = 934;
        System.out.println(numero + " en sistema binario = " + Integer.toBinaryString(numero) + ", en sistema octal = " + Integer.toOctalString(numero) + " y en sistema hexadecimal = " + Integer.toHexString(numero));
        
        numero = 340;
        System.out.println(numero + " en sistema binario = " + Integer.toBinaryString(numero) + ", en sistema octal = " + Integer.toOctalString(numero) + " y en sistema hexadecimal = " + Integer.toHexString(numero));
    }
    
}