import re
pt1 = re.compile(r"[456][0-9]{3}\-?[0-9]{4}\-?[0-9]{4}\-?[0-9]{4}$")
pt2 = re.compile(r"([0-9])\1{3}")
for i in range(int(input())):
	val = input()
	if bool(pt1.match(val)):
		val = val.replace("-","")
		if not bool(pt2.search(val)):
			print("Valid")
			continue
	print("Invalid")