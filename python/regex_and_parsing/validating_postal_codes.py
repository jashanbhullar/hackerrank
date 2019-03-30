import re
pt1 = re.compile(r"[123456789][0-9]{5}$")
pt2 = re.compile(r"([0-9])(?=.\1)")
val = input()
ls = []
ls.append(bool(pt1.match(val)))
ans = pt2.search(val)
try :
	ls.append(not bool(pt2.search(val,ans.end())))
except Exception:
	ls.append(True)
print(all(ls))
