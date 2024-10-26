import Foundation

func solution(_ array: [Int], _ commands: [[Int]]) -> [Int] {
    var answer: [Int] = []
    
    for command in commands {
        let i = command[0] - 1  // 인덱스는 0부터 시작하므로 -1
        let j = command[1] - 1
        let k = command[2] - 1
        
        // array의 i번째부터 j번째까지 자르고 정렬 후, k번째 값을 answer에 추가
        let temp = Array(array[i...j]).sorted()
        answer.append(temp[k])
    }
    
    return answer
}
