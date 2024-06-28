import Foundation

let inp = readLine()!.components(separatedBy: [" "]).map { $0 }
let (s1, s2) = (inp[0], inp[1])
var answer = s1 + s2
print(answer.trimmingCharacters(in: .whitespaces))