package com;

import org.apache.commons.lang3.math.NumberUtils;

public class Main {
//javac --module-source-path src\modules --module-path lib -d target src\modules\testModule\com\Main.java
	public static void main(String[] args) {
		if (args.length == 0)
			throw new IllegalArgumentException("Pass a word as argument");
		System.out.println(NumberUtils.isDigits(args[0]));
	}
}
