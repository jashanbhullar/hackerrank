import math
mean = 100 * 2.4
std = math.sqrt(100) * 2.0
ans = 0.5 *(1 + math.erf((250 - mean)/(std *(2**0.5))))
print(round(ans,4))