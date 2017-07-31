from collections import OrderedDict
od = OrderedDict()
for i in range(int(input())):
	word = input()
	try :
		od[word] += 1
	except :
		od[word] = 1
print(len(od))
print(' '.join(str(od[x]) for x in od))