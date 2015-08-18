
def main():
	champ = '.' + buildChampConstant(10000000)
	print(productOfIndecies(champ, [10 ** n for n in range(7)]))
	
def productOfIndecies(seq, indecies):
	product = 1
	for i in indecies:
		product *= int(seq[i])
	return product

def buildChampConstant(digits):
	champ = ''
	i = 1
	while len(champ) < digits:
		champ += str(i)
		i += 1
	return champ

if __name__ == "__main__":
	main()