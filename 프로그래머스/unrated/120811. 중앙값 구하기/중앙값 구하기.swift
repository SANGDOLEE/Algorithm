import Foundation

func solution(_ array:[Int]) -> Int {
    
    var result = array.sorted()
    
    var answer = result[result.count/2]
    
    return answer
}
