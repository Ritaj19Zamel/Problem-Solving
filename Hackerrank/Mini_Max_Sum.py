import math
import os
import random
import re
import sys


def miniMaxSum(arr):
    arr.sort()
    sum_min = sum_max=0
    for i in range(0,(len(arr)-1)):
        sum_min +=arr[i]
    for i in range(1,len(arr)):
        sum_max += arr[i]
    return sum_min,sum_max

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    min = miniMaxSum(arr)[0]
    max = miniMaxSum(arr)[1]
    print(min , max)
