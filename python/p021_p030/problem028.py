
def main():
	TERMS = 500
	center = 1
	northwest = quadSeqSum(TERMS, 9, 16, 8)
	southwest = quadSeqSum(TERMS, 3, 10, 8)
	southeast = quadSeqSum(TERMS, 5, 12, 8)
	northeast = quadSeqSum(TERMS, 7, 14, 8)
	print(sum([center, northwest, southwest, southeast, northeast]))

def quadSeqSum(terms, initial, diff1, diff2):
	seqSum = 0
	for _ in range(terms):
		#print(initial)
		seqSum += initial
		initial += diff1
		diff1 += diff2
	return seqSum

if __name__ == "__main__":
	main()
