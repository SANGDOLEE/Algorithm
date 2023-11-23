import Foundation

func solution(_ array:[Int]) -> [Int] {
    
    var answer = [Int]()
    
    var temp = array.sorted()
    
    var max = temp[array.count-1]
    answer.append(max)
    if let index = array.firstIndex(of: max){
        answer.append(index)
    }
    
    return answer
}
