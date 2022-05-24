## 자판기 제품 요구사항
### 음료수를 뽑는다
- 자판기는 금액 표시란에 입력된 금액(총액)을 보여준다.
- 고객이 자판기에 동전을 더 넣으면, 자판기는 금액을 증가시키고, 금액란에 총액을 보여준다.
- 표시된 총금액이 고객이 원하는 음료수의 가격과 같거나 더 많을 때,  
  고객은 음료수 버튼을 누르고 음료수를 선택할 수 있다.
- 고객이 원하는 음료수에 대한 버튼을 누를 때, 자판기는 음료수를 제공한다.
- 음료수가 제공된 후, 자판기는 현재 총액에서 음료수의 가격을 뺸 나머지 수정된 총액을 보여준다.
- 고객은 잔돈 회수 버튼을 누르고, 자판기는 금액 표시란에 보이는 총액과 같은 금액을 되돌려 준다.
- 마지막으로 자판기는 거래를 기록한다. 고객에게 제공된 음료수의 총 양을 증가시키고, 고객에게 \
  지출된 거스름돈 양만큼 거스름돈의 총액을 감소시킨다.

### 하루 동안의 음료수 거래량을 출력한다
- 관리자가 열 때 시작된다. 관리자는 암호를 입력한 후, 시스템 모드 스위치를 `관리` 로 설정한다.
- 관리자는 그날의 거래 보고서를 얻기 위해 변환 설정 버튼을 `거래량 출력`으로 놓는다. \
  그날 고객에게 제공된 음료수의 종류별 숫자와 각 음료수에 대한 매출액, 그리고 그날 팔린 \
  음료수의 총 금액을 포함한 정보가 출력된다.
- 관리자는 음료수의 숫자와 총 양을 초기화 시킨다.
- 마지막으로 관리자는 시스템 모드 스위치를 `운영`으로 설정하고 자판기를 잠근다.

### 음료수 가격을 바꾼다.
- 이 기능은 관리자가 열 떄 시작된다.
- 관리자는 암호를 입력한 후 시스템 모드 스위치를 `관리` 로 설정한다.
- 관리자는 음료수의 가격을 바꾸기 위해 변환 설정 버튼을 `음료수 가격 변환`으로 넣는다.
- 관리자는 음료수의 종류와 새로운 가격을 입력한다.
- 마지막으로 관리자느 시스템 모드 스위치를 `운영`으로 설정하고 자판기를 잠근다.



### draw.io
[https://app.diagrams.net/#G1RZ5ha8XBF10R33p4uVCIcujDG-qeBpUi](https://drive.google.com/file/d/1RZ5ha8XBF10R33p4uVCIcujDG-qeBpUi/view?usp=sharing)
