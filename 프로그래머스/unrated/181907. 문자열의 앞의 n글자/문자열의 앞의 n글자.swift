import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    
    var answer:String = ""
    
    var index = 0
    for i in my_string {
        if index<n {
            answer.append(i)
            index += 1
        } else {
            break
        }
    }
    return answer
}
