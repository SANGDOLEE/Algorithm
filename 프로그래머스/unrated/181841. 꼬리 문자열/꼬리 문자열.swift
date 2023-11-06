import Foundation

func solution(_ str_list:[String], _ ex:String) -> String {
    var answer = ""
    
    for i in str_list {
        if !i.contains(ex){
            answer += i
        }
    }
    return answer
}
