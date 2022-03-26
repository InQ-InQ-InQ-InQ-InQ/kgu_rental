# kgu_rental

<p>
<type>(<scope>): <subject>          -- 헤더
<BLANK LINE>
<body>                              -- 본문
<BLANK LINE>
<footer>                            -- 바닥글
</p>
  
  ### <type>

어떤 의도로 커밋했는지를 type에 명시합니다.

- FEAT : 새로운 기능의 추가
- FIX: 버그 수정
- DOCS: 문서 수정
- STYLE: 스타일 관련 기능(코드 포맷팅, 세미콜론 누락, 코드 자체의 변경이 없는 경우)
- Design: CSS등 사용자 UI 디자인 변경
- REFACTOR: 코드 리펙토링
- TEST: 테스트 코트, 리펙토링 테스트 코드 추가
- CHORE: 빌드 업무 수정, 패키지 매니저 수정(ex .gitignore 수정 같은 경우)

### <body>

본문으로 헤더로 표현할 수 없는 상세한 내용을 적습니다. 

어떻게 했는지가 아닌 무엇을 왜 진행했는지를 작성합니다.

최대 75자를 넘기지 않도록 합니다.

### **<footer>**

바닥글로 어떤 이슈에서 왔는지 같은 참조 정보들을 추가하는 용도로 사용합니다.

예를 들어 특정 이슈를 참조하려면 close #1233과 같이 추가하면 됩니다.

close는 이슈를 참조하면서 main 브랜치로 푸시될 때 이슈를 닫게 됩니다.
  
  참고 : https://overcome-the-limits.tistory.com/entry/%ED%98%91%EC%97%85-%ED%98%91%EC%97%85%EC%9D%84-%EC%9C%84%ED%95%9C-%EA%B8%B0%EB%B3%B8%EC%A0%81%EC%9D%B8-git-%EC%BB%A4%EB%B0%8B%EC%BB%A8%EB%B2%A4%EC%85%98-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0
