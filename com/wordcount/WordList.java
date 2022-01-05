package com.wordcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordList {
	
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("F:\\chethan\\DOCUMENT FILES\\RBI.txt");
		
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		
		String words = bufferreader.readLine();
		while(words!= words) {
			System.out.println(words);
			}
		}
	}

