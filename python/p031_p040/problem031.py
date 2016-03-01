from common import timer

VALUES = (1, 2, 5, 10, 20, 50, 100, 200)

def main():
    total = 0
    for p200 in range(0, 201, 200):
        if sum([p200]) > 200:
            break
        
        for p100 in range(0, 201, 100):
            if sum([p100, p200]) > 200:
                break
            
            for p50 in range(0, 201, 50):
                if sum([p50, p100, p200]) > 200:
                    break
                
                for p20 in range(0, 201, 20):
                    if sum([p20, p50, p100, p200]) > 200:
                        break
                
                    #print("~ ~ ~ ~", p20, p50, p100, p200)
                    
                    for p10 in range(0, 201, 10):
                        if sum([p10, p20, p50, p100, p200]) > 200:
                            break
                        
                        
                        for p5 in range(0, 201, 5):
                            if sum([p5, p10, p20, p50, p100, p200]) > 200:
                                break
                            
                            for p2 in range(0, 201, 2):
                                if sum([p2, p5, p10, p20, p50, p100, p200]) > 200:
                                    break
                                
                                for p1 in range(0, 201, 1):
                                    if sum([p1, p2, p5, p10, p20, p50, p100, p200]) > 200:
                                        break
                                    
                                    if sum([p1, p2, p5, p10, p20, p50, p100, p200]) == 200:
                                        #print(p1, p2, p5, p10, p20, p50, p100, p200)
                                        total += 1
    print(total)

if __name__ == "__main__":
	main()

# The old version
'''
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
'''