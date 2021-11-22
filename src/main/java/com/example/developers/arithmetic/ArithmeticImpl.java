package com.example.developers.arithmetic;

import java.math.BigDecimal;

public class ArithmeticImpl implements Arithmetic {

	@Override
	public BigDecimal add(BigDecimal x, BigDecimal y) {
		return x.add(y);
	}

	@Override
	public BigDecimal substract(BigDecimal x, BigDecimal y) {
		return x.subtract(y);
	}

}
