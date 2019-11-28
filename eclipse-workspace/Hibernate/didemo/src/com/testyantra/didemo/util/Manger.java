package com.testyantra.didemo.util;

import com.testyantra.didemo.dao.I;
import com.testyantra.didemo.dao.impl.A;

public class Manger {

	public I getI() {
		return (I) new A();
	}
}
