import re 
pt1 = re.compile('\s&&\s')
pt2 = re.compile('\s\|\|\s')
for i in range(int(input())):
	val = input();
	m = pt1.search(val)
	while m:
		val = pt1.sub(" and ",val)
		m = pt1.search(val)
	m = pt2.search(val)
	while m:
		val = pt2.sub(" or ",val)
		m = pt2.search(val)
	print(val)