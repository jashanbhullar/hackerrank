import re
val = input()
pt = re.compile(input())
m = pt.search(val)
if not m :
	print("(-1, -1)")
while m:
	print("({0}, {1})".format(m.start(), m.end()-1))
	m = pt.search(val,m.start()+1)
