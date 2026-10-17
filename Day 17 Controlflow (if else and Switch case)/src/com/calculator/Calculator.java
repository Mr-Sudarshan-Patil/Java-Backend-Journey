package com.calculator;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double firstNumber = Double.parseDouble(args[0]);
				//String secondNumber = args[1];
				//double thirdNumber = Double.parseDouble(args[2]);

				if (args.length < 3) {
					System.err.println("Please pass all the three parameter");
				}
				else {
					double firstNumber = Double.parseDouble(args[0]);
					String secondNumber = args[1];
					double thirdNumber = Double.parseDouble(args[2]);

					switch (secondNumber) 
					{
					case "+":
						System.out.println(firstNumber + thirdNumber);
						break;

					case "-":
						System.out.println(firstNumber - thirdNumber);
						break;

					case "x":
						System.out.println((firstNumber * thirdNumber));
						break;
					case "/":
						if(thirdNumber==0) {
							System.err.print("Cannot divide by zero");
						}else {
							System.out.println(firstNumber / thirdNumber);
						}
						
						break;
					}

				}
	}

}
