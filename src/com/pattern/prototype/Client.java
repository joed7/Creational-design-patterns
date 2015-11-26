package com.pattern.prototype;

import com.pattern.prototype.PrototypeFactory.ModelType;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		 PrototypeCapable moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE);
		 PrototypeCapable albumPrototype = PrototypeFactory.getInstance(ModelType.ALBUM);

	}
}
