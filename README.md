모바일앱실습 202511002 
성민준




모바일앱 여태까지 한 실습

W03: Compose의 기본 구조 및 데이터 바인딩 


W03composecoffee



<img width="362" height="648" alt="image" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd4" />


"**Column, Row, Spacer**를 활용하여 UI 요소를 수직 및 수평으로 정밀하게 정렬했습니다. 특히, Modifier.padding을 사용하여 **디자인 시스템 기반의 간격(Spacing)**을 부여하고, Button Composable의 onClick 핸들러를 준비하여 이벤트 처리를 습니다.","기본적인 레이아웃 Composables에 대한 숙련도를 확보하고, Modifier를 활용한 레이아웃 구성 능력을 입증했습니다."



W03kakaoemail



<img width="354" height="639" alt="image" src="https://github.com/user-attachments/assets/8ece48ea-1cac-416e-a660-60e89ed04630" />

"TextField 또는 **OutlinedTextField**를 사용하여 사용자 입력 필드를 구현했습니다. 핵심은 **remember { mutableStateOf("""") }**를 사용한 상태 변수(State Variable) 선언입니다. 사용자가 텍스트를 입력할 때마다 상태가 갱신되고, UI는 이 상태를 **반영(Observe)**하여 변경됩니다.",Jetpack Compose의 가장 중요한 원리인 '상태 기반 UI 갱신' 메커니즘을 실제 입력 컴포넌트에 적용했습니다.


W04: 복잡한 레이아웃 설계 및 컴포넌트 모듈화


W04grid


<img width="358" height="652" alt="image" src="https://github.com/user-attachments/assets/4c36d6d7-9dc6-461b-b4cc-e7c0a1599cb4" />
<img width="352" height="635" alt="image" src="https://github.com/user-attachments/assets/d53dec53-4864-4d0d-9695-7b8513f3aef6" />


LazyVerticalGrid (또는 LazyColumn과 Row 조합)을 사용하여 수백 개의 이미지를 효율적으로 표시하는 스크롤 가능 뷰를 구현했습니다. Lazy 접두사가 붙은 Composables은 화면에 보이는 요소만 렌더링하여 앱의 메모리 사용량과 성능을 최적화하는 데 필수적인 기술입니다.	대규모 데이터 셋을 다루는 데 필요한 성능 최적화 레이아웃(Lazy Composables)의 사용법을 완벽히 숙지했습니다.


W04keypad



<img width="357" height="648" alt="image" src="https://github.com/user-attachments/assets/133506f3-0d6f-491f-b836-ad4eb07d6a35" />

키패드 버튼들을 Row와 Column의 계층 구조로 배치하고, **Modifier.weight(float)**를 사용하여 각 버튼이 가로 공간을 균등하게 차지하도록 비례 배분했습니다. 이는 다양한 해상도의 기기에서 일관된 비율의 UI를 제공하는 반응형 디자인의 핵심입니다.	Modifier.weight를 통한 유연한 레이아웃(Flexible Layout) 설계를 통해 다차원 배열 형태의 UI를 정확하게 구현했습니다.

W04overalpped



<img width="355" height="640" alt="image" src="https://github.com/user-attachments/assets/682b7663-feea-4868-b243-20a08cb0c7d1" />

Box Composable을 사용하여 여러 UI 요소(예: Image)를 Z축(깊이) 방향으로 겹쳐 보이도록 구현했습니다. 개별 요소의 위치는 **Modifier.offset(dp)**를 사용하여 세밀하게 조정하여 시각적인 깊이감을 연출했습니다.**Box 레이아웃과 Modifier.offset**을 활용하여 겹침, 배경/전경 배치 등 2.5D 레이아웃 효과를 생성했습니다.

W04profile



<img width="357" height="82" alt="image" src="https://github.com/user-attachments/assets/ec0f374d-f26a-4fda-a63b-1a0c92d2eceb" />



W05: 상태 관리 및 실시간 상호 작용



W05counter



<img width="356" height="641" alt="image" src="https://github.com/user-attachments/assets/0098a337-766b-4a57-8f8b-34f9883a23dd" />

**mutableStateOf**를 활용하여 카운터 값을 상태로 정의하고, 버튼 클릭 이벤트 발생 시 상태 변경을 통해 UI(화면의 숫자)가 즉각적으로 갱신되는 단방향 데이터 흐름(Unidirectional Data Flow) 원리를 구현했습니다.	remember와 mutableStateOf를 사용하여 Composable의 수명 주기(Lifecycle) 동안 상태를 유지하고, 상태 변화에 반응하는 반응형 프로그래밍의 기본을 완성했습니다.

W05stopwatch


<img width="360" height="640" alt="image" src="https://github.com/user-attachments/assets/97e5e0cc-dd88-45c2-99ad-5a386964b662" />

Kotlin Coroutines의 **LaunchedEffect**와 delay 함수를 사용하여 메인 UI 스레드를 막지 않는 비동기 타이머 로직을 구현했습니다. isRunning: Boolean 상태를 추가하여 스톱워치의 시작/정지 상태를 제어하는 복잡한 비동기 상태 관리를 수행했습니다.	코루틴을 활용한 비동기 프로그래밍 능력을 입증했으며, 앱의 **응답성(Responsiveness)**을 해치지 않는 타이머/애니메이션 구현 기법을 습득했습니다.

W05touch


<img width="357" height="640" alt="image" src="https://github.com/user-attachments/assets/f3fbb693-c6f4-406a-94e2-0b4933a76684" />
<img width="359" height="646" alt="image" src="https://github.com/user-attachments/assets/afce3bd3-ab56-462a-81ac-1542595e08a1" />

**Modifier.pointerInput**을 사용하여 화면의 **터치 제스처(Drag, Tap)**를 감지하고, 해당 터치 좌표를 실시간으로 추적하여 Canvas Composable에 선(Line)을 그리는 로직을 구현했습니다. 색상 피커 버튼은 별도의 상태 변수로 현재 선택된 색상을 관리했습니다.로우 레벨(Low-level) 터치 이벤트를 처리하는 pointerInput API를 사용하여 직관적인 사용자 상호 작용(Direct Manipulation) 기능을 성공적으로 구현했습니다.

W06 & W07: 게임 로직 및 애니메이션 결합


W06bubblegame


<img width="354" height="636" alt="image" src="https://github.com/user-attachments/assets/63c40633-512f-47ca-83bd-5b734633ecb4" />

게임 플레이에 필요한 객체(버블) 모델을 정의하고, List<Bubble> 형태로 관리했습니다. 랜덤 함수를 사용하여 버블의 생성 위치와 속성을 결정하고, 터치 시 해당 버블 객체를 목록에서 **제거(Remove)**하는 방식으로 **게임 상태(Game State)**를 업데이트했습니다.	클래스/데이터 모델을 Composable의 상태와 결합하여 단순한 게임 루프를 구현하고, 사용자 입력에 따른 상태 변화를 명확하게 처리했습니다.

W07stopwatchgame


<img width="360" height="642" alt="image" src="https://github.com/user-attachments/assets/dc6ec1fe-9ab2-477d-b56e-c7c6981c5c08" />


W05의 스톱워치 로직을 확장하여 게임 시간 제한 및 목표 값을 설정했습니다. 게임 종료 시, 사용자가 버튼을 누른 시점과 목표 시간 간의 **시간 차이(오차)**를 계산하고, 이 오차 값에 따라 **게임 결과(Score/Message)**를 분기 처리하는 조건부 렌더링을 구현했습니다.여러 상태 변수(타이머, 목표 시간, 게임 상태)를 동시에 관리하고, 복잡한 로직의 결과를 UI에 실시간으로 반영하는 고급 상태 패턴을 성공적으로 적용했습니다.









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
