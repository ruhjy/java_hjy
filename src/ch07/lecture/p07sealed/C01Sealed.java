package ch07.lecture.p07sealed;

public class C01Sealed {

}


// sealed class : 특정 클래스만 상속 허용
sealed class Super01 permits Sub011, Sub012 { }

// sealed class를 상속한 클래스는 final로 선언
final class Sub011 extends Super01 { }
final class Sub012 extends Super01 { }

// 안됨
final class Sub013 extends Super01 { }