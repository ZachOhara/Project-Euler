
DIGITS = ['', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine', 'ten']
TEENS = ['ten', 'eleven', 'twelve', 'thirteen', 'fourteen', 'fifteen', 'sixteen', 'seventeen', 'eighteen', 'nineteen']
MULTIPLES = ['', 'ERR', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety', 'hundred']

def main():
	totalLen = 0
	for i in range(1, 1000):
		totalLen += len(NumberWord(i))
		#print(i, NumberWord(i).getWord())
	totalLen += len('onethousand')
	print(totalLen)

class NumberWord(object):
	def __init__(self, num):
		self.ones = num % 10
		self.tens = int(num / 10 % 10)
		self.hund = int(num / 100 % 10)
		self.word = ''
		if self.hund != 0:
			self.word += DIGITS[self.hund] + 'hundred'
			if self.tens + self.ones != 0:
				self.word += 'and'
		if self.tens == 1:
			self.word += TEENS[self.ones]
		else:
			if self.tens != 0:
				self.word += MULTIPLES[self.tens]
			self.word += DIGITS[self.ones]
			
	def __len__(self):
		return len(self.word)
	
	def getWord(self):
		return self.word

if __name__ == '__main__':
	main()