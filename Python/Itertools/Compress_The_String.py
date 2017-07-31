from itertools import groupby

data = input()
ls = []
for k, g in groupby(data):
	ls.append('('+str(len(list(g)))+', '+str(k)+')')
print(' '.join(map(str,ls)))