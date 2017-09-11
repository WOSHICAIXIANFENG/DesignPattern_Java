package com.pattern.behavioral.chainofResponsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}
