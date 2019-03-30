import numpy
n , m = map(int , input().split())
ls = []
for i in range(n):
	ls.append(list(map(int, input().split())))
ar = numpy.array(ls)
mean = numpy.mean(ar, axis=1)
var = numpy.var(ar, axis=0)
std = numpy.std(ar)
print(mean)
print(var)
print(std)