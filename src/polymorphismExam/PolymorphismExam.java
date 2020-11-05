package polymorphismExam;

public class PolymorphismExam {

	public static void main(String[] args) {
		// 다형성
		// 부모 클래스의 객체변수로 다양한 타입의 자식클래스의 객체를 참조하면서 객체변수는 여러가지의 다양한 특성을 갖는다.
		
		FireEngine fe = new FireEngine();
		
		Car car = fe;
		
		//car.waterSpread(); // 부모객체변수는 자식클래스의 인스턴스 멤버를 사용할 수 없다.
		
		FireEngine fe2 = (FireEngine)car; // fe2 -> (car) -> fe
		fe2.waterSpread(); // fe2는 자식클래스의 인스턴스를 사용할 수 있다.
		 
		Car car2 = new Car();
		FireEngine fe3;
		//fe3 = (FireEngine)car2; // 에러, fe3의 멤버변수가 car2보다 많기 때문에 참조할 수 없다.
		
		
		// 부모클래스의 객체변수로 자식의 인스턴스를 참조할 수 있다. 단, 부모클래스의 멤버만 사용가능
		// 자식클래스의 객체변수로 부모의 인스턴스를 참조할 수 없다. 
		// 왜냐하면 자식 객체변수는 더 많은 멤버를 가지고 있을 수 있기 때문에 허용하지않는다.
		
		checkType(car); // 파이어엔진의 인스턴스를 가리키고 있다.
		checkType(car2);  // 카의 인스턴스를 가리키고 있다.
		
		
	}
	// 참조변수의 인스턴스 확인
	static void checkType(Car c) {
		if(c instanceof FireEngine) { // instanceof는 참조변수가 어떤 타입의 인스턴스를 가리키고 있는 확인한다.
			System.out.println("파이어엔진의 인스턴스를 가리키고 있다.");
		}
		else {
			System.out.println("카의 인스턴스를 가리키고 있다.");
		}
		
	}

}

class Car{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car{
	
	void waterSpread() {
		System.out.println("물로 불끄기");
	}
	
}




