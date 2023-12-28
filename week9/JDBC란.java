/*
-JDBC(Java Database Connectivity): 자바에서 DB프로그래밍을 하기 위해 사용되는 API. 자바 프로그램이 DB와 연결되어 데이터를 주고 받을 수 있게 해주는 프로그래밍 인터페이스이다.
    -Java 기반 애플리케이션의 데이터를 데이터베이스에 저장 및 업데이트하거나, 데이터베이스에 저장된 데이터를 Java에서 사용할 수 있도록 하는 자바 API
    -역할: 통역자의 역할-응용프로그램과 DBMS간의 통신을 중간에서 번역해주는 역할을 함
    -데이터베이스에서 자료를 쿼리(Query)하거나 업데이트하는 방법을 제공한다.
    - Java 애플리케이션에서 데이터베이스에 접근하기 위해 JDBC API를 사용하여 데이터베이스에 연동할 수 있디.
    -JDBC는 3가지 기능을 표준 인터페이스로 정의하여 제공한다.
        1. java.sql.Connection - 연결 (데이터베이스의 위치(URL)를 알아야 함 -> port번호 -> db 이름 지정 -> 보안(id/pw))
            -> conn(커넥션 객체가 생성됨)
        2. java.sql.Statement - SQL을 담은 내용(SQL 쿼리와 관련된 명령어를 전달/받기)
            -편의를 위해 Statement 말고 PreparedStatement를 사용하기도 함.
            -Create
            -Read
            -Update
            -Delete
        3. -C,U,D = executeUpdate()
           -R = executeQuery()
        -java.sql.ResultSet - SQL 요청 응답

-JDBC 라이브러리: 자바는 데이터베이스와 연결해서 데이터 입출략 작업을 할 수 있도록 JSBC 라이브러리 패키지를 제공
    -드라이버들을 통해 데이터베이스를 통제한다.

-DB 연결 lib 외부에서 class 동적

-priject -> sw 구성하는 모든 리소스 모음
    -프로젝트를 빌드하면 소프트웨어가 하나 생기는거임
    -IDE -> Ant 방식 사용: 외부 파일(lib) jar 파일 imbed
            Mavem: local repository 참조
                -pom.xml 파일-> 의존성 설정
            Gradle: .gradle -> groovy

-JDBC 동작 흐름: java 애플리케이션->JDBC API->JDBC 드라이버->데이터베이스
    -JDBC API를 사용하기 위해서는 JDBC 드라이버를 먼저 로딩한 후 데이터베이스와 연결하게 된다.
    -JDBC API 사용 흐름: JDBC 드라이버 로딩->Connection 객체 생성->Statement 객체 생성->Query 실행->ResultSet 객체로부터 데이터 조회->ResultSet, Statement, Connection 객체들의 Close
        -JDBC 드라이버 로딩: 사용하고자 하는 JDBC 드라이버를 로딩한다. JDBC 드라이버는 DriverManager 클래스를 통해 로딩된다.
        -Connection 객체 생성: JDBC 드라이버가 정상적으로 로딩되면 DriverManager를 통해 데이터베이스와 연결되는 세션(Session)인 Connection 객체를 생성한다.
        -Statement 객체 생성: Statement 객체는 작성된 SQL 쿼리문을 실행하기 위한 객체로 정적 SQL 쿼리 문자열을 입력으로 가진다.
        -Query 실행: 생성된 Statement 객체를 이용하여 입력한 SQL 쿼리를 실행한다.
        -ResultSet 객체로부터 데이터 조회: 실행된 SQL 쿼리문에 대한 결과 데이터 셋이다.
        -ResultSet, Statement, Connection 객체들의 Close: JDBC API를 통해 사용된 객체들은 생성된 객체들을 사용한 순서의 역순으로 Close 한다.

        -JDBC 드라이버: 각 DBSM(Database Management System:데이터베이스 관리 시스템)에 알맞는 클라이언트(네트워크를 통하여 서버라는 다른 컴퓨터 시스템 상의 원격 서비스에 접속할 수 있는 응용 프로그램이나 서비스)
            -DBMA와의 통신을 담당하는 자바 클래스
            -Oracle, MS SQL, MySQL 등과 같은 데이터베이스에 알맞은 JDBC 드라이버를 구현하여 제공
            -JDBC 드라이버의 구현체를 이용해서 특정 벤더의 데이터베이스에 접근할 수 있음

-커넥션 풀(Connection Pool): Connection 객체를 미리 생성하여 보관하고 애플리케이션이 필요할 때 꺼내서 사용할 수 있도록 관리해 주는 것이 Connection Pool이다.

*/