package day3;


import java.util.*;
import java.util.function.Predicate;

public class StreamNumberChecker {
	public static void main (String args[]) {
		List<String> alphaNumbersList = new ArrayList<>();
		alphaNumbersList.add("jgk");
		alphaNumbersList.add("892.13");
		alphaNumbersList.add("167.12");
		alphaNumbersList.add("dac");
		alphaNumbersList.add("26.13");
		alphaNumbersList.add("jbc");
		alphaNumbersList.add("59.16");
		alphaNumbersList.add("zfg");
		alphaNumbersList.add("133.30");	
		alphaNumbersList.add("1002.33");
		//filter
		System.out.println("Filtered list : ");
		alphaNumbersList.stream().filter(alpha -> alpha.startsWith("j")).forEach(System.out::println);
		
		//sorting with map to upper case
		System.out.println("\nSorted and map list : ");
		alphaNumbersList.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
		
		//select number larger than 100
		//predicate.not is to negate the true condition element
		System.out.println("\nFiltered number >100 list : ");
		alphaNumbersList.stream().map(s -> s.replaceAll("[a-z]", "")).filter(Predicate.not(String::isEmpty))
		.map(Double::parseDouble)
		.filter(number -> number > 100.00).sorted().forEach(System.out::println);
	    }
}
