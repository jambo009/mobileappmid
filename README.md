모바일앱실습 202511002 
성민준


# 📱 Jetpack Compose UI 실습 리포트
### Android Studio를 활용한 UI 실습 정리 (W03 ~ W07)

---

## W03: Compose 기본 구조 & 데이터 바인딩 이해

### ☕ ComposeCoffee  
<img width="362" height="648" alt="image" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd4" />

**구현 내용**  
- `Column`, `Row`, `Spacer`를 이용해 UI 요소를 세로와 가로로 정렬  
- `Modifier.padding()`을 사용해 일정한 여백 적용  
- `Button`의 `onClick`을 준비하여 클릭 이벤트 구조 설계  

**배운 점**  
기본적인 레이아웃 구성 방법과 Modifier를 활용한 간격 조정 방법을 익혔습니다.  
Compose의 기본 레이아웃 원리를 이해하는 데 도움이 되었습니다.

---

### 💌 KakaoEmail  
<img width="354" height="639" alt="image" src="https://github.com/user-attachments/assets/8ece48ea-1cac-416e-a660-60e89ed04630" />

**구현 내용**  
- `OutlinedTextField`를 이용한 사용자 입력 필드 구현  
- `remember { mutableStateOf("") }`로 입력 상태를 관리  
- 입력 시 상태가 자동 갱신되어 UI에 즉시 반영  

**배운 점**  
Jetpack Compose의 핵심 개념인 **상태 기반 UI 갱신(State-driven UI)** 구조를 이해했습니다.  
데이터 상태가 바뀌면 자동으로 화면이 변경되는 선언형 방식에 익숙해졌습니다.

---

## W04: 복잡한 레이아웃 설계 & 구성

### 🖼️ Grid Layout  
<img width="358" height="652" alt="image" src="https://github.com/user-attachments/assets/4c36d6d7-9dc6-461b-b4cc-e7c0a1599cb4" />
<img width="352" height="635" alt="image" src="https://github.com/user-attachments/assets/d53dec53-4864-4d0d-9695-7b8513f3aef6" />

**구현 내용**  
- `LazyVerticalGrid`를 사용하여 여러 이미지를 스크롤 가능한 형태로 표시  
- Lazy Composable을 통해 보이는 영역만 렌더링되어 성능 최적화  

**배운 점**  
대량의 데이터를 효율적으로 처리할 수 있는 **Lazy 로딩 방식**의 원리를 이해했습니다.

---

### 🔢 Keypad Layout  
<img width="357" height="648" alt="image" src="https://github.com/user-attachments/assets/133506f3-0d6f-491f-b836-ad4eb07d6a35" />

**구현 내용**  
- Row와 Column을 조합하여 키패드 구조 생성  
- `Modifier.weight()`로 각 버튼이 동일한 비율을 차지하도록 설정  

**배운 점**  
다양한 해상도의 기기에서도 일관된 비율로 보이는 **반응형 UI 설계** 방법을 익혔습니다.

---

### 🎨 Overlapped Layout  
<img width="355" height="640" alt="image" src="https://github.com/user-attachments/assets/682b7663-feea-4868-b243-20a08cb0c7d1" />

**구현 내용**  
- `Box`를 사용해 UI 요소를 겹쳐 배치  
- `Modifier.offset()`으로 개별 요소의 위치를 세밀하게 조정  

**배운 점**  
겹치는 UI 구성과 z축 개념을 이해하고, 입체적인 화면 구성을 구현할 수 있었습니다.

---

## W05: 상태 관리 & 실시간 상호작용

### 🔢 Counter  
<img width="356" height="641" alt="image" src="https://github.com/user-attachments/assets/0098a337-766b-4a57-8f8b-34f9883a23dd" />

**구현 내용**  
- `mutableStateOf`로 카운터 값을 상태로 관리  
- 버튼 클릭 시 상태가 변경되며 UI가 자동 갱신  

**배운 점**  
Compose의 **단방향 데이터 흐름(Unidirectional Data Flow)** 개념을 이해했습니다.  
상태 변화가 UI에 직접 반영되는 구조를 체험했습니다.

---

