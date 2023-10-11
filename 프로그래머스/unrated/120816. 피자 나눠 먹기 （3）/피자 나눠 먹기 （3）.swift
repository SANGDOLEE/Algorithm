import Foundation

func solution(_ slice:Int, _ n:Int) -> Int {
    var answer = 0
    if slice < n {
        if n%slice == 0 {
            answer = n/slice
        } else {
            answer = n/slice + 1 
        }
    } else { // slice > n  
        answer = 1
    }
    return answer
}