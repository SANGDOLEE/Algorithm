import Foundation

func solution(_ cipher:String, _ code:Int) -> String {
    
    var result = ""
    for i in 0..<cipher.count {
        var ch = cipher.index(cipher.startIndex, offsetBy: i)
        if (i+1) % code == 0 {
            result.append(String(cipher[ch]))
        }
        
    }
    return result
}
