# 모바일앱실습 202511002 
# 성민준


# Jetpack Compose UI 실습
### Android Studio · Kotlin · Jetpack Compose

---

## 🧭 Overview

Jetpack Compose를 활용한 안드로이드 UI 실습 과정을 정리한 프로젝트입니다.  
기본적인 레이아웃 구조부터 상태 관리, 비동기 처리, 터치 이벤트, 간단한 게임 로직까지  
Compose의 주요 기능들을 직접 구현하며 학습한 내용을 기록했습니다.

---

## Week 03 · Compose 기본 구조 & 데이터 바인딩

### ☕ ComposeCoffee  
<img width="362" height="648" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd4" />

**주요 구현 내용**  
- Column, Row, Spacer를 이용한 세로 및 가로 정렬  
- Modifier.padding을 적용해 일관된 여백 구성  
- Button의 onClick을 준비해 이벤트 처리 구조 설계  

**핵심 학습 포인트**  
기본 레이아웃 구성 요소의 활용법을 익히고, Modifier로 세밀한 간격 조정이 가능함을 이해함.

---

### 💌 KakaoEmail  
<img width="354" height="639" src="https://github.com/user-attachments/assets/8ece48ea-1cac-416e-a660-60e89ed04630" />

**주요 구현 내용**  
- OutlinedTextField로 사용자 입력 필드 구현  
- remember { mutableStateOf("") }로 상태(State) 관리  
- 상태 변경 시 UI 자동 갱신  

**핵심 학습 포인트**  
데이터 상태 변화가 화면에 즉시 반영되는 Compose의 상태 기반 UI 구조를 이해함.

---

## Week 04 · 복잡한 레이아웃 설계 & 모듈화

### 🖼️ Grid Layout  
<img width="358" height="652" src="https://github.com/user-attachments/assets/4c36d6d7-9dc6-461b-b4cc-e7c0a1599cb4" />
<img width="352" height="635" src="https://github.com/user-attachments/assets/d53dec53-4864-4d0d-9695-7b8513f3aef6" />

**주요 구현 내용**  
- LazyVerticalGrid를 이용해 이미지 그리드 생성  
- Lazy Composable로 필요한 요소만 렌더링하여 성능 최적화  

**핵심 학습 포인트**  
대량 데이터를 효율적으로 표시하는 Lazy 레이아웃의 원리를 이해함.

---

### 🔢 Keypad Layout  
<img width="357" height="648" src="https://github.com/user-attachments/assets/133506f3-0d6f-491f-b836-ad4eb07d6a35" />

**주요 구현 내용**  
- Row와 Column을 조합해 키패드 구조 구성  
- Modifier.weight로 균등 비율 배치  

**핵심 학습 포인트**  
다양한 해상도에서도 일관된 비율을 유지하는 반응형 레이아웃 설계 능력 향상.

---

### 🎨 Overlapped Layout  
<img width="355" height="640" src="https://github.com/user-attachments/assets/682b7663-feea-4868-b243-20a08cb0c7d1" />

**주요 구현 내용**  
- Box를 이용한 겹침 구조 구현  
- Modifier.offset으로 요소의 세부 위치 조정  

**핵심 학습 포인트**  
Z축 개념을 활용한 겹침 효과와 입체적인 UI 구성 방식 습득.

---

## Week 05 · 상태 관리 & 실시간 상호작용

### 🔢 Counter  
<img width="356" height="641" src="https://github.com/user-attachments/assets/0098a337-766b-4a57-8f8b-34f9883a23dd" />

**주요 구현 내용**  
- mutableStateOf로 카운터 값 관리  
- 버튼 클릭 시 상태 변경 → UI 자동 업데이트  

**핵심 학습 포인트**  
단방향 데이터 흐름(Unidirectional Data Flow)의 구조를 이해하고,  
상태 변화에 따라 UI가 자동으로 갱신되는 Compose의 특징을 체험함.

---

### ⏱️ Stopwatch  
<img width="360" height="640" src="https://github.com/user-attachments/assets/97e5e0cc-dd88-45c2-99ad-5a386964b662" />

**주요 구현 내용**  
- LaunchedEffect와 delay를 사용한 비동기 타이머 구현  
- isRunning 상태로 시작/정지 제어  

**핵심 학습 포인트**  
Coroutine을 활용한 비동기 로직 적용과, UI 반응성을 유지하는 구조 학습.

---

### ✋ Touch & Draw  
<img width="357" height="640" src="https://github.com/user-attachments/assets/f3fbb693-c6f4-406a-94e2-0b4933a76684" />
<img width="359" height="646" src="https://github.com/user-attachments/assets/afce3bd3-ab56-462a-81ac-1542595e08a1" />

**주요 구현 내용**  
- Modifier.pointerInput으로 터치 이벤트 감지  
- Canvas를 이용한 드로잉 기능 구현  
- 현재 색상 상태를 별도로 관리  

**핵심 학습 포인트**  
터치 입력을 실시간으로 처리하는 로우 레벨 인터랙션 구현 능력 향상.

---

## Week 06 ~ 07 · 게임 로직 & 상태 결합

### 🫧 Bubble Game  
<img width="354" height="636" src="https://github.com/user-attachments/assets/63c40633-512f-47ca-83bd-5b734633ecb4" />

**주요 구현 내용**  
- 버블을 데이터 클래스로 정의하고 List<Bubble>로 상태 관리  
- 터치 시 해당 버블을 제거하며 상태 갱신  

**핵심 학습 포인트**  
UI와 데이터 모델을 결합하여, 사용자 입력에 따라 상태가 동적으로 변하는 게임 구조 구현.

---

### 🎯 Stopwatch Game  
<img width="360" height="642" src="https://github.com/user-attachments/assets/dc6ec1fe-9ab2-477d-b56e-c7c6981c5c08" />

**주요 구현 내용**  
- 목표 시간과 실제 클릭 시간의 차이를 계산  
- 오차에 따라 결과 메시지를 분기 처리  

**핵심 학습 포인트**  
여러 상태 변수를 통합적으로 관리하며, 조건부 렌더링으로 실시간 반응형 UI 구현 능력 강화.

---


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
