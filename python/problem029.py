
def main():
	print(termsForRange(2, 100))

def termsForRange(rMin, rMax):
	terms = []
	for a in range(rMin, rMax + 1):
		if not a % 50: print(a)
		for b in range(rMin, rMax + 1):
			t = a ** b
			#if t not in terms:
			terms.append(t)
	return len(set(terms))

if __name__ == "__main__":
	main()