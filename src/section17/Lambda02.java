package section17;
/*
 * 스트림(Stream)
 * 	java 컬렉션을 처리하고 조작하는 기능을 제공하는 API이다.
 * 	연속적인 데이터를 처리하고 변환할 수 있따.
 */
import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		
		list.add("Apple");
		list.add("Bat");
		list.add("car");
		list.add("Dog");
		list.add("cat");
		
		//printBasic(list);
		//pritWithFP(list);
		//printBasicWithFiltering(list);
		printWithFPwithFiltering(list);
	}
	
	//기존 확장 for문 이용해 List 전체출력
	private static void printBasic(List<String> list) {
		for(String str: list) {
			System.out.println(str);
		}
	}
	//stream forEach 람다식
	private static void pritWithFP(List<String>list) {
		list.stream().forEach(element->System.out.println("element - "+element));
	}
	
	//기존 확장 for문 필터(if문) 이용
	private static void printBasicWithFiltering(List<String>list) {
		for(String str: list) {
			if(str.endsWith("at"))
			System.out.println(str);
		}
	}
	//stream filter forEach 람다식
	private static void printWithFPwithFiltering(List<String>list) {
		list.stream().filter(element->element.endsWith("at"))
			.forEach(element->System.out.println("element - "+element));
	}
}
