import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    var answer = ""
    let arr = Array(my_string)
    for i in 0..<arr.count {
        for j in 0..<n {
            answer.append(arr[i])
        }
    }
    
    return answer
}