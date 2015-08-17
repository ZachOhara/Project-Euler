
FILE_ADDRESS = None

# Read a grid of numbers, seperated by spaces and newlines, as a matrix
def readFileAsMatrix():
	matrix = []
	for line in open(FILE_ADDRESS, 'r'):
		row = []
		for num in line[:-1].split(' '):
			row.append(int(num))
		matrix.append(row)
	return matrix

# Read a list of numbers, seperated by newlines, 
def readFileAsList():
	nums = []
	for line in open(FILE_ADDRESS, 'r'):
		nums.append(int(line[:-1]))
	return nums

# Read a list of words as a list of strings
def readFileAsStrList(sep="\n", quotes=False):
	singleStr = ""
	for line in open(FILE_ADDRESS, 'r'):
		singleStr += line
	strList = singleStr.split(sep)
	if quotes:
		for i in range(len(strList)):
			strList[i] = strList[i][1:-1]
	return strList

# Read a file with only newline seperations as a single list of digits
def readFileAsSequence():
	seq = []
	for line in open(FILE_ADDRESS, 'r'):
		for char in line[:-1]:
			seq.append(int(char))
	return seq