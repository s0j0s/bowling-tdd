# TDD Plan — Bowling Kata

## 사이클 1 — 거터 게임

**검증할 동작:** 모든 투구가 0점이면 총점은 0이다

**테스트 메서드명:** `gutterGame`
**DisplayName:** "거터 게임은 0점이다"

**Given:** 20회 연속 roll(0)
**When:** score() 호출
**Then:** 0 반환

**예상 실패 이유:** `Game` 클래스 자체가 없으므로 컴파일 오류

**설계 결정:**
- `Game` 클래스 생성
- `roll(int pins)` — 투구 기록
- `score()` — 총점 반환
