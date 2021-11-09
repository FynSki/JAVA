/***
 *
 * @author Adam Janiszewski
 */

/*
 *
 * 	1. check testing
 * 		- create test class
 * 	2. logs
 * 	3. Code style
 * 	4. Plugins
 * 	5. Comments
 *
 */

import java.util.Scanner;
import java.util.logging.*;

public class MainC {
	static String a;
	static String b;
	static String c;

	static double nDelta;

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		DeltaCalculator nDel = new DeltaCalculator();
		//System.out.println("Print :) ");

		// naprzykład obiekt parameters i tutaj moze zadbać o walidację itp.
		// Mozna pokusić się o jakąś klasę typu ParamProvider
		// 	- ta klasa zajęłaby się wszystkim zwiazanym z walidacją
		// 	- można sprawdzić interfejs - np. standard input / file
		//	- clasa Main powinna być trzylinijkowa ;)
		// 	- hint - tworzenie zależności pomiędzy klasami - instancja paramProvidera powinna być w konstruktorze danej klasy
		// 		-- główna klasa która zajmowałaby się wyliczeniem potrzebowała by DeltaCalkulator i ParamProvidera powiina być dostarczona
		//			przez konstruktor głównej klasu
		// 	- hint2 - dane wyjściowe SqrRootResolv powinna zwracać wynik - 1 x , 2 x albo brak wyników
		// 		-- Wynik też w formie obiektu
		getInput();


		// zaprojektować klasę do DataTransferObject, która bedzie zawierała pola abc
		// Metoda która dostarcza ten obiekt
		// unikać "stanu" w klasach (serwisy bezstanowe - bez void)
		// jeśli potrzebne są dane, to każdy watek powinnien mieć kopie danych

		double aD = nDel.convertToDouble(a);
		System.out.println("provided double was: " + a);
		System.out.println("new double is: " + aD);
		double bD = nDel.convertToDouble(b);
		System.out.println("provided double was: " + b);
		System.out.println("new double is: " + bD);
		double cD = nDel.convertToDouble(c);
		System.out.println("provided double was: " + c);
		System.out.println("new double is: " + cD);

		nDelta = nDel.deltaCal(aD, bD, cD);

		if (nDelta == 0) {
			nDel.deltaEqual(aD, bD, nDelta);

		}
		else if (nDelta > 0) {
			nDel.deltaMore1(aD, bD, nDelta);
			nDel.deltaMore2(aD, bD, nDelta);
		}
		else {
			System.out.println(nDel.deltaLess());
		}

	}

	/***
	 * Method
	 */
	static void getInput() {
		String tmp = "";
		System.out.println("Please provide a value: ");
		a = input.nextLine();


		System.out.println("Please provide b value: ");
		b = input.nextLine();


		System.out.println("Please provide c value: ");
		c = input.nextLine();


		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println("c is: " + c);


	}


}
