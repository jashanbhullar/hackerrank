import re
for i in range(int(input())):
	val = input()
	print("YES") if bool(re.match('[789][0-9]{9}',val)) and len(val)==10 else print("NO")