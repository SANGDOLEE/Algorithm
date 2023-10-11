import Foundation

func solution(_ my_string:String) -> String {
    var answer:String = ""
    
    for i in my_string {
        if !(i=="a" || i=="e"||i=="i"||i=="o"||i=="u") {
            answer += String(i)
        }
    }
    return answer
}
