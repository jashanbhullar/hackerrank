import numpy
n , m , p = map(int , input().split())
N = []
M = []
for i in range(n):
	N.append(list(map(int , input().split())))
for i in range(m):
	M.append(list(map(int , input().split())))
N = numpy.array(N)
M = numpy.array(M)
print(numpy.concatenate((N,M), axis = 0))