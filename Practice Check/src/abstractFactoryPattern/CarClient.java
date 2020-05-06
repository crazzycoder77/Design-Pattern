package abstractFactoryPattern;

import java.util.Scanner;

public class CarClient {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter model of the car(LUXURY / MINI / MICRO) : ");
			String model = sc.nextLine();
			CarFactory carFactory= CarProducer.getCarFactoty(model);
			System.out.print("Enter location of the car(USA / INDIA / DEFAULT) : ");
			String location = sc.nextLine();
			Car car= carFactory.getCar(location);
			System.out.println(car);
			System.out.print("Enter 1 to make more cars : ");
			choice = Integer.parseInt(sc.nextLine()); 
		}while(choice==1);
		sc.close();
	} 
}
