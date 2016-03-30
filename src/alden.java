import java.util.Scanner;
public class MPC_BMIcalculator {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		double kg=0.45359237, mtr=0.0254,lbs,inches,kilograms,meters,BMI;
		String Interp="";
		
		System.out.print("Enter weight in pounds: ");  
		lbs=in.nextDouble();     kilograms=kg*lbs;
		System.out.print("Enter height in inches: ");  
		inches=in.nextDouble();  meters=mtr*inches;
		
		BMI= (kilograms/(meters*meters));
		System.out.println("Your BMI is: "+BMI);
		if( BMI < 16 ) {
			Interp="seriously underweight";
		}else if( BMI >= 16 && BMI <= 18 ){
			Interp="underweight";
		}else if( BMI > 18 && BMI <= 24 ){
			Interp="normal weight";
		}else if( BMI > 24 && BMI <= 29 ){
			Interp="overweight";
		}else if( BMI > 29 && BMI <= 35 ){
			Interp="seriously overweight";
		}else{
			Interp="gravely overweight";
		}System.out.println("You are "+Interp);
		
	}//main
}//Class