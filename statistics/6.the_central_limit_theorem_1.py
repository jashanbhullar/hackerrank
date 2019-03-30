from math import erf
mean = 49 * 205
std = 7 * 15
ans = 0.5 *(1 + erf((9800 - mean)/(std *(2**0.5))))
print(round(ans,4))
