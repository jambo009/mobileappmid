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

## W03 · Compose 기본 구조 & 데이터 바인딩

### ☕ W03ComposeCoffee  
<img width="362" height="648" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd행 포인트  

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



---


# 📱 Simple Grid myapp에 대한 소
### Jetpack Compose 기반 상태 관리 실습 프로젝트

Simple Grid는 Jetpack Compose의 상태 관리(State Management)와 반응형 UI 구조를 이해하기 위해 만든 실습 프로젝트입니다.  
4x4 형태의 격자를 만들고, 시작/종료 버튼 하나로 전체 상호작용을 제어하는 구조를 통해 Compose가 UI를 효율적으로 관리하는 방식을 직접 체험할 수 있습니다.

---

## 🧩 프로젝트 개요  

이 프로젝트의 목표는 단순한 기능 구현이 아니라, 앱의 중심은 상태(State)이며 UI는 그 상태를 반영한다는 Compose의 철학을 실제 코드로 체화하는 것입니다.  

핵심 포인트:  
- 4x4 격자를 만들고 시작/종료 버튼으로 전체 UI 동작 제어  
- Compose의 단방향 데이터 흐름(Unidirectional Data Flow) 실습  
- 상태(State)를 중앙에서 관리하여 코드 구조 단순화

---

## ⚙️ 핵심 구현 포인트  

### 1️⃣ 단일 상태로 전체 UI 통제  
`isInteractionEnabled`라는 단일 `mutableStateOf` 변수로 앱 전체 활성화 여부를 관리했습니다.  

- 모든 셀 클릭 가능 여부를 이 변수로 제어  
- 하단 버튼은 상태에 따라 텍스트(Start ↔ Stop)와 색상(초록 ↔ 빨강)을 동시에 변경  

이 방식 덕분에 버튼 하나로 전체 UI가 즉시 반영되며, Compose의 단방향 데이터 흐름을 자연스럽게 이해할 수 있었습니다.

---

### 2️⃣ 균일한 그리드 구성과 Modifier 안정성  
화면 크기나 비율이 달라도 항상 동일한 크기의 4x4 셀을 유지하도록 구현했습니다.  

- Column과 Row를 계층적으로 배치  
- 각 셀에 `Modifier.weight(1f)`를 적용하여 균등 비율 유지  
- `GridCell`을 `RowScope` 확장 함수로 선언해 스코프 문제 해결  

이를 통해 Modifier 작동 원리와 Compose 스코프 구조를 깊이 이해할 수 있었습니다.

---

### 3️⃣ UX 중심의 실용적 설계  
- 과도한 애니메이션 대신 안정성과 유지보수성을 우선  
- 상호작용 종료 시 `Modifier.alpha(0.5f)` 적용으로 비활성 상태 시각화  
- 버튼 하나로 ① 버튼 색상/텍스트 변경, ② 16개 셀 클릭 가능 여부 동시에 반영  

이 경험을 통해 '작동하는 코드'가 '화려한 코드'보다 실용적임을 체감했습니다.

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


<img width="389" height="665" alt="image" src="https://github.com/user-attachments/assets/9d1990dc-4e7b-4d38-a42a-46970e365e7d" />

🧠 배운 점

UI = 상태(State)의 함수라는 개념 체감

여러 컴포넌트에 흩어진 상태를 중앙에서 관리하는 것이 Compose의 단방향 데이터 흐름에서 핵심 원칙임을 이해

안정적이고 유지보수 가능한 코드를 작성하는 중요성 체득
