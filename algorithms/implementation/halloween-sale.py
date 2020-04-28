#!/bin/python3

import math
import os
import random
import re
import sys

def sum_n(p,d, n): 
    return math.floor(p*(n+1) - d*((n*(n+1))/2))
# Complete the howManyGames function below.
def howManyGames(p, d, m, s):
    if p > s:
        return 0

    n = math.floor((p - m)/d);
    n_sum = sum_n(p,d,n)
    if n_sum < s: 
        total = n + 1 + math.floor((s - n_sum)/m)
        return total
    else:
        for i in range(0, n):
            n_sum = sum_n(p,d,i);
            if n_sum > s:
                return i

if __name__ == '__main__':

    pdms = "20 3 6 60".split()

    p = int(pdms[0])

    d = int(pdms[1])

    m = int(pdms[2])

    s = int(pdms[3])

    answer = howManyGames(p, d, m, s)

    print(str(answer) + '\n')
