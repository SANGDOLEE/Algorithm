import Foundation

func solution(_ my_string:String) -> [String] {
    
    var arr = Array(my_string)
    
    var index = 0
    var answer = [String]()
    
    while(index<arr.count){
        var temp = arr[index...arr.count-1]
        answer.append(String(temp))
        index += 1
    }
    
    return answer.sorted()
}
