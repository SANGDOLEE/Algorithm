import Foundation

func solution(_ n:Int) -> [Int] {
    
    var number = n
    var answer = [Int]()
    answer.append(n)
    
    while(number != 1) {
        // 짝수면
        if number%2 == 0 {
            number = number/2
        } else {
            // 홀수면
            number = number * 3 + 1
        }
        answer.append(number)
    }
    return answer
}