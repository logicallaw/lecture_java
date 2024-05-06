/*
#강의 정리
0.스트림이란 데이터의 연속적인 흐름을 의미한다.
스트림은 데이터를 읽고 쓰는 방식을 추상화한 것을 말한다.
스트림은 파일, 네트워크 연결, 메모리 배열 등 다양한 데이터를 일관되게 처리할 수 있게 해준다.
스트림은 어떤 장치에서 내 프로그램으로 데이터를 처리할 때 사용되는데
Scanner같이 이미 만들어진 클래스(또는 객체)를 사용하여 처리하게 된다.
이를 스트림 클래스, 스트림 객체라고 부르며, 편의상 스트림으로 부른다.
스트림은 입출력 장치와 자바 응용프로그램(코드)간 인터페이스 역할을 하게 된다.
내부적으로 구현되어 있기 때문에 편리하게 사용하면 된다.
1.모든 스트림은 단방향이다. 입출력을 같이 하지 않는다.
2.바이트 스트림:기본적으로 스트림 자체가 바이트 단위로 움직이기 때문에 이런 바이트 처리하는 스트림이다.
3.문자 스트림:char타입 2바이트의 문자를 처리하는 문자스트림이다.
기본 바이트 스트림은 1바이트씩 처리하기 때문에 문자 처리에 어려움이 있는데
문자 처리에 특화된 문자스트림을 사용하면 문자 처리를 쉽게 할 수 있다.
(기억)문자 외 나머지 모든 데이터 처리는 모두 바이트 스트림으로 처리한다.

4.바이트 스트림(~Stream)
-공통 부모인 InputStream, OutputStream을 상속 받는다.
InputStream, OutputStream은 추상클래스라 객체 생성 불가. 타입 제공은 가능.
-자식 클래스는 매개변수로 InputStream, OutputStream 부모타입으로 받는다.

5.문자 스트림(~Reader, Writer)
(예제)
InputStreamReader isr = new InputStreamReader(System.in);
isr = rd.read();
-->바이트 단위의 바이트 스트림으로 받고 이를 문자 스트림으로 연결하여 문자를 2바이트씩 처리할 수 있다.
-->보통은 이렇게 연결해서 마지막 스트림만 다루게 된다.

6.FileReader, FileWriter
:장치-FileReader or FileWriter로 장치를 직접 연결해 문자를 읽거나 쓴다.
-read()메서드 : 모두 int타입 리턴. int타입 변수로 받고 System.out.print시 char로 캐스팅 후 출력.
이때, int 타입으로 리턴하는 이유는
char 2바이트는 0000~FFFF까지 표현 가능.
문자 하나가 FFFF로 1111 1111이면 문자의 FFFF인지 eof의 -1인지 구분이 안됨.
따라서, int타입으로 승격해서
문자 하나가 FFFF일 때 0000 0000 1111 1111이랑 eof의 1111 1111 1111 1111를 구분할 수 있게 됨.
int read():연결된 파일에서 문자 하나를 읽어서 int타입으로 리턴. 다 읽으면(eof) -1 리턴.
int read(char[]):연결된 파일에서 문자 하나 읽어서 char[]배열에 저장.
int read(char[], int, int):연결된 파일에서 시작 위치부터 해당 길이만큼 읽어서 char[] 배열에 저장.


7.InputStreamReader, OutputStreamWriter
:장치-InputStream or OutputStream - InputStreamReader or OutputStreamWriter로
장치를 직접 연결하지 않고 중간에 바이트 스트림을 연결해 사용한다.

8.(중요)스트림을 다쓰면 습관적으로 close()를 꼭 해주자.
close() 사용시 내가 사용한 스트림 내 자원을 반환하게 된다.
만약, close()를 하지 않았다면 나중에 파일을 쓸 때 제대로 기록이 안될 수 있다.
습관적으로 close() 메서드를 사용하자.

9.(중요)try-catch(IOException e) 사용 이유
-1)FileReader 같이 사용시 파일이 존재하지 않으면 예외를 던진다.
-2)read() 사용시 읽을 수 없는 상황에서는 예외를 던지게 된다.
이때, 예외인 IOException은 CheckedException으로 분류가 된다.
CheckedException은 컴파일 타임에 예외를 처리하도록 강제하는 예외이다.
즉, CheckedException를 발생시키는 코드라면 이것을 코드 안에서 예외 처리하는 코드를
반드시 가지고 있어야 컴파일 에러가 발생하지 않는다.
그러나, 예외처리 코드가 귀찮다면 static void main(String[] args) throws IOException{}으로 상위 스코프로
넘기면 된다.
근데, main에서 throws하면 상위 스코프가 자바가상머신이라 터져버리게 된다.

10.Reader 클래스 내부에
read()메서드가 존재하기 때문에 자식 클래스에서 모두 read()메서드를 사용할 수 있다.

11.(중요)스트림을 여러개 연결해서 사용할 때는
연결된 순서의 역순으로 close()해야한다. 안 그러면 나중에 오작동 할 수 있다.
예를 들면, File-FIS-ISR순으로 연결되었다면 close()할 때는 
ISR-FIS순으로 해야한다.

12.InputStreamReader(InputStream is, ""인코딩 방식)
:InputStreamReader는 인코딩 방식을 지정해야한다.
왜냐하면, 파일을 쓸 때 어떤 규칙에 따라 작성할 것이고, 읽을 때 쓸 때의 규칙이 아닌 다른 규칙으로 읽으면
읽을 수 없게 된다.
따라서, 특수한 상황에서는 인코딩방식을 지정해 파일을 읽으면 된다.

13.
File-FR
File-FIS-ISR
두 가지 방식 모두 괜찮은데
아래쪽 방식은 문자 인코딩 방식 지정이 가능해서 영어나 일본어 등 인코딩 방식 지정이 필요할 때 아래 방식을 사용하면된다.
보통은 아래쪽 방식이 더 편리하다.

14.write()메서드
:write()메서드를 사용하여 문자를 스트림에 집어 넣는다. 그러면 연결된 파일에 스트림이 집어 넣을 것이다.

-write(char[]):char[]배열을 스트림에 집어 넣는다.
-write(char[], int, int)
-write(int):문자 하나를 스트림에 넣는다.
-write(String):String타입도 가능

15.window 환경에서 엔터 입력시 자동으로 마지막에 "\r\n"(2바이트 특수키)을 넣는다.
리눅스, 유닉스, 맥OS:엔터 입력시 마지막에 "\n"(1바이트)만 넣는다.
\n만 넣어도 상관없고 교수님은 \n만 넣는다.

16.DataInputStream or DataOutputStream(OutputStream o)
:DataInputStream or DataOutputStream은 OutputStream과 연결해서 사용한다.
이런 스트림을 보조 스트림이라고 한다.

17.버퍼는 쉽게말해 배열처럼 생각하면 된다.
버퍼가 존재하면 해당 버퍼 크기만큼 운영체제로부터 1바이트씩 가져올 때 쭉 채우다가 다 채우면 한번에 넘겨주게 된다.
따라서, 버퍼 사용하면 운영체제 매번 연결할 필요없이 압도적으로 속도가 빠르다.
그러므로, 스트림 사용시 왠만하면 버퍼 끼고 사용하는 걸 추천한다.

18.버퍼는 배열처럼 동작하기 때문에 우리가 직접 배열을 만들어 버퍼처럼 사용할 수도 있다.
예를 들면, read(char[])처럼 버퍼를 만들어주고 읽어올 수 있는데
그렇게 되면 버퍼에서 자동으로 내부적인 동작과정을 우리가 만들어야 하는 번거로움이 존재한다.
(확인)예를 들면 char[]로 받고 이후 또 받을 때 버퍼같은 경우 내부에 지워주는데 우리는 수동으로 지워야한다.(예제 마지막 문제에 이 개념이 사용된다.)

19.int read(char[])의 리턴값은 내가 읽어들인 바이트 수를 리턴한다.

20.BufferedOutputStream(OutputStream o)
:BufferedOutputStream은 OutputStream을 받아서 사용된다. 즉 장치와 직접 연결해 사용은 불가능하다.

new BufferedOutputStream(System.out, 20)에서 System.out은 printStream의 타입이고 OutputStream으로 업캐스팅 가능하다.
20바이트 크기의 버퍼 생성.
버퍼 크기 지정 안하면 내부적으로 최적화된 버퍼 크기로 생성해준다.
20바이트 채워지면 자동으로 System.out이 출력된다.

21.flush()메서드:현재 버퍼 가득차지 않더라도 현재 버퍼 장치로 모두 출력하는 메서드
out.flush();
fin.close();
out.close();
여기서 out.flush()없더라도 버퍼에 남아있는 모든 문자가 출력 되는데 그 이유가
out.close()에서 내부적으로 자원을 반환하는데 내부적으로 자동으로 flush를 호출해준다.
만약, out.flush()와 out.close()가 없으면 내부 버퍼 출력 안된다.

22.(중요)스트림 사용시 out.flush()랑 close()를 꼭 사용하는 습관 만들자.
안그러면 나중에 캐치하기 매우 어려움.

23.File클래스:
파일명과 디렉터리 경로명.
File객체는 읽고 쓰기 기능 없으니 주의하기.

24.(연습문제 3번)
.isFile()
.isDirectory() 사용해야될 거임.
파일 객체 다룰 때는 사전에 파일인지 디렉토리 정보인지 구분해야된다.

25.(연습문제) .listFiles() : 해당 폴더의 모든 것들을 각각의 파일 객체로 만들어 파일의 배열로 리턴함.
이때, 각 파일객체 내의 내부 폴더에 대한 정보는 주어지지 않는 것을 주의해야한다.
철저하게 직접적으로 디렉터리 정보만 주어진다.

26. f2.exists() : 해당 경로가 존재하는가.
존재하면 true.

if (!f2.exists()){
	f2.mkdir(); 존재 하지 않으면 디렉토리 생성.
}

27.
long t = f.lastModified(); 가장 마지막 수정된 파일.

printf() : %tb %td %ta %tT 월 일 요일 시간 -->시간과 관련된 출력 방법.(기말때 사용하면 됨)

28.FileReader(String 타입)
FileReader(File 타입)


*/