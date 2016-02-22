from common import fileio

fileio.FILE_ADDRESS = "../../res/problem054/test.txt"

def main():
	p1wins = 0
	for match in fileio.readFileAsStrList():
		m = Matchup(match)
		print(m.getWinner())
		#if m.getWinner() == 1:
			#p1wins += 1
	#print(p1wins)
	
def test():
	h = Hand(["1S", "3S", "2S", "4S", "5S"])
	print("High card", h.getHighCard())
	print("One pair:", h.isOnePair())
	print("Two pair:",h.isTwoPair())
	print("Three of a kind:",h.isThreeOfAKind())
	print("Straight:",h.isStraight())
	print("Flush:",h.isFlush())
	print("Full house:",h.isFullHouse())
	print("Four of a kind:",h.isFourOfAKind())
	print("Straight flush:",h.isStraightFlush())
	print("Royal flush:",h.isRoyalFlush())
	
class Matchup(object):
	
	def __init__(self, cardstr):
		cards = cardstr.split()
		self.hand1 = Hand(cards[:5])
		self.hand2 = Hand(cards[5:])
		
	def getWinner(self):
		victorysets = (
				(self.hand1.isRoyalFlush(), self.hand2.isRoyalFlush()),
				(self.hand1.isStraightFlush(), self.hand2.isStraightFlush()),
				(self.hand1.isFourOfAKind(), self.hand2.isFourOfAKind()),
				(self.hand1.isFullHouse(), self.hand2.isFullHouse()),
				(self.hand1.isFlush(), self.hand2.isFlush()),
				(self.hand1.isStraight(), self.hand2.isStraight()),
				(self.hand1.isThreeOfAKind(), self.hand2.isThreeOfAKind()),
				(self.hand1.isTwoPair(), self.hand2.isTwoPair()),
				(self.hand1.isOnePair(), self.hand2.isOnePair()),
				(self.hand1.getHighCard(), self.hand2.getHighCard())
		)
		print(victorysets)
		for set in victorysets:
			if set[0] > set[1]:
				return 1
			if set[1] < set[0]:
				return 2
		return 0
	
class Hand(object):
	
	def __init__(self, cards):
		self.cards = [Card(id) for id in cards]
		self.values = [c.value for c in self.cards]
		self.valueset = list(set(self.values))
		self.suits = [c.suit for c in self.cards]
		
	def hasValue(self, n):
		return n in self.values
	
	def hasSetLength(self, n):
		return any([self.values.count(val) >= n for val in self.values])
	
	def hasSetLength(self, n):
		sortedvalues = self.valueset
		sortedvalues.sort()
		for i in sortedvalues[::-1]:
			if self.values.count(i) >= n:
				return i
		return 0
	
	# Ranking methods
	
	def getHighCard(self):
		return max(self.values)
	
	def isOnePair(self):
		return self.hasSetLength(2)
	
	def isTwoPair(self):
		valset = list(set(self.values))
		if [self.values.count(v) >= 2 for v in valset].count(True) == 2:
			return self.isOnePair()
		else:
			return 0
	
	def isThreeOfAKind(self):
		return self.hasSetLength(3)
	
	def isStraight(self):
		m = min(self.values)
		if all([self.hasValue(i) for i in range(m, m + 5)]):
			return m
		else:
			return 0
		
	def isFlush(self):
		return int(len(set(self.suits)) == 1)
	
	def isFullHouse(self):
		if self.isThreeOfAKind() and self.isTwoPair():
			return self.isThreeOfAKind()
		else:
			return 0
	
	def isFourOfAKind(self):
		return self.hasSetLength(4)
	
	def isStraightFlush(self):
		if self.isStraight() and self.isFlush():
			return min(self.values)
		else:
			return 0
		
	def isRoyalFlush(self):
		return int(self.isFlush() and all([self.hasValue(v) for v in range(10, 15)]))
	
class Card(object):
	
	def __init__(self, id):
		try:
			self.value = int(id[:1])
		except:
			self.value = 10 + ("T", "J", "Q", "K", "A").index(id[:1])
		self.suit = id[1:]
	

if __name__ == "__main__":
	main()
