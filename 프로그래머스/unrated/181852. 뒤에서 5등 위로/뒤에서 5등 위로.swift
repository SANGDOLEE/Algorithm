import Foundation

func solution(_ num_list:[Int]) -> [Int] {
  
      var arr = num_list.sorted().reversed()
    
    // num_list의 길이가 5 이하인 경우 원래 배열 반환
    if num_list.count <= 5 {
        return num_list
    }
    
    // 뒤에서 5번째까지의 요소를 제외한 나머지를 temp에 추가
    var temp = [Int]()
    for i in arr.indices.prefix(arr.count - 5) {
        temp.append(arr[i])
    }
    
    // temp에 포함된 요소들을 정렬하여 반환
    return temp.sorted()
    
}
