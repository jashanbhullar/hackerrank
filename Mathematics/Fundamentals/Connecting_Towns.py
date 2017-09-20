for _ in range(int(input())):
	n , ar = int(input()) , list(map(int,input().split()))
	ans = 1
	for i in ar:
		ans *= i
		ans = ans%1234567
	print(ans)