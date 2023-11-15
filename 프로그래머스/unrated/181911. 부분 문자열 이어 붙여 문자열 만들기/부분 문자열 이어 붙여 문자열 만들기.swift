import Foundation

func solution(_ my_strings:[String], _ parts:[[Int]]) -> String {
    var result = ""

    for i in 0..<my_strings.count {
        let substringIndices = parts[i]
        let start = substringIndices[0]
        let end = substringIndices[1]

        let substring = my_strings[i].prefix(end + 1).suffix(end - start + 1)
        result += String(substring)
    }

    return result
}