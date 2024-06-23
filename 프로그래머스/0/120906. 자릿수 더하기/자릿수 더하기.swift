import Foundation

func solution(_ n:Int) -> Int {
    let text = String(n)
    return text.compactMap { Int(String($0)) }.reduce(0, +)
}