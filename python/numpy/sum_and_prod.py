import numpy
n , m = map(int , input().split())
ls = []
for i in range(n):
	ls.append(list(map(int, input().split())))
ar = numpy.array(ls)
ar = numpy.sum(ar, axis=0)
ar = numpy.prod(ar)
print(ar)