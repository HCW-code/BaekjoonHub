function solution(s){
    var answer = true;
    let stack= [];
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    for(let i = 0; i < s.length; i++){
        if(s[i] == '('){
            stack.push(1);
        }else{
            if(stack.length != 0){
                stack.pop();
            }else{
                return false
            }
            
        }
        
    }

    return stack.length == 0;
}