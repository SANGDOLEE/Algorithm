import Foundation

func solution(_ my_string: String, _ n: Int) -> String {
    var result = ""
    var count = 0
    
    for char in my_string {
        if count < n {
            result.append(char)
            count += 1
        } else {
            break
        }
    }
    
    return result
}
