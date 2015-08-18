import decimal

nrf = []

def main():
	# determined experimentally: 6402 decimal places is enough to solve the problem
	decimal.getcontext().prec = 6402
	print(longestCycleUnder(1000))
	#print("not found: ", len(nrf))

def longestCycleUnder(limit):
	cycles = []
	start = 2
	for i in range(start, limit):
		cycles.append(getCycle(i))
	return cycles.index(max(cycles)) + start
		
def getCycle(n):
	result = str(decimal.Decimal(1) / decimal.Decimal(n))[2:]
	for i in range(1, int(len(result) / 4)):
		if result[:i] == result[i:2*i] == result[2*i:3*i] == result[3*i:4*i]:
			return i
	if len(result) < 4:
		return 1
	#print("No result for", n)
	nrf.append(n)
	return -1

if __name__ == "__main__":
	main()