import Foundation

func solution(_ money:Int) -> [Int] {
    var coffee = money / 5500
    var money = money % 5500
    return [coffee, money]
}