package section17;
/*
 * Lambda 표현식
 * 	람다식이란 함수를 하나의 식으로 표현한 것을 말한다.
 * 	함수를 람다식으로 표현하면 메소드 이므로 필요 없기 때문에,
 * 	람다식은 익명함수의 한 종류라고 볼 수 있다.
 * 
 * 기존 방식
 * 반환타입 메소드명(매개변수,...){
 * 	실행문
 * }
 */
public class Lambda {

	public static void main(String[] args) {
		//1. 기존의 익명클래스
		MyLambdaFunction lambdaFunction1=new MyLambdaFunction() {
			
			@Override
			public int max(int a, int b) {
				return a>b?a:b;
			}
		};
		System.out.println(lambdaFunction1.max(3, 5));
		
		//2. 람다식을 이용한 익명클래스
		MyLambdaFunction lambdaFuntion2=(int a,int b)->a>b?a:b;
		System.out.println(lambdaFuntion2.max(3, 5));
		}
	}
@FunctionalInterface
interface MyLambdaFunction{
	int max(int a,int b);
}
