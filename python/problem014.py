import common.MathUtil as MathUtil

def main():
	print(longestSequence(1000000))

def longestSequence(limit):
	sequences = []
	for i in range(1, limit):
		#if i % 1000 == 0:
			#print(i)
		sequences.append(len(MathUtil.collatzSequence(i)))
	return sequences.index(max(sequences)) + 1

if __name__ == '__main__':
	main()