import Foundation

func solution(_ rny_string:String) -> String {
    var result = ""
    result.reserveCapacity(rny_string.count)  // 미리 메모리 할당
    
    for char in rny_string {
        if char == "m" {
            result.append("rn")
        } else {
            result.append(char)
        }
    }
    
    return result
}