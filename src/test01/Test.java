package test01;

import test01.mijloacelocomotoare.AvionCuMotor;
import test01.mijloacelocomotoare.Masina;
import test01.mijloacelocomotoare.Submarin;
import test01.mijloacelocomotoare.Vehicul;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Test {
	static int valoare4;
	static int valoare5 = 78;
	static boolean isAirborne;
	static double double1;

	static String stringul1;
	static Componenta componenta;

	public static void main(String[] args) {
//		System.out.println(args[0]);
		Test tt = new Test();
		// tt.testBasicTypes();
		// tt.testObiecte();
		// tt.testConditionalStatements();
		// tt.testLoops();
//		tt.scanString();
		// tt.calculeaza(33);
		tt.playWithFiles();
	}

	public void testLoops() {

		for (int i = 5, j = 12; i < 10 || j < 20; i++, j++) {
			System.out.println("Suntem iteratia " + i + " si avem j=" + j);
			if (i == 8) {
				System.out.println("am ajuns la 8");
				continue;
			}

			if (i == 11)
				break;
			System.out.println("si chiar am trecut");

		}

		for (int i = 100; i > 94; i--) {
			if (i == 99) {
				break;
			}

			for (int j = 15; j < 25; j++) {
				System.out.println("avem i=" + i + " si j=" + j);
			}
		}

		Random rand = new Random();

		isAirborne = true;

		while (isAirborne) {
			if (rand.nextInt(10) < 2) {
				isAirborne = false;
			}
		}

		do {

		} while (isAirborne);
	}

	public void scanString() {
		// citesc un rand de text de la keyboard
		// sa identific cate vocale sunt acolo, cate litere in total, cate cuvinte
		// si sa afisez aceste lucruri

		Scanner sc = new Scanner(System.in);
		String textul = sc.nextLine();
		int noLitere = 0;
		int noVocale = 0;
		int noCuvinte = 0;
		for (int i = 0; i < textul.length(); i++) {
			char caracter = textul.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 132) {
				noVocale++;
			}
			if (caracter == 32) {
				noCuvinte++;
			}
		}
		noCuvinte++;
		System.out
				.println("text de lungime " + textul.length() + " are vocale " + noVocale + " si cuvinte " + noCuvinte);

		String test = "74637";
		int a = Integer.parseInt(test);
		double d = Double.parseDouble(test);
		String da = String.valueOf(a);
		da.toCharArray();
		da = "" + a;

	}

	public double getMean(int... input) {
		double result = 0f;

		if (input.length == 0) {
			return 0;
		}
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}
		result = result / input.length;

		return result;
	}

	public void playWithFiles() {
		int[] results = { 7, 10, 9, 14, 10 };

		// scriere in fisier
		PrintWriter f0;
		try {
			f0 = new PrintWriter(new FileWriter("output.txt"));
			
			for (int i = 0; i < results.length; i++) {
				f0.println(results[i]);
			}
			f0.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// citire din fisier
		try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	System.out.println(line);
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("nu am gasit fisierul");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("nu am putut citi din fisier");
		}
		finally {
			System.out.println("nu a mers cu fisiere, hai sa facem altceva");
		}
	}

	public void calculeaza(int... input) {
		int[] arrayul1 = new int[] { 22, 3, 4, 54543, 231 };
		int[] arrayul2 = { 23, 32, 32, 4324 };

		int[] arrayul3 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] arrayul = new int[10];
		for (int i = 0; i < 10; i++) {
			arrayul[i] = i;
		}

		for (int i : arrayul) {
			System.out.print(i + " ");
		}

		Vehicul[] masinileMele = new Vehicul[3];

		for (int i = 0; i < 10; i++) {
			arrayul[i] = 0;

			System.out.println(arrayul[i]);
		}

		masinileMele[0] = new Masina(8);
		masinileMele[1] = new Masina(2);
		masinileMele[2] = new Masina(3);

		int[][] matrice = new int[10][10];

		if (input.length == 1) {
			int a = input[0];
		}

	}

	public void testConditionalStatements() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Cum te cheama?");
		String name = keyboard.next();
		System.out.println("Salut " + name + "\nCati ani ai?");
		int varsta = keyboard.nextInt();
		System.out.println("ce inaltime ai?");
		int inaltime = keyboard.nextInt();

		// testam if
		if (varsta > 18) {
			System.out.println("Esti major");
		}

		if (varsta > 18 && inaltime > 180) {
			System.out.println("Esti si major si mare. Bravo. ur mother must be proud");
		}

		if (varsta > 18 || inaltime > 180) {
			System.out.println("Esti ori major ori inalt");
		}

		if ((varsta > 18 && inaltime > 180) || name.equals("Cristi")) {
			System.out.println("Esti chiar Cristi");
		}

		if (varsta == 18) {
			System.out.println("Majorat placut");
		} else if (varsta == 65) {
			System.out.println("Pensie placuta");
		} else {
			System.out.println("traiesti");
		}

		// testam ternary op

		System.out.println("as zice ca " + ((varsta == 33) ? "esti Iisus.. poate"
				: (varsta == 45) ? "vezi ca imbatranesti" : "mai ai ceva sanse"));

		if (varsta == 33) {
			System.out.println("as zice ca esti Iisus.. poate");
		} else {
			System.out.println("as zice ca Sigur nu esti Iisus");
		}

