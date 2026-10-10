class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I',1);        m.put('V',5);        m.put('X',10);        m.put('L',50);
        m.put('C',100);        m.put('D',500);        m.put('M',1000);
        int answer = 0;
        for(int i=0;i<s.length()-1;i++){
            int currentVal = m.get(s.charAt(i));
            int nextVal = m.get(s.charAt(i+1));
            if(currentVal<nextVal){
                answer -= currentVal;
            }else{
                answer += currentVal;
            }
        }
        answer += m.get(s.charAt(s.length()-1));    
        return answer;
    }
}