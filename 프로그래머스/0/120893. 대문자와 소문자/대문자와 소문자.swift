import Foundation

func solution(_ my_string:String) -> String {
    var answer = ""
    for i in my_string {
        if i.isLowercase {
            answer += i.uppercased()
        } else {
            answer += i.lowercased()
        }
    }
    return answer
}