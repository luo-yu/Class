

def greatest_common_divisor(a,b):
  while b>0:
	remainder = a%b
	a=b
	b=remainder
  return a

print greatest_common_divisor(315,54)