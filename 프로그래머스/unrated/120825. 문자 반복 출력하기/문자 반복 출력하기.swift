import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    
    var result:String = ""
    
    for i in my_string {
        var count = 0
        while(count<n){
            result += String(i)
            count += 1
        }
    }
    return result
}
