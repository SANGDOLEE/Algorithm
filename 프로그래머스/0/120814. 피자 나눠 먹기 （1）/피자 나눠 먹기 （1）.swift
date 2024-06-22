import Foundation

func solution(_ n:Int) -> Int {
    var temp = n % 7 == 0 ? n/7 : n/7+1
    return temp
}