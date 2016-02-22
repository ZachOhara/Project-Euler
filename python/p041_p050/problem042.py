from common import fileio
from common import trianglenums
from common import words

def main():
	fileio.FILE_ADDRESS = "../../res/problem042/words.txt"
	wordlist = fileio.readFileAsStrList(sep=',', quotes=True)
	triwords = []
	for w in wordlist:
		if trianglenums.isTriangleNum(words.wordSum(w)):
			triwords.append(w)
	print(len(triwords))

if __name__ == "__main__":
	main()
