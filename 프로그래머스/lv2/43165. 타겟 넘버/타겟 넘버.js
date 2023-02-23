function solution(numbers, target) {
    var answer = 0;
    let num_len = numbers.length;
    let result = 0;
    
    const dfs = (x, count) => {
        if(count == num_len){
            if(x == target){
                answer++;
            }
            return
        }
        dfs(x + numbers[count], count+1);
        dfs(x - numbers[count], count+1);
    }
    
    dfs(0,0)
    return answer;
}