### ⏱️ Stopwatch  
<img width="360" height="640" alt="image" src="https://github.com/user-attachments/assets/97e5e0cc-dd88-45c2-99ad-5a386964b662" />

**구현 내용**  
- `LaunchedEffect`와 `delay()`를 활용한 비동기 타이머 구현  
- `isRunning` 상태로 시작/정지 제어  

**배운 점**  
Coroutine을 이용한 비동기 로직을 Compose에 적용해, UI를 멈추지 않고 동작하도록 구현했습니다.

---

### ✋ Touch & Draw  
<img width="357" height="640" alt="image" src="https://github.com/user-attachments/assets/f3fbb693-c6f4-406a-94e2-0b4933a76684" />
<img width="359" height="646" alt="image" src="https://github.com/user-attachments/assets/afce3bd3-ab56-462a-81ac-1542595e08a1" />

**구현 내용**  
- `Modifier.pointerInput`으로 터치 이벤트 감지  
- Canvas를 이용해 드래그 경로를 실시간으로 그림  
- 색상 선택 상태를 별도 변수로 관리  

**배운 점**  
터치 이벤트를 직접 다루며, 사용자의 입력이 즉시 반영되는 **직접 조작형 인터랙션**을 구현했습니다.

---

## W06 ~ W07: 게임 로직 & 상태 결합

### 🫧 Bubble Game  
<img width="354" height="636" alt="image" src="https://github.com/user-attachments/assets/63c40633-512f-47ca-83bd-5b734633ecb4" />

**구현 내용**  
- 버블 객체를 데이터 클래스로 관리  
- 터치 시 해당 버블을 제거하며 상태 갱신  

**배운 점**  
UI와 데이터 모델을 결합해 **상호작용 중심의 게임 로직**을 구현할 수 있었습니다.

---

### 🎯 Stopwatch Game  
<img width="360" height="642" alt="image" src="https://github.com/user-attachments/assets/dc6ec1fe-9ab2-477d-b56e-c7c6981c5c08" />

**구현 내용**  
- 목표 시간과 실제 클릭 시간의 차이를 계산  
- 오차에 따라 결과 메시지를 분기 처리  

**배운 점**  
여러 상태 변수를 동시에 관리하면서 조건에 따라 화면을 다르게 렌더링하는 방법을 배웠습니다.  
Compose의 상태 관리 구조를 실감할 수 있는 실습이었습니다.

---

## 🧠 전체 소감

Jetpack Compose를 처음 다루면서 기존 XML 방식과의 차이를 많이 느꼈습니다.  
상태 기반 UI의 개념이 처음엔 낯설었지만, 점점 데이터와 화면이 자연스럽게 연결되는 구조가 익숙해졌습니다.  

특히 `remember`, `mutableStateOf`, `LaunchedEffect`, `pointerInput` 등을 사용하면서  
단순히 화면을 그리는 것이 아니라 **상태 변화에 반응하는 인터랙티브한 UI**를 만들 수 있게 되었습니다.  

이번 실습을 통해 Compose의 핵심 철학인  
**“상태와 UI가 함께 움직이는 선언형 프로그래밍”**의 장점을 확실히 체험했습니다.



myapp(자신만의 앱)에대한소개

Simple Grid: Jetpack Compose 기반 상태 관리 실습 

'Simple Grid'는 단순히 화면에 격자를 보여주는 앱을 넘어, Jetpack Compose의 핵심인 반응성과 상태 관리를 직접 구현해보고 그 원리를 체득하는 데 초점을 맞춘 과제입니다. 4x4 그리드를 만들고, 최근에 추가한 '시작/종료' 버튼 하나로 전체 그리드의 클릭 상호작용을 제어하는 방식을 통해, Compose가 UI를 얼마나 효율적으로 관리하는지 깊이 있게 이해할 수 있었습니다. 단순 기능 구현을 넘어, 상태(State)가 앱의 중심이 되는 설계 방식을 체화하는 것이 목표였습니다.

프로젝트 핵심 

1. 앱의 중심: 단일 상태로 전체 UI 통제하기

