import re
pt1 = re.compile(r"[A-Z].*[A-Z]")
pt2 = re.compile(r"[0-9].*[0-9].*[0-9]")
pt3 = re.compile(r"[0-9a-zA-Z]{10}")
pt4 = re.compile(r"([0-9a-zA-Z]).*\1")

for i in range(int(input())):
	val = input()
	if bool(pt1.search(val)):
		if bool(pt2.search(val)):
			if bool(pt3.match(val)):
				if not bool(pt4.search(val)):
					print("Valid")
					continue
	print("Invalid")