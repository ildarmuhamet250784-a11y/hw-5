//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.
		
		//task1
		int clientOS=1;
		boolean iOS=clientOS==0;
		if (iOS) {
			System.out.println("Установите версию приложения для iOS по ссылке");
		}else System.out.println("Установите версию приложения для Android по ссылке");
		
		//task2
		
		int clientOS2=1;
		int clientDeviceYear=2015;
		boolean modernTelephone=clientDeviceYear<2015;
		boolean iOS2=clientOS2==0;
		if (iOS2) {
			if (modernTelephone)
				System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
		    else System.out.println("Установите версию приложения для iOS по ссылке");
		}
		else if(modernTelephone){
			System.out.println("Установите облегчённую версию приложения для Android по ссылке");
		    }else {
			System.out.println("Установите версию приложения для Android по ссылке");
		}
		
		//task3
		
		int year=2100;
		if (year>1584) {
			if(year%400==0) {
				System.out.println("Год является високосным");
			}else if(year%100==0) {
				System.out.println("Год не является високосным");
			}else if(year%4==0) {
				System.out.println("Год является високосным");
			}
				else System.out.println("Год не является високосным");
			}
		
		
		//task4
		
		int deliveryDistance=105;
		if (deliveryDistance<20) {
			System.out.println("Потребуется дней: сутки");
		} if (deliveryDistance>=20 && deliveryDistance<60) {System.out.println("Потребуется дней: двое суток");
			}else if (deliveryDistance>=60 && deliveryDistance<100) {System.out.println("Потребуется дней: трое суток");
		}else {System.out.println("Свыше 100 км доставки нет");
		}
		
		//task5
		
		int monthNumber=15;
		switch (monthNumber) {
			case 12:
			case 1:
			case 2:
				System.out.println("Время года: зима");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Время года: весна");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Время года: лето");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Время года: осень");
				break;
			default:
				System.out.println("Такого времени года не существует");
		}
		
		
	
	}
}