중앙 집중식 제어의 중요성: 앱 전체의 핵심 기능(클릭 활성화)을 isInteractionEnabled라는 단 하나의 mutableStateOf 변수로 관리했습니다.

개발 경험: 처음에 각 셀의 상태를 따로 관리할까도 고민했지만, 이렇게 상태를 중앙에 몰아두니 코드가 훨씬 깔끔해지고, 버튼 하나로 ① 버튼 자체의 색상/텍스트와 ② 16개 셀의 클릭 가능 여부를 동시에 바꿀 수 있어 직관적이었습니다.

배운 점: 여러 컴포넌트에 흩어져 있는 상태를 한 곳에서 관리하는 것이 왜 Compose의 **단방향 데이터 흐름(UDF)**에서 중요한 원칙인지 실제로 깨닫게 되었습니다.

2. 까다로웠던 레이아웃 문제, 안정성으로 해결

균일한 그리드 목표: 화면 크기가 바뀌어도 셀들이 찌그러지지 않고 완벽하게 동일한 비율을 유지하는 4x4 그리드 레이아웃을 Column과 Row, 그리고 Modifier.weight(1f)를 조합해 구현했습니다.

오류와의 싸움 (가장 힘들었던 부분): 개발 과정 중 가장 시간이 오래 걸렸던 부분은 Modifier.weight 관련 오류였습니다. 컴파일러가 weight를 올바른 레이아웃 스코프 함수로 인식하지 못하고 일반 변수로 자꾸 오인하는 문제가 있었습니다.

최종 해결책: GridCell 컴포저블을 RowScope의 확장 함수로 명시하여, weight(1f)가 정확한 컨텍스트(스코프) 안에서 실행되도록 강제했습니다. 이 경험은 Compose에서 Modifier의 역할과 스코프 개념을 깊이 이해하는 데 결정적인 도움이 되었습니다.

3. 사용자 경험을 고려한 현실적인 설계

유지보수 우선: 불필요하게 복잡한 애니메이션이나 불안정한 내부 코드는 모두 피하고, 가장 기본적이면서도 안정적인 Box + Modifier 조합을 사용했습니다. 팀 작업이나 향후 유지보수를 고려할 때, **'작동하는 코드'**가 **'화려한 코드'**보다 훨씬 중요하다는 점을 배웠습니다.

친절한 UX: 상호작용을 '종료'했을 때, 셀에 단순히 클릭만 막는 것이 아니라 Modifier.alpha(0.5f)를 연동해 투명도를 낮춰서 "지금은 클릭이 안 됩니다"라는 상태를 시각적으로 명확하게 알려주도록 디자인했습니다.

4. 기술 스택 요약 및 주요 코드 사용 예시

<img width="1083" height="348" alt="image" src="https://github.com/user-attachments/assets/ab1806fc-0aee-4cd6-aedc-95b720831450" />


UI 화면 이미지

이 섹션에는 앱의 두 가지 주요 상태를 시각적으로 보여주는 이미지를 삽입하는 것이 가장 효과적입니다.

비활성화 상태 이미지 (시작 버튼):

설명: 그리드 셀들은 모두 비활성화된 기본 색상(어두운 회색)을 유지하며, 투명도(alpha)가 낮아져 상호작용 불가능 상태임을 명확히 보여줍니다.

하단 버튼: 초록색(PrimaryColor)으로 '상호작용 시작 (Start)' 텍스트가 표시됩니다.

<img width="372" height="676" alt="image" src="https://github.com/user-attachments/assets/fdc7076e-8bd3-4164-8ea0-9bf5e99a79ff" />


활성화 상태 이미지 (종료 버튼):

설명: 그리드 셀 중 몇 개가 클릭되어 무작위의 밝은 색상(청록, 빨강, 노랑 등)으로 변경된 상태입니다. 이는 앱의 핵심 기능인 동적 상호작용이 활성화되었음을 시연합니다.

하단 버튼: 빨간색(AccentColor)으로 '상호작용 종료 (Stop)' 텍스트가 표시됩니다.

<img width="389" height="665" alt="image" src="https://github.com/user-attachments/assets/9d1990dc-4e7b-4d38-a42a-46970e365e7d" />
