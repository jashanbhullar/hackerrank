k = int(input())
ls = list(map(int,input().split()))
st = set(ls)
for i in st:
	n = ls.index(i)+1
	try:
		ls.index(i,n)
	except ValueError :
		print(i)
		break