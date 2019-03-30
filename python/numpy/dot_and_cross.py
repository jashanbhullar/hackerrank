import numpy
n = int(input())
ls = []
for i in range(n):
	ls.append(list(map(int, input().split())))
a = numpy.array(ls)
ls = []
for i in range(n):
	ls.append(list(map(int, input().split())))
b = numpy.array(ls)
ar = numpy.dot(a,b)
print(ar)