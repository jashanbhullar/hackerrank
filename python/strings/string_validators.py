def check(string,op):
	for i in s:
		if eval('i'+op):
			return True
	return False

s = input()
print(check(s,".isalnum()"))
print(check(s,".isalpha()"))
print(check(s,".isdigit()"))
print(check(s,".islower()"))
print(check(s,".isupper()"))