
def sequenceTo(gen, limit):
	seq = []
	for i in gen():
		if i >= limit:
			return seq
		seq.append(i)
		
def sequenceTerms(gen, terms):
	seq = []
	for i in gen():
		seq.append(i)
		if len(seq) == terms:
			return seq
		
def sequenceContains(gen, n):
	for i in gen():
		if n == i:
			return True
		if i > n:
			return False
		