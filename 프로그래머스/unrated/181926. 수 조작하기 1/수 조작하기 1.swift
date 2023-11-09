import Foundation

func solution(_ n:Int, _ control:String) -> Int {
    
    let arr = Array(control)
    
    var num = n
    for i in arr {
        switch i {
        case "w":
            num += 1
        case "s":
            num -= 1
        case "d":
            num += 10
        case "a":
            num -= 10
        default:
            continue
        }
    }
    return num
}
