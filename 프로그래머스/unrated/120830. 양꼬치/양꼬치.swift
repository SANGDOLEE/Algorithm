import Foundation

func solution(_ n:Int, _ k:Int) -> Int {
    
    var nSum = n*12000
    var kSum = k*2000
    var service = n/10
    var answer = nSum + kSum - (service*2000)
    
    return answer
}
