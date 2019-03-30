import math
def isPrime(num):
	for i in range(2,int(math.sqrt(num))+1):
		if num%i == 0:
			return False
	return True
for _ in range(int(input())):
	n = int(input())
	ans = 1
	num = 0
	for i in range(2,n+1):
		if isPrime(i):
			ans *= i
			if ans > n:
				break
			num += 1
	print(num)