/*
Chap04
#실수할 수 있는 포인트 정리
1.언더스코어(_)는 정수 리터럴 사이에 사용 가능하나 다음은 에러가 발생한다.
-1)언더스코어는 소수점 앞뒤에 사용불가능하다.
-2)숫자 맨 앞뒤에 사용 불가능하다.
-3)L, D, F, l, f 앞뒤에 사용 불가능하다.

#문제풀이 실수(문제풀면서 알게된 사실)
1.배열이니까 꼭 참조변수에 [] 붙어야됨.
2.참조변수 배열 생성시 크기 지정하면 안됨.
3.new Rectangle[]에서 꼭 사이즈 넣어야 컴파일 에러가 안남.
4.for-each문에서 for(int num : nums)로 배열의 원소를
scanner.nextInt()로 받으려하면 안된다.
그 이유는 내부적으로 int num = nums[0];이 실행되는데
기본타입은 메모리 주소가 아닌 값 자체를 복사하기 때문에
정상적으로 값이 저장되지 않는다.
따라서, for-each문에서 배열의 원소 값을 입력 받는 행위는 불가능하다.
5.(기억)함수 선언시
public static return-type funcname() {}

클래스 선언
class classname{}

클래스 필드 선언
private type name = ;

클래스 메서드 선언
public return-type name() {}

Scanner 선언 양식
static Scanner scan = new Scanner(System.in);
public static void closeScanner() { scan.close(); }

C++와 다르게 final과 &, *이런거 사용 안한다.
또한, C++과 다르게 보통 선언과 동시에 함수도 바로 정의한다. 따로 잘 안함. 생성자도 마찬가지로.

배열 선언은
int name[]이 아니라
보통은 int[]로 한다.
또한, 선언시 배열 크기 지정하면 안되고
배열 크기는 배열객체 생성시 지정한다.

또한, 모든 초기화는 ()를 사용한다. 중괄호 초기화가 없다.

6.(주의)(중요)
		Book1 b1 = new Book1(1, "책1", "저자1", "출판사1", 2021 , "장르1");
		Book1 b2 = new Book1(2, "책2", "저자2", "출판사2", 2022, "장르2");
		Book1 b3 = new Book1(3, "책3", "저자3", "출판사3", 2023, "장르3");
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
여기에서 자바는 addBook(Book1());와 같이 바로 넣을 수 없다.
무조건 객체 생성은 따로 new를 사용하여 만들어주고
heap공간의 객체를 따로 넣어주어야한다!!!

#강의내용 정리
1.필드에서 접근권한 생략시 default가 자동으로 부여된다.
2.보통은 붙이고 필드는 보통 private를 사용한다.
3.(중요)참조타입은 반드시 동적으로 new를 사용해야된다.
따라서, 객체 또한 동적으로 생성해야된다.
4.객체의 생성과정
:객체에 대한 참조변수를 선언한다.
그리고, 객체를 동적으로 new를 사용하여 생성한다.
(중요)이때 new를 사용하면 해당 객체는 매개변수 리스트에 맞는 생성자를 호출하게 된다.
5.모든 객체는 해당 객체를 참조하는 참조변수가 존재한다.
해당 참조변수는 해당 객체가 있는 heap 시작 주소를 받게 된다.
(뤼튼 내용):자바에는 포인터 개념이 없다.
안전성을 높이기 위해 참조라는 개념을 사용한다.
참조를 통해 객체에 접근할 수 있고 포인터와 비슷한 개념으로 사용된다.
안전성 측면은 개발자가 임의로 메모리 접근을 방지한다. 
(뤼튼)참조 타입의 특징
5-1.참조타입 변수는 실제 데이터가 아닌 데이터가 저장된 heap 영역의 주소를 저장한다.이로써,
해당 참조타입 변수는 데이터가 아닌 데이터의 위치를 가리킨다.
참조타입 변수는 null 값을 가질 수 있다.
이는 변수가 어떠한 객체도 참조하지 않는다는 것을 의미한다.
5-2.동적 메모리 관리:자바의 가비지 컬렉터는 더 이상 참조하지 않는 객체를
자동으로 정리한다. 이는 참조타입이 메모리 누수를 방지하는데 도움이 된다.
5-3.기본타입은 null값을 가질 수 없다.

6.자바에서 참조타입은 모두 동적으로 생성된다. 정적은 없다 자바에서는.
따라서, 모두 new 키워드를 사용하여 heap에 생성된다.

7.클래스에서 정의된 메서드는 이후 객체에서 사용될 때
메서드는 서로 공유된다. 메서드는 하나의 공간에서 여러 객체에 참조된다.

8.어떤 변수는 먼저 그 변수의 스코프에서 찾고,
없다면 상위스코프에서 찾아서 실행된다.

9.this()는 동일클래스에서 다른 생성자를 호출할 때 사용한다.
생성자 내에서만 사용이 가능하고
반드시 생성자 코드의 제일 처음에 수행되어야한다. 

10.자바에서는 모두 값을 복사한다.
기본타입은 값을 복사하고, 참조타입은 heap 공간 참조하는 메모리 주소를 복사한다.
따라서, pass-by-value와 pass-by-reference 방식을 논하는 것은 의미가 없다.
참조타입 변수의 값을 복사하고 해당 객체의 값을 변경하면 원본의 영향이 있다.

11.메소드 오버로딩:이름이 같은 메서드를 시그니처만 다르다면 오버로딩할 수가 있다.
이때, 리턴타입은 상관이 없다.

만약에 sum(int, double)와 sum(double, int)에 대해서
sum(5,5)라면 둘다 int, int인데 int->double로 간다면
모호한 상황이 발생하게 되어서 컴파일 에러가 발생한다.

12.객체는 항상 동적으로 할당된다.
이때, 사용하지 않는 객체는 자바가상머신의 가비지 컬렉터가 메모리 누수를 관리하게되어 방지시킨다.

13.가비지 컬렉션을 직접 호출하여 메모리를 정리하는 방법인
객체의 gc()를 호출하면 되는데 안될 수도 있어서 결국엔
모든 객체의 메모리 관리는 자바가상머신이 판단하게 된다.

14.패키지는 바이트코드들을 목적에 맞게 분류한다.
이때, 이름이 같은 바이트코드는 다른 패키지에 있으면 문제없이 사용할 수 있다.

15.소스파일명과 동일한 클래스는 반드시 public	 접근 제한자를 붙여야한다.
이외 클래스는 public을 붙일 수가 없다.

16.디폴드 접근 제한자는 같은 패키지의 다른 클래스에게 접근을 허용하며
다른 패키지는 접근할 수가 없다.

17.보통 필드는 접근을 줄이는 방향으로 설계를 한다.
내가 의도한 대로 동작하고, 다른 파일에 import될 때
내가 의도한 대로 동작을 하게하기 위해서는
필드는 접근 권한을 좁게 설정해야한다.

18.클래스 static멤버는 보통 클래스명.으로 접근한다.
객체로 접근은 안하는 편이다.

클래스 static 멤버는 자바가상머신이 클래스를 다 읽어들이고 난 뒤에 static이 생성된다.
static멤버는 클래스 멤버라고도 불린다.
바람직한 접근 방법은 클래스를 통해 접근하는 것이다.

19.static멤버는 원래 이름은 static local member인데 이는
전역변수처럼 사용되며 해당 scope에서만 사용하게 된다.
따라서, 만약 전역변수를 정 사용하고 싶다면 static으로 선언하여
내 프로그램만 좀비화하면 된다.

20.static메서드는 this를 사용할 수 없다.
애초에 this는 메서드를 호출한 객체에서 사용되는데 객체의 생성유무와 무관하게 존재해야하기 때문이다.

21.static메서드는 non static멤버에 접근할 수 없다.20번과 같은이유로
객체 생성과 무관하게 존재해야하기 때문이다.

22.final는 C++에서의 const와 의미와 역할이 다르다.
final는 기본타입에 붙으면 상수를 의미하고
클래스에 붙으면 더 이상 상속 불가를 의미하고
메서드에 붙으면 오버라이딩이 불가능함을 의미하게된다.

23.final이 기본타입에 붙게되면 선언만 해도 되는데
생성자로 호출이 될때는 반드시 초기화를 해주어서 변수를 생성시켜야한다.

24.예외 종류
정수값 입력 잘못됨:java.util/InputMismatchException e


*/