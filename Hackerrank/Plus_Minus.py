import math
import os
import random
import re
import sys



def plusMinus(arr):
    czero = cplus = cminus = 0
    for i in arr:
        if i == 0:
            czero +=1
        elif i > 0:
            cplus += 1
        else:
            cminus += 1
    n = len(arr)
    print("{:.6f}\n{:.6f}\n{:.6f}".format(cplus/n , cminus/n , czero/n))
    

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
