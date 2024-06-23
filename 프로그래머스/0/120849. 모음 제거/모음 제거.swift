import Foundation

func solution(_ my_string:String) -> String {
    var alphabet = "aeiou"
    return my_string.filter({ !alphabet.contains( $0 )})
}