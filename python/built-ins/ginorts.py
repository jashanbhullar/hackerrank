import string
print(*sorted(input(), key=(string.ascii_letters + '1357902468').index), sep='')