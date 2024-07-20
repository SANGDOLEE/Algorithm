import Foundation

func solution(_ myString: String) -> String {
    var answer = ""
    for i in myString {
        if i == "a" {
            answer += "A"
        } else if i.isUppercase && i != "A" {
            answer += i.lowercased()
        } else {
            answer += String(i)
        }
    }
    return answer
}
