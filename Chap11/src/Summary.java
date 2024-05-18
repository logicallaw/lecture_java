/*
#강의 내용 정리
1.JLabel은 문자열이나 이미지 출력 가능하다.
Icon타입의 이미지를 인자로 받아 이미지를 출력한다.
이때, Icon은 인터페이스이다.
2.JLabel(String, Icon, int) 생성자 사용시
반드시 hAlign 인자가 필요하다.
3.JButton은 기본적으로 JLabel과 비슷하다.
단, 클릭시 Action event가 발생하는게 특징이다.
또한, JButton(String, Icon) 생성자 사용시
JLabel과 다르게 정렬 인자가 필수가 아니다.
4.JCheckBox는 2가지 이벤트가 발생하는데
두 이벤트에 대해 2가지 모두 처리해야한다.
5.JCheckBox 생성자의 인자 중 boolean타입에서
true면 체크를, false면 해제상태를 의미한다.
인자로 주지 않으면 기본 값은 false이다.
6.setBorderPainted(boolean) 메서드는 체크 박스 주변 경계선 설정이 가능하다.
7.JCheckBox에서 2가지 이벤트는 모두 Item 이벤트를 나타내는데
선택 또는 해제를 했을 때 각각 Item 이벤트가 발생한다.
8.getStateChange()메서드는 이벤트 처리 구분을 위해 사용되며
if문에서 동등비교연산자를 사용하여 선택 또는 해제를 구분할 수 있다.
9.세개의 체크박스에 대해 한개의 리스너를 공유하며 처리할 수 있다.
10.JRadioButton은 본질적으로 체크박스와 동일하며
다만, 중복이 아닌 하나만 선택할 수 있는게 특징이다.
이 기능 구현은 ButtonGroup을 사용해 그룹화시킬 수 있다.

*/