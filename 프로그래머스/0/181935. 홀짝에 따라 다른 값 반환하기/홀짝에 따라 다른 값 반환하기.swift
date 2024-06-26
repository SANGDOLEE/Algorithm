import Foundation

func solution(_ n: Int) -> Int {
    var sum = 0
    if n % 2 == 1 {
        // n이 홀수일 경우, 1부터 n까지의 홀수의 합 계산
        for i in 1...n {
            if i % 2 == 1 {
                sum += i
            }
        }
    } else { 
        // n이 짝수일 경우, 1부터 n까지의 짝수의 제곱 합 계산
        for i in 1...n {
            if i % 2 == 0 {
                sum += i * i
            }
        }
    }
    
    return sum
}
