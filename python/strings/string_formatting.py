def print_formatted(n):
	val = len(format(n,'b')) +  1
	for i in range (1,n+1) :
		print(format(i,'d').rjust(val,' ')+format(i,'o').rjust(val,' ')+format(i,'X').rjust(val,' ')+format(i,'b').rjust(val,' '))

n = int(input())
print_formatted(n)
