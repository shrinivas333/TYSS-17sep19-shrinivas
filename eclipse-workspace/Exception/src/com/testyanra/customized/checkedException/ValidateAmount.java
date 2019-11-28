package com.testyanra.customized.checkedException;

public class ValidateAmount {

	void amountcheck(int amount) throws InvalidAmountException {
		if(amount>40000) {
			throw new InvalidAmountException();
		}
	}
}
