import Foundation

func solution(_ my_string:String) -> [String] {
    return my_string.components(separatedBy: .whitespaces).filter { !$0.isEmpty }
}