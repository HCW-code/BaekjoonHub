function solution(sizes) {
    var answer = 0;
    let h_max = 0;
    let l_max = 0;
    for(let i =0; i < sizes.length; i++){
        sizes[i].sort((a,b) => a-b);
        h_max = Math.max(h_max, sizes[i][0]);
        l_max = Math.max(l_max, sizes[i][1]);
    }
    answer = h_max * l_max;
    return answer;
}