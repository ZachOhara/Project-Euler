from common import mathutil

def main():
	print(longestSequence(1000000))

def longestSequence(limit):
	sequences = []
	for i in range(1, limit):
		#if i % 5000 == 0:
			#print(i)
		sequences.append(len(mathutil.collatzSequence(i)))
	return sequences.index(max(sequences)) + 1

if __name__ == '__main__':
	main()