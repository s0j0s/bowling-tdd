# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# 전체 테스트 실행
.\gradlew.bat test

# 단일 테스트 클래스 실행
.\gradlew.bat test --tests "org.example.BowlingGameTest"

# 단일 테스트 메서드 실행
.\gradlew.bat test --tests "org.example.BowlingGameTest.gutterGame"

# 빌드
.\gradlew.bat build

# 테스트 결과 재실행 (캐시 무시)
.\gradlew.bat test --rerun-tasks
```

## Environment

- JDK: Azul Zulu 17 (`C:\Users\User\.jdks\azul-17.0.19`) — `gradle.properties`에 고정
- Gradle: 9.3.0 (wrapper)
- JUnit: 5 (junit-bom 6.0.0)

## Project

볼링 점수 계산기 TDD 구현 프로젝트. 소스는 `src/main/java/org/example/`, 테스트는 `src/test/java/org/example/`에 위치.

## Bowling Kata 스펙

미국식 텐핀 볼링 한 게임의 투구 순서를 받아 최종 총점을 계산한다.

아래는 고려하지 않는다.
- 투구 유효성 검증
- 투구 횟수/프레임 수 검증
- 중간 프레임 점수 제공

### 점수 규칙

- **스페어**: 2회 투구로 10핀 전부. 보너스 = 다음 투구 1회 핀 수.
- **스트라이크**: 1회 투구로 10핀 전부 (프레임 종료). 보너스 = 이후 2회 투구 핀 수 합계.
- **10번 프레임**: 스페어/스트라이크 시 추가 투구 가능, 최대 3회.

### 구현 대상

```java
class Game {
    void roll(int pins)  // 투구 시마다 호출, pins = 쓰러뜨린 핀 수
    int score()          // 게임 총점 반환
}
```
