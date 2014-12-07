# music festival

class Musician:
   def __init__(self, id):
      self.id = id
      self.incompatable = []
      
   def quartetMembers(self, ids):
      for i in ids:
         if i != self.id:
            self.incompatable.append(i)

class Quartet:
   def __init__(self, musicians):
      self.musicians = musicians
   
   def play(self, list):
      for i in self.musicians:
         list[i].quartetMembers(self.musicians)

class Trio:
   def __init__(self, musicians):
      self.musicians = musicians
      
   def isViable(self, musicians):
      viable = 1
      for i in self.musicians:
         for j in self.musicians:
            if j in musicians[i].incompatable:
               viable = 0
      return viable

def calculate(n): # n must be a multiple of 12
   musicians = []
   quartets = []
   for i in range(0,n,4):
      for j in range(i, i+4):
         musicians.append(Musician(j))
         #print('Musician created, id %d' % j)
      quartets.append(Quartet([i, i+1, i+2, i+3]))
      print('Quartet created, ids %d %d %d %d' % (i, i+1, i+2, i+3))
      
   for q in quartets:
      q.play(musicians)
   
   # second day:
   
   trios = []
   
   for a in range(n):
      for b in range(n):
         for c in range(n):
            if a!=b and b!=c and a !=c:
               trios.append(Trio([a,b,c]))
               
   viableTrios = 0
   print("Trios: %d" % len(trios))
   for t in trios:
      viableTrios += t.isViable(musicians)
      print("A trio with %d %d %d is viable: %d" % (t.musicians[0], t.musicians[1], t.musicians[2], t.isViable(musicians)))
      
   return viableTrios
      
if __name__ == "__main__":
   print(calculate(12))