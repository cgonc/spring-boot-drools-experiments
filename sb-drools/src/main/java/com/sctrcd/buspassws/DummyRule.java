package com.sctrcd.buspassws;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.spring.SpringRule;

@SpringRule
public class DummyRule {

	@Condition
	public boolean when() {
		return true;
	}

	@Action
	public void then(){
		System.out.println("Hey, I'm managed by Spring");
	}
}
