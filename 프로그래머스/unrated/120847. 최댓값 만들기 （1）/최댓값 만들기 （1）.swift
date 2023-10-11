import Foundation

func solution(_ numbers:[Int]) -> Int {
    
    var array:[Int] = numbers
    
    array.sort()
    array.reverse()
    return array[0]*array[1]
}
