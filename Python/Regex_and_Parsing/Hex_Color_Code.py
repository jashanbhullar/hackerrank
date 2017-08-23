import re 
pt = re.compile("#([0-9A-Fa-f]{6}|[0-9A-Fa-f]{3})");
flag = False
for i in range(int(input())):
	val = input()
	if "{" in val:
		flag = True
		continue
	elif "}" in val: 
		flag = False
		continue
	#print(flag)
	if flag:
		m = pt.search(val)
		#print(m)
		while m :
			print(val[m.start():m.end()])
			m = pt.search(val,m.end())