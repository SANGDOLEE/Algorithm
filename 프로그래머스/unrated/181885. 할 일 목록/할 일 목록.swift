import Foundation

func solution(_ todo_list:[String], _ finished:[Bool]) -> [String] {
    
    var result = [String]()
    var index = 0
    
    for i in finished {
        if i == false {
            result.append(todo_list[index])
        }
        index += 1
    }
    return result
}
