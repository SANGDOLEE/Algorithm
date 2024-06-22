import Foundation

func solution(_ array:[Int]) -> Int {
    var temp = array.sorted()
    return temp[array.count/2]
}