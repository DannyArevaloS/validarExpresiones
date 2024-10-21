package ExprecionesRegulares;
import java.util.regex.Pattern;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		
		System.out.println(validarEntero("123"));
        System.out.println(validarEntero("-123"));
        System.out.println(validarDNI("12345678A"));
        System.out.println(validarMatricula("1234ABC"));
        System.out.println(validarBinario("101010"));
        System.out.println(validarOctal("1234567"));
        System.out.println(validarHexadecimal("0x1A3F"));
        System.out.println(validarNumeroReal("-123,45"));
        System.out.println(validarNumeroReal("123"));
	}
	
	public static boolean validarEntero(String input) {
        return Pattern.matches("^-?\\d+$", input);
    }
	
	public static boolean validarDNI(String input) {
        return Pattern.matches("^\\d{8}[A-Za-z]$", input);
    }
	
	public static boolean validarMatricula(String input) {
        return Pattern.matches("^\\d{4}[A-Z]{3}$", input);
    }
	
	 public static boolean validarBinario(String input) {
	    return Pattern.matches("^[01]+$", input);
	}
	
	public static boolean validarOctal(String input) {
	    return Pattern.matches("^[0-7]+$", input);
	}
	
	public static boolean validarHexadecimal(String input) {
        return Pattern.matches("^(0[xX])?[0-9a-fA-F]+$", input);
    }
	
	public static boolean validarNumeroReal(String input) {
        return Pattern.matches("^-?\\d+(,\\d+)?$", input);
    }

}
