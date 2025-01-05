import Foundation

func solution(_ binomial:String) -> Int {
    var bin = binomial.components(separatedBy: " ")
    guard let a = Int(bin[0]), let b = Int(bin[2]) else { return 0 }
    return bin[1] == "+" ? a+b : bin[1] == "-" ? a-b : a*b
}