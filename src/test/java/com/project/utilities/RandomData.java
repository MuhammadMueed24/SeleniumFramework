package com.project.utilities;

import java.util.Random;

public class RandomData {

	public String generateRandomData() {

		String charcters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder RandomData = new StringBuilder();
		Random rand = new Random();

		for (int i = 1; i < 10; i++) {
			int randomIndex = rand.nextInt(charcters.length());
			RandomData.append(charcters.charAt(randomIndex));
		}

		return RandomData.toString();
	}

	public String generateRandomNum() {

		String charcters = "1234567890";

		StringBuilder RandomNum = new StringBuilder();
		Random rand = new Random();

		for (int i = 1; i < 6; i++) {
			int randomIndex = rand.nextInt(charcters.length());
			RandomNum.append(charcters.charAt(randomIndex));
		}

		return RandomNum.toString();
	}

	public String generateRandomEmail() {

		String[] domains = { "gmail.com", "yahoo.com", "hotmail.com" };
		String[] characters = "abcdefghijklmnopqrstuvwxyz1234567890".split("");

		StringBuilder email = new StringBuilder();
		Random rand = new Random();

		for (int i = 1; i <= 10; i++) {
			int randomIndex = rand.nextInt(characters.length);
			email.append(characters[randomIndex]);
		}

		email.append("@");

		int randomDomainIndex = rand.nextInt(domains.length);
		email.append(domains[randomDomainIndex]);

		return email.toString();
	}

	public String generateRandomPassword() {

		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
		StringBuilder password = new StringBuilder();
		Random rand = new Random();

		for (int i = 1; i <= 12; i++) {
			int randomIndex = rand.nextInt(characters.length());
			password.append(characters.charAt(randomIndex));
		}
		return password.toString();
	}

}
