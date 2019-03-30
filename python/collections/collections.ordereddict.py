from collections import OrderedDict
od = OrderedDict()
for i in range(int(input())):
	ls = list(map(str,input().strip().split()))
	try :
		od[' '.join(ls[:-1])] += int(ls[-1])
	except :
		od[' '.join(ls[:-1])] = int(ls[-1])
for k in od:
	print(k,od[k])