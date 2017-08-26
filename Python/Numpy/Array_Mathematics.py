import numpy
n , m = map(int , input().split())
A = []
B = []
for i in range(n):
	A.append(list(map(int, input().split())))
for i in range(n):
	B.append(list(map(int, input().split())))
A = numpy.array(A)
B = numpy.array(B)
print(A+B)
print(A-B)
print(A*B)
print(A//B)
print(A%B)
print(A**B)