
# This problem is unsolved
# The program works in theory, but is wayy to slow to test
# It will need to be redesigned

VALUES = (1, 2, 5, 10, 20, 50, 100, 200)

def main():
	print(possibilitiesToGoal(200))
	
def possibilitiesToGoal(goal):
	possible = possibilitiesFrom([0] * len(VALUES), goal, [])
	print(possible)
	print(len(possible))
	print(set(possible))
	return len(set(possible))

def possibilitiesFrom(wallet, goal, possibilities):
	toGo = goal - valueOf(wallet)
	if toGo == 0:
		if wallet[4] > 0: print(wallet)
		possibilities.append(wallet)
		return
	for i, value in enumerate(VALUES):
		if value <= toGo:
			newWallet = wallet[:]
			newWallet[i] += 1
			if newWallet not in possibilities:
				possibilitiesFrom(newWallet, goal, possibilities)
	return possibilities
		

def valueOf(wallet):
	return sum([ VALUES[i] * wallet[i] for i in range(len(wallet)) ])

if __name__ == "__main__":
	main()