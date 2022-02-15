package com.example.app.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String data = dateFormat.format(new Date());
		Date date = dateFormat.parse(data);
		System.out.print("#### - "+data);
		// TODO Auto-generated method stub
		intArray();
		stringArray();
		objetoArray();
	}
	
	public static void intArray() {
		try {
			int[] array = new int[5];
			
			array[0] = 1;
			// array[5] = 10;
			for(int i: array) {
				print(i+"");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Erro: "+e.getMessage());
		}
	}
	
	public static void stringArray() {
		String[] array = new String[5];
		
		array[0] = "Teste";
		
		for(String s: array) {
			print(s);
		}
	}
	
	public static void objetoArray(){
		try {
			ObjetoTeste[] array = new ObjetoTeste[5];
			
			array[0] = new ObjetoTeste();
			array[1] = new ObjetoTeste();
			
			for(ObjetoTeste o: array) {
				print(o.toString());
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
			print("ERRO: "+e.getMessage());
		}
		
	}
	
	public static void mathErro() {
		try {
			int i = 10;
			i = i / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Erro: "+e);
		}
	}
	
	public static void errorFile() {
		try {
			FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Erro File: "+e);
		}
	}
	
	static void print(String s) {
		System.out.println(s);
	}
}
