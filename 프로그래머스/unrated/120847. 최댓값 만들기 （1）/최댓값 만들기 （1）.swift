import Foundation

func solution(_ numbers:[Int]) -> Int {
    
    var array = numbers.sorted()
    
    var result = array[array.count - 1] * array[array.count - 2]
    return result
}
