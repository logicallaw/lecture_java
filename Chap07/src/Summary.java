/*
#예습
1.컬렉션이란? 요소 객체들의 저장소를 의미한다.
객체들의 컨테이너라고 불린다.
요소의 개수에 따라 크기가 자동으로 조절된다.
요소의 삽입,삭제에 따라 요소의 위치가 자동으로 이동되어서
고정길이 배열을 다루기에는 적합하지 않는다.
2.컬렉션은 제네릭 기법으로 구현된다.
컬렉션의 요소는 객체만 가능하여, 기본타입에 대해서는 Wrapper 클래스로 다룰 수 있다.
따라서,
Vector<int> v1 = new Vector<int>();은 컴파일 에러가 발생한다.

3.Vector<E>의 특성
E대신 요소를 사용할 특정 타입으로 구체화가 가능하다.
4.Vector<E> 메서드
.add():벡터 요소 뒤에 추가한다.
.size():현재 벡터 요소의 개수를 리턴한다.
.capacity():현재 벡터의 용량을 리턴한다.
5.Java7이후 자동타입 추론이 가능하다.
다음과 같은 
Vector<Character> v1 = new Vector<>();
Vector<> v1 = new Vector<Character>();는 에러이다.
var키워드를 사용하여
var v = new Vector<Boolean>();과 같은 형태는 가능하다.
6.HashMap<K,V> name = new HashMap<K,V>();
-원소 추가:name.put();
-value 가져오기:name.get(key);
-Key들로 이루어진 Set 컬렉션 리턴:name.keySet();
7.LinkedList<T> name = new LinkedList<T>();
-원소 추가:name.add();
-List 인터페이스를 구현한 컬렉션 클래스.
-요소 객체들은 양방향으로 연결되어 관리됨.
-요소 객체들은 맨앞, 맨뒤에 추가 가능.
-요소 객체들은 인덱스를 사용하여 중간에 삽입 가능.
-맨 앞이나 맨 뒤에 요소를 추가할 수 있어서 스택이나 큐로 사용가능.
8.Collections 클래스:
-java.util 패키지에 포함.
-컬렉션 연산을 수행하고 결과로 컬렉션을 리턴한다.
-모든 메서드는 static 타입이라 Collections.method();로 사용가능하다.
-컬렉션 요소를 정렬하는 .sort()
-요소의 순서를 반대로 하는 .reverse()
-요소의 최댓값과 최솟값을 찾는 max(), min()
-특정 값을 검색하는 binarySearch() 메서드.

#강의복습
1.제네릭이란 특정 타입만이 아닌 여러 종류의 타입으로 변경하도록 클래스나 메서드를 일반화하는 기법을 말한다.
2.제네릭은 자바에서 제네릭 이레이저를 통해 내부적으로 Object로 업캐스팅되어서 Object 타입으로 들어가게 된다.
따라서, 내부적으로 사용할 때는 다운캐스팅을 하는 것이 안전하다.
3.벡터도 마찬가지로 제네릭을 사용하므로 내부적으로 제네릭 타입이 지워지고 Object로 업캐스팅이 된다.
이때, 기본타입은 사용할 수 없고, 기본타입이 들어오면 내부적으로 자동 박싱이 진행되어
Wrapper 클래스 타입으로 들어가게 된다.
4.자바에서는 오버로딩 개념이 없다. 따라서, 벡터에서 요소를 접근할 때 [] 연산자로는 접근할 수 없다.
요소 접근은 get() 메서드를 사용하여 얻어온다.
5.ArrayList는 벡터와 다르게 멀티스레드 동기화 기능이 없다. 다만, 벡터는 존재한다.
두 컬렉션의 메서드는 거의 비슷하다.
6.iterator 메서드는 StringTokenizer 클래스와 기능이 비슷하다.
단, HashMap 컬렉션에 대해 iterator를 사용할 수 없고, 해당 k-v을 이용하고 싶다면
keySet()이나 keyEntry()를 이용하여 iterator 객체를 생성하면 된다.
7.HashMap->Entry 생성법
Entry<key-type, value-type> e = hashMap.entrySet()
접근:e.getKey()/e.getValue()
8.(매우 중요, 개념이 어려워서 이해 반드시 필요)HashMap의 put() 메서드 동작과정
1.입력된 key에 대한 hashCode()를 사용하여 해시 값을 얻어온다.
이때, HashMap은 해당 key의 필드들로 오버라이딩된 hashCode()의 해시값을 통해
같은 해시값이 존재하면 동일한 key로 판단한다.
동일한 key로 판단하면 그 다음에 오버라이딩된 equals()메서드를 통해
해당 key의 모든 필드의 내용을 비교하게 되는데
false면 이는 내부는 다른데 해시충돌로 같은 자리가 나온거니, 다른 위치로 배정되어 새로운 value를 Entry 객체에 집어 넣게 된다.
true면 필드가 서로 같음을 의미하는데, 이는 동일 key에 대한 기존 value를 새로운 value로 업데이트를 HashMap은 내부적으로 진행한다.


*/
