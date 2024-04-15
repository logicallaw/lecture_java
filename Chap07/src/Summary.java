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

*/
