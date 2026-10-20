class Solution {
  public int evalRPN(String[] tokens) {
    if(tokens.length==1) return Integer.valueOf(tokens[0]);
    int i = 0;
    Deque<Integer> dq = new ArrayDeque<>();
    int ans = 0;

    while (i < tokens.length) {
        String str=tokens[i];
      while (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") ) {
        dq.push(Integer.valueOf(str));
        i++;
        if(i<tokens.length)str=tokens[i];
      }
      String op = tokens[i];
      int num1 = dq.pop();
      int num2 = dq.pop();
      switch (op) {
        case "+" -> {
          ans = num2 + num1;
          dq.push(ans);
        }
        case "-" -> {
          ans = num2 - num1;
          dq.push(ans);
        }
        case "*" -> {
          ans = num2 * num1;
          dq.push(ans);
        }
        case "/" -> {
          ans = num2 / num1;
          dq.push(ans);
        }
      }
      i++;
    }

    return ans;
  }
}