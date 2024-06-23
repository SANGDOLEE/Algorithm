import Foundation

func solution(_ n:Int, _ k:Int) -> Int {
    var food = n * 12000
    var drink = (k * 2000) - ( (n/10)*2000)
    return food + drink
}