# `AJAX`란?

비동기식 자바스크립트 XML 요청 `AJAX(Asynchronous JavaScript and XML)`

최근에는 XML이 아닌 JSON 타입으로 사용하는 것이 주류가 되었으나 이름은 그대로 XML 유지

<aside>
✅ **웹 브라우저가 서버와 상호작용하는 4가지 대표적인 방법**

1. URL 을 통한 요청
    - 브라우저 주소창을 통해 URL 요청
    - GET 메서드로 수행됨
2. form 제출을 통한 요청
    - HTML form 태그 안에서 submit 속성을 가진 input 태그 또는 button 태그를 통해 요청
    - GET 메서드(검색 및 필터링) 또는 POST 메서드(데이터 양식 작성 및 제출)로 수행됨
3. **비동기식`Asynchronous` Javascript XML요청 (= AJAX)**
    - 클라이언트가 화면을 새로고침하지 않아도 새로운 데이터를 수신할 수 있도록 하는 요청
    - XMLHttpRequest 객체 또는 Fetch API를 사용하여 수행
    - HTTP 메서드 제약 없이 사용되지만, 서버 측 구현에 따라 달라짐
4. 웹 소켓을 통한 연결
    - 최초 연결 시에는 HTTP를 사용
    - HTTP 요청과 달리 딘일 연결을 통해 쌍방향 통신이 가능한  사용
    - 서버가 먼저 클라이언트 측에 알림 및 데이터를 보낼 수 있음
</aside>

## [활동] 북마크 Application 에 아래 내용 적용하기

1. Bookmark 엔티티를 DTO로 분리 후, JPA를 활용해 DB 연동
2. Controller -Service - Repository 의 3 티어 아키텍쳐 적용
3. RESTful 설계를 적용해 북마크 검색(GET), 수정(PUT, PATCH), 삭제(DELETE) Endpoint 구현 및 테스트
4. 각 엔드포인트에 대한 AJAX 호출을 수행하는 View 로직 구현
5. Bookmark Entity에 Category 컬럼을 추가하고, BookmarkCategoryDTO 를 추가해 카테고리별로 정렬된 데이터를 반환하는 엔드포인트 구현
6. 각 엔드포인트에 대한 AJAX 호출을 수행하는 View 로직 구현 및 bookmark.html 에 추가
