import numpy
n = int(input())
ls = [] 
for i in range(n):
	ls.append(list(map(float, input().split())))
print(numpy.linalg.det(ls))
