import numpy
n , m = map(int , input().split())
ls = []
for i in range(n):
	ls.append(list(map(int, input().split())))
ar = numpy.array(ls)
ar = numpy.min(ar, axis=1)
ar = numpy.max(ar)
print(ar)