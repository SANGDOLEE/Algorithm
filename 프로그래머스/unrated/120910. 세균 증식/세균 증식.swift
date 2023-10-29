import Foundation

func solution(_ n:Int, _ t:Int) -> Int {
    
    var temp = n
    for i in 1...t{
        temp *= 2
    }
    return temp
}
