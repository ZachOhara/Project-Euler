from common import fileio

def main():
	fileio.FILE_ADDRESS = "../../res/problem022/names.txt"
	names = fileio.readFileAsStrList(sep=',', quotes=True)
	scoreSum = 0
	names.sort()
	for i, name in enumerate(names):
		scoreSum += (i+1) * alphaSum(name)
	print(scoreSum)
	
def alphaSum(word):
	return sum([alphaPos(char) for char in word.lower()])
	
def alphaPos(char):
	return ord(char) - 96

if __name__ == "__main__":
	main()