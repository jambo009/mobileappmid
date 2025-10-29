# 모바일앱실습 
# 202511002 성민준


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


# 📱 Simple Grid  
### Jetpack Compose 기반 상태 관리 실습 프로젝트  

---

## 🧩 프로젝트 개요  

Simple Grid는 단순히 격자를 표시하는 앱이 아니라,  
Jetpack Compose의 핵심 원리인 상태 관리(State Management)와 반응형 UI 구조를 직접 구현하며 이해하기 위한 실습 프로젝트이다.  

4x4 형태의 격자를 만들고, 시작 / 종료 버튼 하나로 전체 상호작용을 제어하는 구조를 통해  
Compose가 UI를 얼마나 효율적으로 관리하는지 직접 체험했다.  

이 프로젝트의 목표는 단순한 기능 구현이 아니라  
앱의 중심은 상태(State)이며, UI는 그 상태를 반영한다는 Compose의 철학을 실제 코드로 체화하는 것이었다.

---

## ⚙️ 핵심 구현 포인트  

### 1️⃣ 단일 상태로 전체 UI 통제  

앱 전체의 활성화 여부를 isInteractionEnabled라는 단일 mutableStateOf 변수로 관리했다.  

- 모든 셀은 이 변수의 값에 따라 클릭 가능 여부가 결정된다.  
- 하단의 버튼은 동일한 상태를 기반으로  
  - 텍스트(Start ↔ Stop)  
  - 색상(초록 ↔ 빨강)  
  을 동시에 변경한다.  

초기에는 각 셀의 상태를 따로 관리하려 했지만,  
중앙에서 단일 상태로 제어하니 구조가 훨씬 단순해졌고,  
버튼 하나로 전체 UI의 동작이 즉시 반영되는 Compose의 단방향 데이터 흐름(Unidirectional Data Flow)을 자연스럽게 이해할 수 있었다.

---

### 2️⃣ 균일한 그리드 구성과 Modifier 안정성  

화면 크기나 비율이 달라도 항상 동일한 크기의 4x4 셀을 유지하는 정비율 그리드 레이아웃을 구현했다.  

- Column과 Row를 계층적으로 배치하고  
- 각 셀에 Modifier.weight(1f)를 부여해 균등 비율을 유지했다.  

초기에는 Modifier.weight가 인식되지 않는 오류가 발생했는데,  
이는 Composable의 스코프(Scope) 문제였다.  
GridCell을 RowScope의 확장 함수로 선언함으로써  
weight(1f)가 올바른 컨텍스트에서 실행되도록 해결했다.  

이 과정을 통해 Modifier의 작동 원리와 Compose의 스코프 구조를 깊이 있게 이해할 수 있었다.

---

### 3️⃣ UX 중심의 실용적 설계  

과도한 애니메이션보다는 안정성과 유지보수성을 우선시했다.  

- Box + Modifier 조합을 사용해 단순하고 명확한 구조 유지  
- 팀 프로젝트나 후속 개발 시에도 쉽게 이해할 수 있는 코드 구조  

상호작용 종료 상태일 때는 단순히 클릭을 막는 대신  
Modifier.alpha(0.5f)를 적용해 시각적으로 비활성 상태임을 표현했다.  
이 작은 변화가 사용자에게 명확한 피드백으로 작용했다.

---

## 🧠 기술적 요약

| 항목 | 내용 |
|------|------|
| 언어 | Kotlin |
| 프레임워크 | Jetpack Compose |
| 핵심 기술 | mutableStateOf, remember, Modifier.weight, Box, RowScope |
| UI 구조 | 4x4 Grid + Control Button |
| 상태 흐름 | 단일 State → 전체 UI 동기 반영 |
| UX 기능 | 클릭 활성화 시 색상 변화, 비활성화 시 투명도 변경 |

---

## 💻 주요 코드 스니펫

```kotlin
@Composable
fun SimpleGridApp() {
    var isInteractionEnabled by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Grid(isInteractionEnabled = isInteractionEnabled)

        Button(
            onClick = { isInteractionEnabled = !isInteractionEnabled },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isInteractionEnabled) Color.Red else Color.Green
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = if (isInteractionEnabled) "상호작용 종료 (Stop)" else "상호작용 시작 (Start)",
                color = Color.White
            )
        }
    }
}



🖼️ UI 미리보기
🔒 비활성화 상태 (시작 버튼 클릭 전)

모든 셀은 어두운 회색, 클릭 불가

투명도(alpha = 0.5)로 비활성 상태 표시

하단 버튼: 초록색 배경, 텍스트는 상호작용 시작 (Start)

<img width="372" height="676" src="https://github.com/user-attachments/assets/fdc7076e-8bd3-4164-8ea0-9bf5e99a79ff" />
🔓 활성화 상태 (종료 버튼 클릭 후)

셀 클릭 시 무작위 밝은 색상(청록, 빨강, 노랑 등)으로 변경

앱의 핵심 기능인 실시간 색상 변화 및 상태 반응성 시연

하단 버튼: 빨간색 배경, 텍스트는 상호작용 종료 (Stop)

<img width="389" height="665" src="https://github.com/user-attachments/assets/9d1990dc-4e7b-4d38-a42a-46970e365e7d" />
🧭 프로젝트를 통해 배운 점

Compose에서 UI = 상태(State)의 함수라는 개념을 실제로 체감할 수 있었다.

상태를 중앙에서 관리하면 코드의 복잡도가 크게 줄어든다는 점을 실감했다.

Modifier와 Scope의 관계를 이해하면서 Compose 내부 구조에 대한 통찰을 얻었다.

화려한 코드보다 안정적이고 읽기 쉬운 코드의 가치를 다시 느꼈다.

📁 Repository Info
