/*
#강의노트 정리
1.기본적으로 클래스를 출력하면 toString()으로
자동으로 변환하여 출력한다.
2.최상위 부모클래스인 Object는 자동으로 java.lang을 import하므로
따로 import할 필요없이 해당 Object 클래스를 사용할 수 있다.

이는 Object 클래스와 관련된 메서드를 import 없이 부모로 업캐스팅하면 부모의 메서드를 사용할 수 있게 된다.

3.(중요개념)최상위 부모 Object 클래스의 메서드 hashCode()는 자식클래스에서 오버라이딩할 수 있다.
hashCode() 오버라이딩은 equals()메서드를 사용한다면 꼭 해야한다.
hashCode() 리턴값은 기본적으로 객체의 메모리 주소로 값을 생성하여 리턴한다.
그러므로, 논리적 동등 확인할 때는 hashCode() 함수가 오버라이딩으로 Objects.hash()로 리턴해주어야한다.

4.(기억)String s = p + "점"; 코드는 에러없이 실행되는데
이는 p가 문자열 덧셈이 되면 내부적으로 toString()을 호출하기 때문이다.
p + "점"이나 p.toString() + "점"이나 같은 코드이다.
5.==동등 비교연산자는 기본적으로 기본타입은 값을 비교하지만 참조변수가 오면
해당 객체의 주소를 비교하게 된다.
6.(기억)equals() 오버라이딩시 다운캐스팅 확인 코드가 필요하다.
7.Wrapper 클래스는 기본타입 8개를 클래스화 한 클래스다.
기본타입:byte, boolean, char, short, int, long, float, double
Wrapper클래스:Byte,Boolean, Character, Short, Integer, Long, Float, Double
대부분 첫글자가 대문자로 시작하는데
int, char타입에 대해서는
Integer, Character로 사용하니 주의하자.
8.Wrapper 클래스의 객체 생성은 해당 타입.valueOf() 메서드로 생성한다.
Java 9부터는 new를 이용한 객체 생성을 폐기하였다.

Wrapper 클래스를 사용하는 이유
:매개변수 (Object obj)로 세상 모든 객체를 다 받을 수 있지만
기본타입은 받지 못한다.
따라서, class-type으로 감싸서 객체를 받을 수 있게 된다.

9.(주의)Float f = Float.valueOf(1.1);와 같이 생성하면 에러가 발생한다.
Float 타입 Wrapper 클래스는 반드시 (float)으로 캐스팅해야한다.
10.(주의)Byte bb = Byte.valueOf(10);도 컴파일 에러이다.
반드시 (byte)10으로 캐스팅해야한다.
11.	Short s = Short.valueOf(10);도 에러다.
주의하자.
12.(gpt)자바에서는 내부적으로 키싱과정을 걸친다.
-128~127값의 정수값은 이미 내부적으로 만들어진 객체를 사용한다. 범위외 값은 새롭게 생성한다.

13.Wrapper class의 메서드
-.isDigit():문자 상수가 숫자면 true;
-.isAlphabetic():문자 상수가 문자면 true;
-.parseInt():정수를 10진수로 변환
-.toHexString():정수를 2진수 문자열로 변환
-.toBinaryString():정수를 16진수 문자열로 변환
-.bitCount():정수 2진수의 개수
-.toString():문자열로 변환
-.parseDouble():문자열을 실수로 변환

14.Wrapper클래스는 JDK1.5부터 자동 박싱과 언박싱 지원
Integer ten = 10; //자동 박싱-Integer.valueOf(10);
int n = ten; //자동 언박싱-ten.intValue();
박싱:기본타입의 값을 Wrapper 객체로 반환
언박싱:Wrapper 객체를 기본 타입의 값으로 빼내는 것


15.String 클래스는 기본적으로 문자열 객체 생성되면 이후 수정 불가!
그래서, String을 새롭게 할당하면 새로운 객체를 생성하여 참조하는 것이다.

16.String 비교시 반드시 equals로 문자열 비교해야한다.
(왜냐면 그냥 String 비교시 객체의 메모리 주소를 비교하기 때문이다.)

17.String 생성 방법:2가지
첫번째.리터럴로 생성
:JVM이 리터럴 관리. 응용프로그램 내(constant pool)에서 공유된다.
이때, constant pool은 heap 메모리 공간에서 따로 영역이 나뉘어져있다.
String a = "junho";
String b = "junho";
a==b는 true이다.

두번째.String 객체로 생성.
힙 공간에 String 객체를 new 키워드를 사용하여 생성할 수 있다.
String a = new String("junho");
String b = new String("junho");
a==b는 false이다. 각각 생성되어서 서로간 메모리 주소가 다르다.

18.String 객체는 수정이 불가능하다.
String a = "junho";와
a = "jo"는 서로 다른 객체를 참조하는 것이다.
또 다른 예시로
"jo".concat("junho")는 "jo"를 수정하는게 아니라
새로운 객체 "jojunho"를 생성하는 것이다.
String 자체는 불변이다. 새롭게 생성되는 것뿐이다.

따라서,

String a = "  junho  ";
a.trim();
System.out.println(a);

출력시 junho가 아닌    junho  이 되게된다.

-.concat():해당 String 뒤에 매개변수로 받는 인수를 덧붙인다.

19.String객체1.compareTo(String객체2)
:사전적으로 객체1이 객체2보다 먼저나오면 음수 리턴.
나중에 나오면 양수 리턴.

20.
-공백제거:String객체.trim()->앞뒤 공백만 제거(안쪽 공백은 무시)(화이트스페이스 제거)
String s1 = "     jss  s s sd    ".trim();
System.out.println(s1);

-문자열의 문자:String객체.charAt(index); 이때, index는 0부터 시작한다.
인덱스를 벗어난 범위는 컴파일 에러가 발생한다.

-

*/