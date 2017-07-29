def average(ar):
	el = set(ar)
	res = sum(el)/len(el)
	return res
n = int(input())
arr = list(map(int, input().split()))
result = average(arr)
print(result)