package datastructure;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {

		List<String>BDcity=new ArrayList<String>();
		BDcity.add("Sylhet");
		BDcity.add("Khulna");
		BDcity.add("Borishal");

		List<String>UScity=new ArrayList<String>();
		UScity.add("Irving");
		UScity.add("Detroit");
		UScity.add("Miami");


		List<String>Indcity=new ArrayList<String>();
		Indcity.add("Delhi");
		Indcity.add("Pune");
		Indcity.add("Mumbay");

		Map<String,List<String>> listofCities=new HashMap<String,List<String>>();
		listofCities.put("Cities of Bangladesh",BDcity);
		listofCities.put("States of USA",UScity);
		listofCities.put("Cities of India",Indcity);

		Iterator it=listofCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(Map.Entry<String,List<String>> cityInfo:listofCities.entrySet()){
			System.out.println("Cities of different countries :"+cityInfo.getKey()+"--->"+cityInfo.getValue());
		}
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}

}