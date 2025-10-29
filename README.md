모바일앱실습 202511002 
성민준




모바일앱 여태까지 한 실습

W03: 기본 레이아웃 및 데이터 바인딩 


W03composecoffee



<img width="362" height="648" alt="image" src="https://github.com/user-attachments/assets/ccfde846-bd69-400a-b263-60e1fff26cd4" />

☕ 정적 UI 구조화: Column을 최상위 레이아웃으로 사용하여 요소를 수직으로 배치하고, 버튼 영역에서는 Row를 사용하여 수평 정렬을 구현했습니다. Image Composable을 사용하고, **Modifier.border**를 통해 이미지에 테두리를 추가하여 시각적 강조를 주었습니다.

W03kakaoemail



<img width="354" height="639" alt="image" src="https://github.com/user-attachments/assets/8ece48ea-1cac-416e-a660-60e89ed04630" />

📧 사용자 입력 및 상태 초기 관리: **OutlinedTextField**와 같은 입력 필드를 사용하여 사용자로부터 텍스트를 받습니다. 입력된 텍스트는 val email by remember { mutableStateOf("") } 형태의 상태(State) 변수에 저장되며, 이 상태가 변경될 때마다 UI(입력 필드 값)가 갱신됩니다. 이는 Compose의 반응성(Reactivity)의 기초입니다.

W04: 복합 레이아웃 구성 및 커스터마이징


W04grid


<img width="358" height="652" alt="image" src="https://github.com/user-attachments/assets/4c36d6d7-9dc6-461b-b4cc-e7c0a1599cb4" />

🖼️ 대규모 데이터 표시: LazyVerticalGrid 또는 LazyColumn과 Row의 조합을 활용하여 **스크롤 가능한 격자형 뷰(Gallery View)**를 구현했습니다. 특히 Lazy Composables은 화면에 보이는 항목만 로드하여 성능 최적화를 달성하는 핵심 기법입니다.

<img width="352" height="635" alt="image" src="https://github.com/user-attachments/assets/d53dec53-4864-4d0d-9695-7b8513f3aef6" />

W04keypad



<img width="357" height="648" alt="image" src="https://github.com/user-attachments/assets/133506f3-0d6f-491f-b836-ad4eb07d6a35" />

🔢 비례 레이아웃(Weighted Layout): 키패드의 버튼들을 Row 내에 배치하고, 각 버튼에 **Modifier.weight(1f)**를 적용하여 화면 너비 내에서 버튼들이 균등한 너비를 갖도록 비례적으로 크기를 조절했습니다. 이는 다양한 화면 크기에 대응하는 반응형 UI 설계의 기본입니다.

W04overalpped



<img width="355" height="640" alt="image" src="https://github.com/user-attachments/assets/682b7663-feea-4868-b243-20a08cb0c7d1" />

疊 Box 레이아웃 및 오프셋: Box Composable을 사용하여 여러 프로필 이미지(Image)들을 서로 겹쳐서 배치했습니다. 각 이미지는 **Modifier.offset(x = ..., y = ...)**를 사용하여 기준 위치로부터 상대적으로 이동시켜 겹침 효과를 만들어냈습니다.

W04profile

👤 재사용 가능한 컴포넌트: Card 또는 Surface 내에 Row와 Column을 조합하여 명함 형태의 작은 커스터마이징된 Composable을 생성했습니다. 이는 앱 전체에서 동일한 UI 패턴을 재사용하는 데 유용합니다.

<img width="357" height="82" alt="image" src="https://github.com/user-attachments/assets/ec0f374d-f26a-4fda-a63b-1a0c92d2eceb" />



W05: 고급 상태 관리 및 상호 작용



W05counter



<img width="356" height="641" alt="image" src="https://github.com/user-attachments/assets/0098a337-766b-4a57-8f8b-34f9883a23dd" />

🎯 버튼 이벤트 및 상태 변경: 버튼의 onClick 람다 내에서 카운터 상태 변수를 직접 변경했습니다. 이 실습은 **단방향 데이터 흐름 (Unidirectional Data Flow)**의 가장 단순한 형태를 보여줍니다.

W05stopwatch


<img width="360" height="640" alt="image" src="https://github.com/user-attachments/assets/97e5e0cc-dd88-45c2-99ad-5a386964b662" />

⏱️ 비동기 타이머 로직: **LaunchedEffect**와 withFrameNanos 또는 **Kotlin Coroutines (delay)**를 사용하여 메인 스레드를 막지 않으면서 정기적으로 UI를 업데이트하는 비동기 타이머 기능을 구현했습니다. 시간 계산 로직과 isRunning 상태 변수를 결합하여 복잡한 상태를 관리합니다.

W05touch


<img width="357" height="640" alt="image" src="https://github.com/user-attachments/assets/f3fbb693-c6f4-406a-94e2-0b4933a76684" />
<img width="359" height="646" alt="image" src="https://github.com/user-attachments/assets/afce3bd3-ab56-462a-81ac-1542595e08a1" />

👆 터치 제스처 처리: Modifier.pointerInput 또는 **detectDragGestures**와 같은 모디파이어를 사용하여 화면에 발생하는 드래그(Drag), 탭(Tap) 이벤트를 감지했습니다. 터치 좌표를 받아 캔버스에 선을 그리거나(Canvas Composable 사용 예상), UI 요소를 이동시키는 실시간 상호 작용을 구현했습니다.


W06 & W07: 애니메이션 및 게임 로직 구현


W06bubblegame


<img width="354" height="636" alt="image" src="https://github.com/user-attachments/assets/63c40633-512f-47ca-83bd-5b734633ecb4" />

🎈 게임 상태 및 애니메이션: 버블 객체의 위치(x, y), 크기, 색상을 상태로 관리하고, 랜덤 함수를 사용하여 버블을 무작위 위치에 생성했습니다. 버블을 터치했을 때(onClick 또는 pointerInput), 해당 객체를 상태 목록에서 제거하고 점수를 업데이트하는 게임 루프의 기본 로직을 구현했습니다.

W07stopwatchgame


<img width="360" height="642" alt="image" src="https://github.com/user-attachments/assets/dc6ec1fe-9ab2-477d-b56e-c7c6981c5c08" />


🏁 복합 게임 로직 및 UI 피드백: W05의 스톱워치 기능에 목표 시간(Target Time) 개념을 추가했습니다. 사용자가 버튼을 눌렀을 때의 시간 오차를 계산하고, 그에 따른 **승패 조건(Win/Lose)**을 판단하여 UI에 명확한 피드백(점수, 메시지)을 제공하는 **조건적 렌더링(Conditional Rendering)**을 사용했습니다.









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
