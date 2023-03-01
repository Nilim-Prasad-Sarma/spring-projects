package com.te.javabasics.collection;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerTest {
	private static final Logger LOGGER = Logger.getLogger(LoggerTest.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		FileHandler fileHandler = new FileHandler("D:\\New folder\\myLogs.txt");
		fileHandler.setLevel(Level.ALL);
		
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);

//		SimpleFormatter formatter = new SimpleFormatter();
//		consoleHandler.setFormatter(formatter);
		
		XMLFormatter formatter = new XMLFormatter();
		consoleHandler.setFormatter(formatter);
		
		LOGGER.addHandler(fileHandler);

		LOGGER.setLevel(Level.ALL);
		LOGGER.severe("severe msg");
		LOGGER.warning("warning msg");
		LOGGER.info("info msg");
		LOGGER.config("config msg");
		LOGGER.fine("fine msg");
		LOGGER.finer("finer msg");
		LOGGER.finer("finer msg");
		LOGGER.finest("finest msg");

	}
}
