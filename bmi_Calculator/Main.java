package bmi_Calculator;
import java.util.Scanner;
//Function to show
	
public class Main {
	
	public static void main(String[] args) {
		//Variables
		double height;
		double weight;
		String name;
		int counter;
		double BMI;
		int i = 1;
		
            try ( // TODO Auto-generated method stub
                    Scanner scanner = new Scanner(System.in)) {
                System.out.println("            _______BODY MASS INPUT CALCULATOR_______");
                System.out.println(" Welcome, Health is Check Up is very essential for your Wellbeing💯");
                System.out.println(" Please enter number of people to calculate their Body Mass Input: ");
                counter = scanner.nextInt();
                
                while(i <= counter) {
                    System.out.print(" Please enter your Name: \n");
                    name = scanner.next();
                    System.out.print(" Please enter your weight in KG: \n");
                    weight= scanner.nextDouble();
                    System.out.print(" Please enter your height in metres: \n");
                    height= scanner.nextDouble();
                    BMI = weight/(height*height);
                    
                    //conditions
                    System.out.print("__________________________________________\n");
                    if (BMI< 18.5) {
                        System.out.println(" "+name + "Your BMI is " + BMI + "Kg/m^2.");
                        System.out.println(" You are Underweight Eat more!");
                        showData(name,weight, height, BMI);
                    }
                    
                    else if (18.5<BMI && BMI< 24.5) {
                        System.out.println(" "+name + " Your BMI is " + BMI + "Kg/m^2.");
                        System.out.println(" You are Normal, keep it up!");
                        showData(name,weight, height, BMI);
                        
                    }
                    
                    else if (25.0 <BMI && BMI< 29.9) {
                        System.out.println(" "+name + " Your BMI is " + BMI + "Kg/m^2.");
                        System.out.print(" You are Overweight, keep it up!");
                        showData(name,weight, height, BMI);
                        
                    }
                    else {
                        System.out.println(" "+name + " Your BMI is " + BMI + "Kg/m^2.");
                        System.out.println(" You are Obese! please do workouts");
                        showData(name,weight, height, BMI);
                        
                    }
                    System.out.print("\n__________________________________________\n");
                    System.out.print("\n__________________________________________\n");
                    
                    
                    i++;
                }
                System.out.print("Done!");
            }
	}

	public static void showData(String name,double weight, double height, double Bmi){
		System.out.println("\n Name: "+name);
		System.out.println(" Weight: "+weight);
		System.out.println(" BMI: "+ Bmi);	}
	
}
