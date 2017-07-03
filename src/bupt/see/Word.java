package bupt.see;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Vacabulary{
	private String English;
	private String Chinese;

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public String getChinese() {
		return Chinese;
	}

	public void setChinese(String chinese) {
		Chinese = chinese;
	}

	public Vacabulary(String english, String chinese) {
		super();
		English = english;
		Chinese = chinese;
	}

	public Vacabulary() {
		super();
	}

}

public class Word {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String pathname = "word.txt";
		File file = new File(pathname);
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		ArrayList<Vacabulary> arrayList = new ArrayList<Vacabulary>();
		String line = "";
		line = bufferedReader.readLine();
		System.out.println(line);
		while (line != null) {
			String [] array = line.split(" ");
			Vacabulary vacabulary = new Vacabulary(array[0],array[1]);
			arrayList.add(vacabulary);
			line = bufferedReader.readLine();
			System.out.println(line);
		}
		System.out.println(arrayList.size());
		bufferedReader.close();
		inputStreamReader.close();
		Iterator<Vacabulary> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Vacabulary vacabulary = iterator.next();
			System.out.printf(vacabulary.getChinese());
			scanner.nextLine();
			System.out.printf(" " + vacabulary.getEnglish()+ "\n");
			System.out.println("=======================================");
		}
		System.out.println("end");
	}

}
