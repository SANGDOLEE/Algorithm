import Foundation

func solution(_ arr:[[Int]]) -> Int {
    
    var answer = 1
    for i in 0..<arr.count {
        for j in 0..<arr[0].count {
            if arr[i][j] != arr[j][i] {
                answer = 0
                break
            }
        }
    }
    return answer
}
