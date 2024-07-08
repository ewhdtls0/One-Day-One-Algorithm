class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int maxHealth = health; // 최대 체력
        int attacksAttempts = attacks.length; // 총 공격 수
        int totalTime = attacks[attacksAttempts-1][0]; // 총 시간(가장 마지막 요소의 공격 시간)
        int continuity = 0; // 연속 성공 수

        int startJ = 0; // J 시작 인덱스
        for (int i=1; i<=totalTime; i++) {
            
            boolean isAttacked = false; // 공격 당했는지?
            
            for(int j=startJ; j<attacksAttempts; j++) {
                if(attacks[j][0] == i) { // 현재 시간이 어택 시간과 동일하면
                    health -= attacks[j][1]; // 체력 감소
                    if(health <= 0) return -1;
                    continuity = 0; // 연속 성공 초기화
                    isAttacked = true;
                    startJ++; // 다음 인덱스부터 시작하도록
                    break;
                }
            }
            
            if(!isAttacked) {
                continuity++; // 성공
                if(maxHealth > health) {
                    health += bandage[1]; // 체력 회복

                    if(bandage[0] == continuity) {
                        health += bandage[2]; // 추가 체력
                        continuity = 0; // 연속 회복 초기화
                    }
                    
                    if(health > maxHealth) health = maxHealth; // 체력회복 결과가 최대체력을 넘어가면 최대체력으로 조정
                }
            }
           
        }
        
        return health;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/250137
