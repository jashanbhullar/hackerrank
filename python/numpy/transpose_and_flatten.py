import numpy
n , m = map(int ,input().split())
ls = []
for i in range(n):
	ls.append(list(map(int , input().split())))
ar = numpy.array(ls)
print(numpy.transpose(ar))
print(ar.flatten())