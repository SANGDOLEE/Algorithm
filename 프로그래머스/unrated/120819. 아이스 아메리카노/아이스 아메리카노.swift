import Foundation

func solution(_ money:Int) -> [Int] {
    var count1 = money / 5500
    var count2 = money % 5500
    return [count1, count2]
}