<<<<<<< HEAD
		System.out.println("dada");
=======
		System.out.println("dada da");
>>>>>>> caludiu
		
		// testam switch
		switch (varsta) {
		case 33:
			System.out.println("Esti Iisus?");
			break;
		case 34:
			System.out.println("Esti Iisus imbatranit nitel");
			break;
		case 32:
			System.out.println("Esti Iisus mai tanar");
		case 46:
		case 48:
		case 39:
			System.out.println("Nu stiu cine esti");
			break;
		default:
			System.out.println("Nu stiu cine esti dar nici nu ma intereseaza");
		}

		int a = 15;
		int b = 20;
		int c = a + b;
		// echivalente urmatoarele 2
		a++;
		a = a + 1;
		a--;
		a = a - 1;
		// echivalente
		a += 3;
		a = a + 3;
		System.out.println(a++);
		System.out.println(++a);

	}

	public static void testBasicTypes() {
		System.out.print("ne jucam aci");
		System.out.println("Hello java people");
		System.out.println("dupa un rand");

		int valoare1 = 12;
		int valoare2 = 14;
		int valoare3_noua;
		System.out.println("hjhjdsjh " + "text 2");
		System.out.println("numarul 1 este " + valoare1);

		System.out.println("numarul 4 este " + valoare4);
		System.out.println("numarul 5 este " + valoare5);

		System.out.println("booleanul este " + isAirborne);
		System.out.println("doubleul este " + double1);

		System.out.println("stringul1 este " + stringul1);
		stringul1 = "acum am un text";
		System.out.println("stringul1 este " + stringul1);
		stringul1 = new String("acum am alt text");
		System.out.println("stringul1 este " + stringul1);

		System.out.println("componenta este " + componenta);
		componenta = Componenta.getInstance();
		System.out.println("componenta este " + componenta);
		valoare4 = 1009;
		System.out.println("valoare4 este " + valoare4);
		test1();
		System.out.println("valoare4 este " + valoare4);

		System.out.println("suma " + (valoare1 + valoare2));
		valoare3_noua = valoare1 + valoare2;
		System.out.println("suma este " + valoare3_noua);
		valoare3_noua = valoare1 - valoare2;
		System.out.println("valoare3 este " + valoare3_noua);
		valoare3_noua = valoare1 / valoare2;
		System.out.println("valoare3 este " + valoare3_noua);
		valoare3_noua = valoare1 * valoare2;
		System.out.println("valoare3 este " + valoare3_noua);
		valoare3_noua = valoare1 * valoare1;
		System.out.println("valoare3 este " + valoare3_noua);
		valoare3_noua = valoare1 % valoare2;
		System.out.println("valoare3 este " + valoare3_noua);
		double1 = Math.sqrt(valoare2);
		System.out.println("double1 este " + double1);
		System.out.println("rootul este " + Math.sqrt(789) + " si diferenta este " + (valoare4 - valoare1));

		valoare5 = suma(19, 11);
		System.out.println(valoare4 + "si cealalta " + suma(valoare1, valoare3_noua));
	}

	public static void testObiecte() {
		Masina myBmw = new Masina(5);
		Masina myDacia = new Masina(4);
		Masina myFabia = new Masina(3);
		myBmw.setRoti(5);
		myDacia.setRoti(6);
		System.out.println(myBmw + "\n" + myDacia + "\n" + myFabia);
		myBmw.setNumarPasageri(10);
		myDacia.setNumarPasageri(6);

		System.out.println("\n\n" + myBmw.getNumarPasageri() + "\n" + myDacia.getNumarPasageri() + "\n"
				+ myFabia.getNumarPasageri());

		AvionCuMotor myPlane = new AvionCuMotor(3);

		Submarin submarin = new Submarin();
		Vehicul d = new Vehicul(8, 2, 2);
		Vehicul d1 = new Vehicul(3);
		Vehicul d2 = new Vehicul();
		System.out.println(d + "  \n" + d1 + "  \n" + d2);

		System.out.println(myBmw);
		System.out.println(myPlane);
	}

	public static void test1() {
		System.out.println(valoare4);
	}

	public static int suma(int termen1, int termen2) {
		return (termen1 + termen2);
	}

}
