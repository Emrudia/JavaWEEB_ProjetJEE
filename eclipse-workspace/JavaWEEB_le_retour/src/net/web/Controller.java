package net.web;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Controller {

	public static byte[] getSHA(String message){
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			return md.digest(message.getBytes(StandardCharsets.UTF_8));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * This function returns a hexadecimal String from a byte tab.
	 * @param message
	 * @return the hash of a String.
	 */
	public static String coding(String message){
		BigInteger tmp = new BigInteger(1, getSHA(message));
		StringBuilder hash = new StringBuilder(tmp.toString(16));

		while (hash.length() < 32){
			hash.insert(0, "0");
		}
		return hash.toString();
	}
}
