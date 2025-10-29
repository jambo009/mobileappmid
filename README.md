# 모바일앱실습 
# 202511002 성민준



---

## 🧭 Overview

Jetpack Compose를 활용한 안드로이드 UI 실습 과정을 정리한 프로젝트입니다.  
기본적인 레이아웃 구조부터 상태 관리, 비동기 처리, 터치 이벤트, 간단한 게임 로직까지  
Compose의 주요 기능들을 직접 구현하며 학습한 내용을 기록했습니다.

---



# 📱 Jetpack Compose UI 실습
### Android Studio · Kotlin · Jetpack Compose
### Android Studio를 활용한 UI 실습  (W03 ~ W07)

---


## Week 03 · Compose 기본 구조 & 데이터 바인딩

### ☕ ComposeCoffee  
<img width="362" height="648" alt="image" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd4" />

**주요 구현 내용**  
- Column, Row, Spacer를 이용한 세로 및 가로 정렬  
- Modifier.padding을 적용해 일관된 여백 구성  
- Button의 onClick을 준비해 이벤트 처리 구조 설계  


**핵심 학습 포인트**  
기본 레이아웃 구성 요소의 활용법을 익히고, Modifier로 세밀한 간격 조정이 가능함을 이해함.

---

### 💌 KakaoEmail  
<img width="354" height="639" alt="image" src="https://github.com/user-attachments/assets/8ece48ea-1cac-416e-a660-60e89ed04630" />

**주요 구현 내용**  
- OutlinedTextField로 사용자 입력 필드 구현  
- remember { mutableStateOf("") }로 상태(State) 관리  
- 상태 변경 시 UI 자동 갱신  


**핵심 학습 포인트**  
데이터 상태 변화가 화면에 즉시 반영되는 Compose의 상태 기반 UI 구조를 이해함.

---

## W04: 복잡한 레이아웃 설계 & 구성

### 🖼️ Grid Layout  
<img width="358" height="652" alt="image" src="https://github.com/user-attachments/assets/4c36d6d7-9dc6-461b-b4cc-e7c0a1599cb4" />
<img width="352" height="635" alt="image" src="https://github.com/user-attachments/assets/d53dec53-4864-4d0d-9695-7b8513f3aef6" />

**주요 구현 내용**  
- LazyVerticalGrid를 이용해 이미지 그리드 생성  
- Lazy Composable로 필요한 요소만 렌더링하여 성능 최적화  


**핵심 학습 포인트**  
대량 데이터를 효율적으로 표시하는 Lazy 레이아웃의 원리를 이해함.

---

### 🔢 Keypad Layout  
<img width="357" height="648" alt="image" src="https://github.com/user-attachments/assets/133506f3-0d6f-491f-b836-ad4eb07d6a35" />

**주요 구현 내용**  
- Row와 Column을 조합해 키패드 구조 구성  
- Modifier.weight로 균등 비율 배치  


**핵심 학습 포인트**  
다양한 해상도에서도 일관된 비율을 유지하는 반응형 레이아웃 설계 능력 향상.

---

### 🎨 Overlapped Layout  
<img width="355" height="640" alt="image" src="https://github.com/user-attachments/assets/682b7663-feea-4868-b243-20a08cb0c7d1" />

**주요 구현 내용**  
- Box를 이용한 겹침 구조 구현  
- Modifier.offset으로 요소의 세부 위치 조정  


**핵심 학습 포인트**  
Z축 개념을 활용한 겹침 효과와 입체적인 UI 구성 방식 습득.

---

## W05: 상태 관리 & 실시간 상호작용

### 🔢 Counter  
<img width="356" height="641" alt="image" src="https://github.com/user-attachments/assets/0098a337-766b-4a57-8f8b-34f9883a23dd" />

**주요 구현 내용**  
- mutableStateOf로 카운터 값 관리  
- 버튼 클릭 시 상태 변경 → UI 자동 업데이트  


**핵심 학습 포인트**  
단방향 데이터 흐름(Unidirectional Data Flow)의 구조를 이해하고,  
상태 변화에 따라 UI가 자동으로 갱신되는 Compose의 특징을 체험함.

---

### ⏱️ Stopwatch  
<img width="360" height="640" alt="image" src="https://github.com/user-attachments/assets/97e5e0cc-dd88-45c2-99ad-5a386964b662" />

**주요 구현 내용**  
- LaunchedEffect와 delay를 사용한 비동기 타이머 구현  
- isRunning 상태로 시작/정지 제어  


**핵심 학습 포인트**  
Coroutine을 활용한 비동기 로직 적용과, UI 반응성을 유지하는 구조 학습.

---

### ✋ Touch  
<img width="357" height="640" alt="image" src="https://github.com/user-attachments/assets/f3fbb693-c6f4-406a-94e2-0b4933a76684" />
<img width="359" height="646" alt="image" src="https://github.com/user-attachments/assets/afce3bd3-ab56-462a-81ac-1542595e08a1" />

