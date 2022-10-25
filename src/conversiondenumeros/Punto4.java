package conversiondenumeros;

import java.util.Scanner;

public class Punto4
{
    public void punto4()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int n = sc.nextInt();
        System.out.println("A que sistema lo desea convertir");
        System.out.println("Binario = b, Octal = o, Hexadecimal = h");
        String sistema = sc.next();
        
        if("b".equals(sistema))
        {
            System.out.println(Integer.toBinaryString(n));
        }
        if("o".equals(sistema))
        {
            System.out.println(Integer.toOctalString(n));
        }
        if("h".equals(sistema))
        {
            System.out.println(Integer.toHexString(n));
        }
    }
}
