package com.pattern.structural.proxy;

public class ProxyPatternTest {
	
	public static void main(String[] args){
		CommandExecutor executor = new CommandExecutorProxy("samuel", "123456");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
}
