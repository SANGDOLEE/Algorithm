import Foundation

func solution(_ myString:String) -> [Int] {
    
    var temp = myString.components(separatedBy: "x")
    print(temp)
    
    var answer = [Int]()
    for i in temp {
        answer.append(i.count)
    }
    return answer
    
}