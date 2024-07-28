import Foundation

func solution(_ n_str:String) -> String {
     let trimmedString = n_str.drop { $0 == "0" }
    return String(trimmedString)
}