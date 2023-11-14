import Foundation

func solution(_ n_str:String) -> String {
    
    var result:String = ""
   
    for char in n_str {
        if char == "0" {
            if result.isEmpty {
                continue
            }
        }
        result.append(char)
    }
    return result
}