**주요 구현 내용**  
- Modifier.pointerInput으로 터치 이벤트 감지  
- Canvas를 이용한 드로잉 기능 구현  
- 현재 색상 상태를 별도로 관리  


**핵심 학습 포인트**  
터치 입력을 실시간으로 처리하는 로우 레벨 인터랙션 구현 능력 향상.

---

## W06 ~ W07: 게임 로직 & 상태 결합

### 🫧 Bubble Game  
<img width="354" height="636" alt="image" src="https://github.com/user-attachments/assets/63c40633-512f-47ca-83bd-5b734633ecb4" />

**주요 구현 내용**  
- 버블을 데이터 클래스로 정의하고 List<Bubble>로 상태 관리  
- 터치 시 해당 버블을 제거하며 상태 갱신  


**핵심 학습 포인트**  
UI와 데이터 모델을 결합하여, 사용자 입력에 따라 상태가 동적으로 변하는 게임 구조 구현.

---

### 🎯 Stopwatch Game  
<img width="360" height="642" alt="image" src="https://github.com/user-attachments/assets/dc6ec1fe-9ab2-477d-b56e-c7c6981c5c08" />

**주요 구현 내용**  
- 목표 시간과 실제 클릭 시간의 차이를 계산  
- 오차에 따라 결과 메시지를 분기 처리  


**핵심 학습 포인트**  
여러 상태 변수를 통합적으로 관리하며, 조건부 렌더링으로 실시간 반응형 UI 구현 능력 강화.

---

## 🧠 전체 소감

Jetpack Compose를 처음 다루면서 기존 XML 방식과의 차이를 많이 느낌.  
상태 기반 UI의 개념이 처음엔 낯설었지만, 점점 데이터와 화면이 자연스럽게 연결되는 구조가 익숙해짐.  

특히 `remember`, `mutableStateOf`, `LaunchedEffect`, `pointerInput` 등을 사용하면서  
단순히 화면을 그리는 것이 아니라 **상태 변화에 반응하는 인터랙티브한 UI**를 만들 수 있게 됨.  

이번 실습을 통해 Compose의 핵심 철학인  
**“상태와 UI가 함께 움직이는 선언형 프로그래밍”**의 장점을 확실히 체험함.

# Simple Grid: Jetpack Compose 실습 

## 프로젝트 개요

Simple Grid는 Jetpack Compose를 활용해 4x4 격자를 표시하고, 단일 버튼으로 전체 상호작용을 제어하는 앱.  
상태 중심 설계와 단방향 데이터 흐름 원리를 직접 경험하고 이해하는 게 목표.  

사용자는 '상호작용 시작/종료' 버튼으로 클릭 기능을 단일 상태 변수로 제어하고, UI가 상태 변화에 따라 어떻게 반응하는지 확인 가능.

---

## 핵심 성과 및 기술적 생각

### 1. 중앙 집중식 상태 관리와 단방향 데이터 흐름

`isInteractionEnabled` 변수 하나로 다음을 동시에 제어

- 버튼 색상/텍스트  
- 그리드 셀 클릭 가능 여부  
- 셀 시각적 alpha  

중앙 집중식 상태 관리로 데이터 흐름 예측 가능, 코드 안정성과 유지보수성 향상.

### 2. 안정적인 그리드 레이아웃 구현

Column과 Row, Modifier.weight 활용해 화면 크기와 관계없이 16개 셀 동일 비율 유지.  
GridCell을 RowScope 확장 함수로 정의해 Modifier.weight 오류 방지.  
Compose에서 스코프와 Modifier 활용 중요성 체득.

### 3. 현실적인 UX 설계

- 비활성화 시 alpha 값 낮춰 클릭 불가 상태 시각화  
- Box와 Modifier 조합으로 안정적인 앱 구현  

---

UI 작동 예시
1. 비활성화 상태

<img width="357" height="637" alt="image" src="https://github.com/user-attachments/assets/bef8e4e7-425d-41dc-8367-ab770a361aaa" />


모든 셀 회색조, 클릭 불가

버튼 초록색, '상호작용 시작'

2. 활성화 상태

<img width="356" height="639" alt="image" src="https://github.com/user-attachments/assets/73ba145d-c248-44c1-96ca-7c08c94e8523" />


클릭한 셀 무작위 밝은 색 변경

버튼 빨간색, '상호작용 종료'

학습 포인트

단일 상태로 Compose UI 효율적 제어

RowScope 확장으로 안정적 레이아웃 구성

단순 직관 UX 설계로 유지보수성 확보

주요 구현 내용

Column, Row, Spacer를 이용한 세로/가로 정렬

Modifier.padding으로 일관된 여백 구성

Button onClick 이벤트 처리 구조 설계

핵심 학습 포인트

기본 레이아웃 구성 요소 활용법 이해, Modifier로 세밀한 간격 조정 가능성 습득
