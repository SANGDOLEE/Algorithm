func solution(_ phone_number:String) -> String {
    var answer = ""
    var length = phone_number.count - 4
    for (index, i) in phone_number.enumerated() {
        if index < length {
            answer.append("*")
        } else {
            answer.append(i)
        }
    }
    return answer
}