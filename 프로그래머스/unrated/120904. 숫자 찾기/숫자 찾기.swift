import Foundation

func solution(_ num:Int, _ k:Int) -> Int {
    
    var arr = Array(String(num).compactMap{ Int(String($0))})
    var answer = -1
    for i in 0..<arr.count {
        if arr[i] == k { return i+1}
    }
    return answer
}