import Foundation

func solution(_ rsp:String) -> String {
    
    var arr = Array(rsp)
    
    var answer = ""
    for i in arr {
        if i == "2" {
            answer += "0"
        } else if i == "0" {
            answer += "5"
        } else {
            answer += "2"
        }
    }
    return answer
}
