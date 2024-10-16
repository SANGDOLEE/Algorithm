func solution(_ n:Int64) -> Int64 {
    var temp = String(n).compactMap{ $0.wholeNumberValue }.sorted(by: >)
    var answer = Int64(temp.map { String($0) }.joined())!
    return answer
}