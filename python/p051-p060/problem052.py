
def main():
	i = 1
	while multiplesWithSameDigits(i) != 6:
		i += 1
	print(i)
	
def multiplesWithSameDigits(n):
	i = 1
	while hasSameDigits(n, n * i):
		i += 1
	return i - 1

def hasSameDigits(a, b):
	alist = list(str(a))
	blist = list(str(b))
	alist.sort()
	blist.sort()
	return str(alist) == str(blist)

if __name__ == "__main__":
	main()
