from common import mathutil

def main():
	#print(mathutil.isPandigital(12345))
	#print(isIdentityPandigital(39, 186))
	numbers = ['1', '2', '3', '4', '5', '6', '7', '8', '9']
	panNums = []
	for a in numbers:
		for b in numbers:
			if a == b:
				continue
			for c in numbers:
				if c in (a, b):
					continue
				for d in numbers:
					if d in (a, b, c):
						continue
					for e in numbers:
						if e in (a, b, c, d):
							continue
						factor1 = a + b
						factor2 = c + d + e
						factor3 = a
						factor4 = b + c + d + e
						appendIfPandigital(panNums, factor1, factor2)
						appendIfPandigital(panNums, factor3, factor4)
	print(sum(set(panNums)))
		
def appendIfPandigital(pan, a, b):
	if isIdentityPandigital(a, b):
		pan.append(int(a) * int(b))
		
def isIdentityPandigital(a, b):
	s = a + b + str(int(a) * int(b))
	return len(s) == 9 and mathutil.isPandigital(s) == 9

if __name__ == "__main__":
	main()