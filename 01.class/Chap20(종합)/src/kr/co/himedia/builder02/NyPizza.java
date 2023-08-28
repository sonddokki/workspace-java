package kr.co.himedia.builder02;

public class NyPizza extends Pizza {

	public NyPizza(Builder builder) {
		super(builder);
		this.size = builder.size;
		
	}

	// 피자의 사이즈를 열거형으로 추가
	public enum Size { SAMLL, MEDIUM, LARGE };
	private final Size size;
	
	public static class Builder extends Pizza.Builder {
		private final Size size;
		
		
		public Builder(Size size) {
			this.size = size;
		}

		@Override
		protected kr.co.himedia.builder02.Pizza.Builder self() {
			return this;
		}

		@Override
		Pizza build() {
			return new NyPizza(this);
		}
		
	}
	
	
//	@Override
//	public String toString() {
//		return toppings.toString();
//	}

}
