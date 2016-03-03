from common import fileio

fileio.FILE_ADDRESS = "../../res/problem089/roman.txt"

NUMERAL_VALUES = {
	"M" : 1000,
	"D" : 500,
	"C" : 100,
	"L" : 50,
	"X" : 10,
	"V" : 5,
	"I" : 1,
}

VALUES_NUMERALS = (
	("M", 1000),
	("D", 500),
	("C", 100),
	("L", 50),
	("X", 10),
	("V", 5),
	("I", 1)
)

def main():
	numerals = fileio.readFileAsStrList()
	charsSaved = 0
	for numeral in numerals:
		print(numeral, intToNumeral(numeralToInt(numeral)))
		charsSaved += len(numeral) - len(intToNumeral(numeralToInt(numeral)))
	print(charsSaved)
	
def numeralToInt(s):
	values = [NUMERAL_VALUES[i] for i in s]
	i = values.pop(0)
	while len(values) > 0:
		if i > values[0]:
			i += values.pop(0)
		else:
			i = values.pop(0) - i
	return i

def intToNumeral(i):
	numeral = ""
	for symbol, value in VALUES_NUMERALS:
		#print(i, numeral, symbol)
		while i >= value:
			numeral += symbol
			i -= value
	return numeral

if __name__ == "__main__":
	main()
