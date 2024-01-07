import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int one = 0; // 1 2 3 4 5
        int two = 0; // 2 1 2 3 2 4 2 5
        int three = 0; // 3 3 1 1 2 2 4 4 5 5

        int[] one_arr = {1,2,3,4,5};
        int[] two_arr = {2,1,2,3,2,4,2,5};
        int[] three_arr = {3,3,1,1,2,2,4,4,5,5};

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        for(int i=0; i<answers.length; i++){
            int first = one_arr[index1];
            int second = two_arr[index2];
            int third = three_arr[index3];

            if(first == answers[i]) one++;
            if(second == answers[i]) two++;
            if(third == answers[i]) three++;

            index1++;
            index2++;
            index3++;

            if(index1 == 5) index1 = 0;
            if(index2 == 8) index2 = 0;
            if(index3 == 10) index3 = 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(one > two && one > three){

            list.add(1);
        }else if( two > one && two > three){
            list.add(2);
        }else if(three > one && three > two) {
            list.add(3);
        }else if(one == two && one > three) {
            list.add(1);
            list.add(2);
        }else if(two == three && two > one){
            list.add(2);
            list.add(3);
        }else if(one == three && one > two){
            list.add(1);
            list.add(3);
        }else {
            list.add(1);
            list.add(2);
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i]=list.get(i);

        return answer;
    }
}