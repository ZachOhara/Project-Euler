import atexit
import time

startTime = time.time()

def stopTimer():
    print("Found in %.4f s " % (time.time() - startTime))
    
atexit.register(stopTimer)
