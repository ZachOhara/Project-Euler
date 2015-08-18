from common import mathutil

def main():
	#print(canFormPandigital(192))
	pands = []
	for i in range(10000):
		p = canFormPandigital(i)
		if p:
			pands.append(p)
	print(max(pands))

def canFormPandigital(n):
	pand = ''
	i = 1
	while len(pand) < 9:
		pand += str(i * n)
		if i > 1 and mathutil.isPandigital9(pand):
			return int(pand)
		i += 1
	return None

if __name__ == "__main__":
	main()
