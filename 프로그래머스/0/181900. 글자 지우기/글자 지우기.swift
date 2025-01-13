import Foundation

func solution(_ my_string:String, _ indices:[Int]) -> String {
    
    var answer = ""
    let strArray = Array(my_string)

    for (index, char) in strArray.enumerated() {
        if !indices.contains(index) {
            answer.append(char)  // 인덱스를 사용해 문자 추가
        }
    }
    return answer
}