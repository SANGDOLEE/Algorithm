func solution(_ s: String) -> String {
    var answer = ""
    let splitedString = s.components(separatedBy: " ")  // 공백으로 나눈다.
    
    for (wordIndex, word) in splitedString.enumerated() {
        for (index, character) in word.enumerated() {
            if index % 2 == 0 {  // 짝수 인덱스
                answer += character.uppercased()
            } else {  // 홀수 인덱스
                answer += character.lowercased()
            }
        }
        
        // 마지막 단어가 아닌 경우 공백 추가
        if wordIndex < splitedString.count - 1 {
            answer += " "
        }
    }
    
    return answer
}
