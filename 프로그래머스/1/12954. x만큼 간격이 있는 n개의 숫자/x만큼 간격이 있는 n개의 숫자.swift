func solution(_ x:Int, _ n:Int) -> [Int] {
    
    var array: [Int] = []
    var temp = x
    var count = n
    while(count>0){
        array.append(temp)
        temp = temp + x
        
        count -= 1
    }
    
    return array
}