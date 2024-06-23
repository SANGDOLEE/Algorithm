import Foundation

func solution(_ array: [Int]) -> [Int] {
    guard let maxValue = array.max(), let maxIndex = array.firstIndex(of: maxValue) else {
        return [] // 배열이 비어 있는 경우 처리
    }
    return [maxValue, maxIndex]
}
