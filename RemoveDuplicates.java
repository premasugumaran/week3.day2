package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

import io.cucumber.java.an.E;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String[]str=text.split(" ");
		Set<String>duplname=new LinkedHashSet<String>();
		for (String remove :str ) {
		duplname.add(remove);
		if(count>1) {
		    System.out.println();
		}    
		}

		System.out.println(duplname);
		}
		}

