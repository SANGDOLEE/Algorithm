import Foundation

func solution(_ my_string:String, _ index_list:[Int]) -> String {
    var answer = ""
    var arr = Array(my_string)
    for i in index_list {
        answer += String(arr[i])
    }
    return answer
}