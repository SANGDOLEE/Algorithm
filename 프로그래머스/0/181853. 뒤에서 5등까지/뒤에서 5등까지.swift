import Foundation

func solution(_ num_list: [Int]) -> [Int] {
    let sortedArray = num_list.sorted()
    if sortedArray.count <= 5 {
        return []
    }
    return Array(sortedArray[0..<5])
}