import numpy 
n = int(input())
ls = list(map(int,input().split()))
print(numpy.mean(ls))
print(numpy.median(ls))
print(numpy.bincount(ls).argmax())