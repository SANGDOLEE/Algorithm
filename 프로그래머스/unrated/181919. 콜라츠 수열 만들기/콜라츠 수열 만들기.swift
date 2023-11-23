import Foundation

func solution(_ n:Int) -> [Int] {
    
    var answer = [n]
    var x = n
    while(x != 1){
        x = (x % 2 == 0) ? (x / 2) : (3 * x + 1)
        answer.append(x)
    }
    return answer
}