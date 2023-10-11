import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var answer:[Int] = [0,0]
    
    for i in num_list {
        if i%2 == 0 {
            answer[0] = answer[0] + 1
        } else {
            answer[1] = answer[1] + 1
        }
    }
    return answer
}
