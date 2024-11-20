계산기 과제 (Calculator2 패키지)
1. 개요 : Lv3 계산기 까지 구현하였습니다. 강의에 들어있지 않은 구현하는데 필요한 추가적인 정보는 검색을 통해 찾아 활용하였습니다. 하여 Lv1 계산기는 Calculator1 패키지에, Lv3 계산기는 Calculator2 패키지에 저장하였습니다
   
3. 기능 : CLI 으로 진행하게끔 하였고, 총 4가지 메뉴 계산,조회,삭제,종료 로 구성하여 사용자가 자율적으로 선택하게끔 하였습니다.
   
4. 구조 : 과제의 요구사항인 제네릭 타입의 클래스의 구현과 enum 의 활용에 초점을 두고 중점적으로 코딩하였습니다.
   
   (1) 제네릭 타입 클래스
   먼저 사용자에게 입력받는 연산자 2개의 타입을 각각 정수/정수 정수/실수 실수/정수 실수/실수 4가지로 가정하여 그에 맞게 제네릭 타입 클래스의 생성자도 4개를 만들어두었습니다.
   연산자 2개를 String 타입으로 입력받은 후 Calculator2 내부의 static 메서드를 통해 자동으로 Int형과 Double형을 판별하여 각각 타입에 맞게 변환하여 제네릭 인스턴스에 입력하였습니다.
   내부에서는 계산했을때 출력값이 Int형인 정수/정수 인 경우와 출력값이 Double형인 나머지 경우 2가지로 나누어 각각 따로 계산하는 메서드를 구현했습니다.

   (2) enum
   enum에는 '+','-','*','/' 을 필드값으로 가지는 4개의 상수를 선언하고 초기화시킨후 사용자에게 입력받은 연산자를 각 필드값과 비교하여 그에 맞는 상수값을 반환하는 static 메서드를 구현했습니다.

   (3) 기타
   클래스를 추가적으로 만들어 결과값들을 관리할 큐와 특정 조건을 만족하는 값을 가져오는 Getter와 Setter, 그리고 삭제하는 메서드를 담아두었고 메인에서도 따로 인스턴스를 생성해서 관리하였습니다.
   
5. 추가사항 : 대략적으로 완성한 후에는 모듈의 결합도를 낮추기 위해서 SRP 원칙에 의거하여 그에 맞게 클래스들을 최대한 세분화 하여 분리시키는데에 초점을 맞추었습니다. 그로 인해 이전보다
   가독성이 높아지고 유지보수성이 향상 되었음을 확실히 체감하게 되었습니다.
