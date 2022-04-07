class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        num=str(num)
        rev_1=num[::-1]
        rev_2=rev_1[::-1]
        n=int(num)
        if n==0 or n%10 != 0:
            return True
        else:
            return False
