import Foundation

func solution(_ dot:[Int]) -> Int {
    
    var a = dot[0]
    var b = dot[1]
    
    var answer = 0
    if a > 0 && b > 0 {
        answer = 1
    } else if a < 0 && b > 0 {
        answer = 2
    } else if a < 0 && b < 0 {
        answer = 3
    } else {
        answer = 4
    }
    return answer
}
