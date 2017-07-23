n = int(input())
li = []

for _ in range (0,n):
	s = input().split()
	op = s[0]
	par = s[1:]
	if op != "print":
		op += "("+",".join(par)+")"
		eval("li."+op)
	else:
		print(li)