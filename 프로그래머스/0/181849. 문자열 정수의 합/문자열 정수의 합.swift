import Foundation

func solution(_ num_str: String) -> Int {
    var arr = [Character]()

    for i in num_str {
        arr.append(i)
    }
    
    return arr.map{ Int(String($0)) ?? 0 }.reduce(0, +) 
}
