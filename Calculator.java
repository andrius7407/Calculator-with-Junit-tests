public class Calculator{
	public static String help(){
		String message = "Naudojimo instrukcija:" +
		"\niveskite skaicius skaicius zenklas(+, -, *, /,)." +
		"\nZenkla * iveskite kabutese.\nDalyba is nulio - negalima.";
		return message;
	}
	
	public static double sum(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	
	public static double subtract(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	
	public static double multiply(double firstNumber, double secondNumber){
		return firstNumber * secondNumber;
	}
	
	public static double divide(double firstNumber, double secondNumber){
		double result;
		if(secondNumber == 0){
			throw new IllegalArgumentException("Dalyba is 0 negalima");
		}else result = firstNumber / secondNumber;
		return result;
	}
	
    public static void main(String[] args) {
		if (args[0].equals("--help") || args[0].equals("-h")){
			System.out.println(help());
		}else{	
			if(args.length == 3){
				double pirmas = Double.parseDouble(args[0]);
				double antras = Double.parseDouble(args[1]);
				String zenklas = args[2];
				double rezultatas = 0;
				
				switch(zenklas){
					case "+":
						rezultatas = sum(pirmas, antras);
						break;
					case "-":
						rezultatas = subtract(pirmas, antras);
						break;
					case "*":
						rezultatas = multiply(pirmas, antras);
						break;
					case "/":
						rezultatas = divide(pirmas, antras);
						break;
					default:
						System.out.println("neteisingai ivestas zenklas");
						System.out.println(help());
				}
				System.out.println(pirmas + " " + zenklas + " " + antras + " = " + rezultatas);
			} else {
				System.out.println("neteisingi duomenys");
				System.out.println(help());
			}
		}	
	}
}
