class Solution:
    def reverse(self, x: int) -> int:
        x = str(x)
        if x[0] == '-':
            x=(x[::-1])
            x=int('-'+x[:len(x)-1])
        else:
            x=int(x[::-1])
        if x >= -2147483648 and x<= 2147483647:
            return x    
        else:
            return 0
