package lambdaExpressions;
//Lambda Expressions without parameters

//Lambda Expressions with parameters
//Lambda Expressions with multiple parameters(return type)

interface Calculator {
//	 void switchOn();
//	void add(int input);
	int substract(int a, int b);

}

public class WUparamts {

	public static void main(String[] args) {
//		Calculator cal = () -> {
//			System.out.println("Hello lambdaExpressions without paramters!! ");
//		};
//		cal.switchOn();
//
//	Calculator cal1 = (input) -> System.out.println("the input is:" + input);
//		cal1.add(12);
//	}

		Calculator cal2 = ( a, b) -> {
		
		if(b<a) {
			throw new RuntimeException("please give correct value!!");
		}
		else {
			return b-a;
		}
		};
		System.out.println(cal2.substract(12, 13));

	}

}
