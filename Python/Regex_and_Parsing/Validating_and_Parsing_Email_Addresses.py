import re
pt = re.compile("[a-zA-Z][a-zA-Z0-9-\._]*@[a-zA-Z]*\.[a-zA-Z]{1,3}$")
for i in range(int(input())):
	val = input()
	user , email = val.split(' ')
	if bool(pt.match(email[1:-1])):
		print(val)
