import string
def print_rangoli(size):
	ls = []
	alpha = string.ascii_lowercase
	for i in range(n):
		s = "-".join(alpha[i:n])
		ar = (s[::-1] + s[1:]).center(4*n-3,'-')
		ls.append(ar)
	print('\n'.join(ls[:0:-1]+ls))

n = int(input())
print_rangoli(n)