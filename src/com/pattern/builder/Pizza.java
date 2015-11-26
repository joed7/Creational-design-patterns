package com.pattern.builder;

public class Pizza {
	enum size {
		SMALL, MEDIUM, LARGE
	};

	private size size;
	private boolean cheese;
	private boolean veggies;
	private boolean pepporoni;

	public static class Builder {
		private final size size;

		private boolean cheese = false;
		private boolean veggies = false;
		private boolean pepporoni = false;

		public Builder(size size) {
			this.size = size;
		}																																																																																															

		public Builder cheese(boolean value) {
			cheese = value;
			return Builder.this;
		}

		public Builder pepperoni(boolean value) {
			pepporoni = value;
			return Builder.this;
		}

		public Builder veggies(boolean value) {
			veggies = value;
			return Builder.this;
		}

		public Pizza build() {
			return new Pizza(Builder.this);
		}
	}

	private Pizza(Builder builder) {
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.pepporoni = builder.pepporoni;
		this.veggies = builder.veggies;
	}
}