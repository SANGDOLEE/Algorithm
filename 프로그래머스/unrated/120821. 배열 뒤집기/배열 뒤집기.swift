import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    var answer:[Int] = []
    
    for i in num_list.reversed() {
        answer.append(i)
    }
    return answer
}
