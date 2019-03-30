import re
ls = list(re.findall(r'(?<=[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm])[AEIOUaeiou]{2,}[QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm]',input()))
if not ls:
	print("-1")
	exit()
for i in ls:
	print(i[:-1])