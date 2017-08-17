n = int(input())
ls = input().strip().split(' ')
#print(ls)
if(all(int(x) >= 0 for x in ls)):
	print(any(x == x[::-1] for x in ls))
else:
	print('False')